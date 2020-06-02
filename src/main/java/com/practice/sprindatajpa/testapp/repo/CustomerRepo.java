package com.practice.sprindatajpa.testapp.repo;

import com.practice.sprindatajpa.testapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CustomerRepo extends JpaRepository<Customer, Integer> {
}
