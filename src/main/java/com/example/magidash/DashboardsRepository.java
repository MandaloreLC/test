package com.example.magidash;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DashboardsRepository extends JpaRepository<Dashboard, Long> {}
