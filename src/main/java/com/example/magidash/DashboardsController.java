package com.example.magidash;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardsController {

    private final DashboardsRepository repository;

    DashboardsController(DashboardsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/dashboards")
    List<Dashboard> getAllDashboards() {
        return repository.findAll();
    }
}
