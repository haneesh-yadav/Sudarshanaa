package com.sudarshana.server.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.sql.DataSource;

@Configuration
@Conditional(DataSourceConfig.DatabaseRequired.class)
public class DataSourceConfig {

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
        String url;
        String username;
        String password;

        String databaseUrl = env.getProperty("DATABASE_URL");
        if (databaseUrl != null && !databaseUrl.isEmpty()) {
            if (databaseUrl.startsWith("jdbc:")) {
                url = databaseUrl;
            } else {
                url = "jdbc:" + databaseUrl;
            }
            username = env.getProperty("SPRING_DATASOURCE_USERNAME", env.getProperty("DATABASE_USERNAME", ""));
            password = env.getProperty("SPRING_DATASOURCE_PASSWORD", env.getProperty("DATABASE_PASSWORD", ""));
            System.out.println("[Sudarshana] DataSource: using DATABASE_URL");
        } else {
            String host = env.getProperty("DB_HOST");
            String port = env.getProperty("DB_PORT", "5432");
            String name = env.getProperty("DB_NAME", "sudarshana");
            url = "jdbc:postgresql://" + host + ":" + port + "/" + name;
            username = env.getProperty("SPRING_DATASOURCE_USERNAME", "");
            password = env.getProperty("SPRING_DATASOURCE_PASSWORD", "");
            System.out.println("[Sudarshana] DataSource: using DB_HOST=" + host);
        }

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName("org.postgresql.Driver");
        config.setMaximumPoolSize(20);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60000);
        config.setMaxLifetime(1800000);
        config.setConnectionTimeout(30000);
        return new HikariDataSource(config);
    }
}
