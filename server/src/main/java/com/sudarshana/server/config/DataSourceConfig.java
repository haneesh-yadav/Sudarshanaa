package com.sudarshana.server.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.sql.DataSource;

@Configuration
@Conditional(DataSourceConfig.DatabaseHostPresent.class)
public class DataSourceConfig {

    static class DatabaseHostPresent implements org.springframework.context.annotation.Condition {
        @Override
        public boolean matches(org.springframework.context.annotation.ConditionContext context, AnnotatedTypeMetadata metadata) {
            String host = context.getEnvironment().getProperty("DB_HOST");
            return host != null && !host.isEmpty();
        }
    }

    @Bean
    public DataSource dataSource() {
        String dbHost = System.getenv("DB_HOST");
        String dbPort = System.getenv("DB_PORT");
        String dbName = System.getenv("DB_NAME");
        String dbUser = System.getenv("SPRING_DATASOURCE_USERNAME");
        String dbPass = System.getenv("SPRING_DATASOURCE_PASSWORD");

        String url = "jdbc:postgresql://" + dbHost + ":" + dbPort + "/" + dbName;
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(dbUser);
        config.setPassword(dbPass);
        config.setDriverClassName("org.postgresql.Driver");
        config.setMaximumPoolSize(20);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60000);
        config.setMaxLifetime(1800000);
        config.setConnectionTimeout(30000);
        return new HikariDataSource(config);
    }
}
