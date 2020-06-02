package com.practice.sprindatajpa.testapp.controller;

import com.practice.sprindatajpa.testapp.entity.Customer;
import com.practice.sprindatajpa.testapp.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test-app/customer")
public class CustomerController {

    private final ICustomerService customerService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> getCustomer(@RequestParam int id) {
        Customer c = customerService.getCustomer(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer c) {
        Customer nc = customerService.createCustomer(c);
        return new ResponseEntity<>(nc, HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer c) {
        Customer nc = customerService.updateCustomer(c);
        return new ResponseEntity<>(nc, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Customer> deleteCustomer(@RequestBody Customer c) {
        Customer nc = customerService.deleteCustomer(c);
        return new ResponseEntity<>(nc, HttpStatus.OK);
    }
}
