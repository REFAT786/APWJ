package com.service;

import com.domain.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> list();

    public boolean insert(Customer customer);

    public Customer get(Long id);

    public boolean update(Customer customer);

    public boolean delete(Long id);
}
