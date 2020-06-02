package com.practice.sprindatajpa.testapp.service.impl;

import com.practice.sprindatajpa.testapp.entity.Customer;
import com.practice.sprindatajpa.testapp.exception.CustomerNotFoundException;
import com.practice.sprindatajpa.testapp.exception.Error;
import com.practice.sprindatajpa.testapp.repo.CustomerRepo;
import com.practice.sprindatajpa.testapp.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerRepo repo;

    @Override
    public Customer getCustomer(int id) {
        return repo.findById(id).orElseThrow(()->new CustomerNotFoundException("Customer not found for id: "+id,Error.CUSTOMER_NOT_FOUND));
    }

    @Override
    public Customer createCustomer(Customer c) {
        return repo.save(c) ;
    }

    @Override
    public Customer updateCustomer(Customer c) {
        return repo.save(c);
    }

    @Override
    public Customer deleteCustomer(Customer c) {
         repo.deleteById(c.getCustid());

        return c;
    }
}
