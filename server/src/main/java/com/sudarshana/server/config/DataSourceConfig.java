package com.sudarshana.server.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@Configuration
@Conditional(DataSourceConfig.DatabaseRequired.class)
public class DataSourceConfig {

    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    static class DatabaseRequired implements org.springframework.context.annotation.Condition {
        @Override
        public boolean matches(org.springframework.context.annotation.ConditionContext context, AnnotatedTypeMetadata metadata) {
            String databaseUrl = context.getEnvironment().getProperty("DATABASE_URL");
            if (databaseUrl != null && !databaseUrl.isEmpty()) {
                return true;
            }
            String host = context.getEnvironment().getProperty("DB_HOST");
            return host != null && !host.isEmpty();
        }
    }

    @Bean
    public DataSource dataSource(Environment env) {
        String url = null;
        String username = null;
        String password = null;

        String databaseUrl = env.getProperty("DATABASE_URL");
        if (databaseUrl != null && !databaseUrl.isEmpty()) {
            if (databaseUrl.startsWith("postgres://") || databaseUrl.startsWith("postgresql://")) {
                try {
                    // Render/Heroku connection string format: postgresql://username:password@host:port/databaseName
                    URI dbUri = new URI(databaseUrl);
                    String userInfo = dbUri.getUserInfo();
                    if (userInfo != null && userInfo.contains(":")) {
                        String[] credentials = userInfo.split(":");
                        username = credentials[0];
                        password = credentials[1];
                    } else {
                        username = env.getProperty("SPRING_DATASOURCE_USERNAME", env.getProperty("DATABASE_USERNAME", ""));
                        password = env.getProperty("SPRING_DATASOURCE_PASSWORD", env.getProperty("DATABASE_PASSWORD", ""));
                    }
                    int port = dbUri.getPort();
                    String portStr = port == -1 ? "" : ":" + port;
                    url = "jdbc:postgresql://" + dbUri.getHost() + portStr + dbUri.getPath();
                    
                    // Support optional query params (like sslmode=require)
                    String query = dbUri.getQuery();
                    if (query != null && !query.isEmpty()) {
                        url += "?" + query;
                    }
                    logger.info("DataSource: Parsed postgres/postgresql DATABASE_URL successfully.");
                } catch (URISyntaxException e) {
                    logger.error("Error parsing DATABASE_URL: {}", e.getMessage());
                    // fallback to prepend jdbc:
                    url = "jdbc:" + databaseUrl;
                }
            } else if (databaseUrl.startsWith("jdbc:")) {
                url = databaseUrl;
                username = env.getProperty("SPRING_DATASOURCE_USERNAME", env.getProperty("DATABASE_USERNAME", ""));
                password = env.getProperty("SPRING_DATASOURCE_PASSWORD", env.getProperty("DATABASE_PASSWORD", ""));
            } else {
                url = "jdbc:" + databaseUrl;
                username = env.getProperty("SPRING_DATASOURCE_USERNAME", env.getProperty("DATABASE_USERNAME", ""));
                password = env.getProperty("SPRING_DATASOURCE_PASSWORD", env.getProperty("DATABASE_PASSWORD", ""));
            }
            logger.info("DataSource: using DATABASE_URL");
        } else {
            String host = env.getProperty("DB_HOST");
            String port = env.getProperty("DB_PORT", "5432");
            String name = env.getProperty("DB_NAME", "sudarshana");
            url = "jdbc:postgresql://" + host + ":" + port + "/" + name;
            username = env.getProperty("SPRING_DATASOURCE_USERNAME", "");
            password = env.getProperty("SPRING_DATASOURCE_PASSWORD", "");
            logger.info("DataSource: using DB_HOST={}", host);
        }

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        if (username != null) {
            config.setUsername(username);
        }
        if (password != null) {
            config.setPassword(password);
        }
        config.setDriverClassName("org.postgresql.Driver");
        config.setMaximumPoolSize(20);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60000);
        config.setMaxLifetime(1800000);
        config.setConnectionTimeout(30000);
        return new HikariDataSource(config);
    }
}
