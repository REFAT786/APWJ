package com.service;

import com.controller.CustomerController;
import com.domain.Customer;
import com.repository.CustomerRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.PrivateKey;
import java.util.List;

@Service
@Transactional
public class CustomerImplService implements CustomerService{

    private CustomerRepository customerRepository;

    public CustomerImplService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }


    @Transactional(readOnly = true)
    public List<Customer> list() {
        return customerRepository.list();
    }

    @Transactional
    public boolean insert(Customer customer){

        customer.setName(customer.getName());
        customer.setUsername(customer.getUsername());
        customer.setPassword(customer.getPassword());
        customer.setGender(customer.getGender());

        return customerRepository.create(customer);

    }
    @Transactional(readOnly = true)
    public Customer get(Long id){
        return customerRepository.get(id);
    }
    @Transactional
    public boolean update(Customer customer){

        return customerRepository.update(customer);
    }
    @Transactional
    public boolean delete(Long id){
        customerRepository.delete(id);
        return true;
    }
}
