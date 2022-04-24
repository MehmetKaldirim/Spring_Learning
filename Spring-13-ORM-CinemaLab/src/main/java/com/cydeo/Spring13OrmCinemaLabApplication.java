package com.cydeo;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.output.MigrateResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class Spring13OrmCinemaLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring13OrmCinemaLabApplication.class, args);
    }

    @Bean //first entity created than make migration since my table is not ready, i say flysearch database
    public MigrateResult migrateResult(DataSource dataSource) {
        return Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
    }
}
