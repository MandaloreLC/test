package com.example.magidash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.time.Instant;

@SpringBootApplication
public class MagidashApplication {

    public MagidashApplication(DashboardsRepository repository) {
        Dashboard dashboard = new Dashboard();
        dashboard.setTitle("test");
        dashboard.setCreatedAt(Timestamp.from(Instant.now()));
        dashboard.setUpdatedAt(Timestamp.from(Instant.now()));
        repository.save(dashboard);
    }

    public static void main(String[] args) {
        SpringApplication.run(MagidashApplication.class, args);
    }
}
