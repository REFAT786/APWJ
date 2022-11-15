package com.repository;
import com.domain.Employee;
import com.domain.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private SessionFactory sessionFactory;


    public EmployeeRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Employee> list() throws SQLException {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> employeeQuery = session.createQuery("from Employee", Employee.class);
        return employeeQuery.getResultList();
    }

    public boolean create(Employee employee) throws SQLException {
        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
        return true;
    }

    public Student get(Long id) throws SQLException {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

}
