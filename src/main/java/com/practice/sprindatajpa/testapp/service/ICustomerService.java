package com.practice.sprindatajpa.testapp.service;

import com.practice.sprindatajpa.testapp.entity.Customer;

public interface ICustomerService {
    Customer getCustomer(int id);
    Customer createCustomer(Customer c);
    Customer updateCustomer(Customer c);
    Customer deleteCustomer(Customer c);
}
