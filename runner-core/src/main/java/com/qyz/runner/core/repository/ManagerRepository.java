package com.qyz.runner.core.repository;

import com.qyz.runner.core.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

    public Manager findByUsernameAndPassword(String username, String password);
}
