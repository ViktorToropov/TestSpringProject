package com.example.TestSpringProject.repo;

import com.example.TestSpringProject.Sales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SalesRepositoryJpa extends CrudRepository<Sales, Long> {//jpa
    List<Sales> findBySum(int identif);
}
