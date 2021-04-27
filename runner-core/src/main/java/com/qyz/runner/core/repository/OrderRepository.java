package com.qyz.runner.core.repository;

import com.qyz.runner.core.domain.Customer;
import com.qyz.runner.core.domain.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    public Page<Order> findByCreator(Customer creator, Pageable pageable);

    public Page<Order> findByDesignee(Customer designee, Pageable pageable);
}
