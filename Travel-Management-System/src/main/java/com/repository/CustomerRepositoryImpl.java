package com.repository;

import com.domain.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

    private SessionFactory sessionFactory;

    public CustomerRepositoryImpl(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    @Override
    public List<Customer> list() {
        Session session=sessionFactory.getCurrentSession();
        Query<Customer>customerQuery=session.createQuery("from Customer ", Customer.class);
        return customerQuery.getResultList();
    }

    public boolean create(Customer customer){
        Session session= sessionFactory.getCurrentSession();
        session.save(customer);
        return true;
    }
    public  Customer get(Long id){
        Session session=sessionFactory.getCurrentSession();
        return session.get(Customer.class, id);
    }
    public boolean update(Customer customer){
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
        return true;
    }
    public boolean delete(Long id){
        Session session=sessionFactory.getCurrentSession();
        Customer customer=session.get(Customer.class, id);
        session.delete(id);
        return true;
    }
}
