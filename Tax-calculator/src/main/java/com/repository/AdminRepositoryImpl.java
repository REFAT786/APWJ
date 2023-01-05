package com.repository;

import com.domain.Admin;
import com.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminRepositoryImpl implements AdminRepository{

    private SessionFactory sessionFactory;

    public AdminRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Admin> list() {
        Session session = sessionFactory.getCurrentSession();
        Query<Admin> adminQuery = session.createQuery("from Admin", Admin.class);
        return adminQuery.getResultList();
    }

    public boolean create(Admin admin) {
        Session session = sessionFactory.getCurrentSession();
        session.save(admin);
        return true;
    }

    public Admin get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Admin.class, id);
    }
    public boolean delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Admin admin =session.get(Admin.class, id);
        session.delete(admin);
        return true;
    }


}
