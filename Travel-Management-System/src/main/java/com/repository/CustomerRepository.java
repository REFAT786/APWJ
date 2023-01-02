package com.repository;

import com.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> list();

    public boolean create(Customer customer);

    public  Customer get(Long id);

    public boolean update(Customer customer);

    public boolean delete(Long id);
}
