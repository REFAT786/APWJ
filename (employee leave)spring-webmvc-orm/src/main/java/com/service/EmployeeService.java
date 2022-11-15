package com.service;


import com.domain.Employee;
import com.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@Transactional

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Transactional
    public boolean insert(Employee employee) throws SQLException {
        employee.setFirstname("Mahfujar Rahman".toUpperCase());
        employee.setLastname("Refat".toUpperCase());
        employee.setGender("Male");
        employee.setEmail("mahfujar786@gmail.com");
        employee.setJoinDate("12/5/2022");
        employee.setStatus("Active");
        return employeeRepository.create(employee);
    }




}




