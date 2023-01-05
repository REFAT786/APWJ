package com.repository;

import com.domain.CustomizePackage;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomizePackageRepositoryImpl implements CustomizePackageRepository{
    private SessionFactory sessionFactory;

    public CustomizePackageRepositoryImpl(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    public List<CustomizePackage> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<CustomizePackage> customizePackageQuery = session.createQuery("from CustomerPackage", CustomizePackage.class);
        return customizePackageQuery.getResultList();
    }

    public CustomizePackage create(CustomizePackage customizePackage) {
        Session session = sessionFactory.getCurrentSession();
        session.save(customizePackage);
        return customizePackage;
    }

    public CustomizePackage get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(CustomizePackage.class, id);
    }

    public CustomizePackage update(CustomizePackage customizePackage) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customizePackage);
        return customizePackage;
    }

    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        CustomizePackage customizePackage = get(id);
        if (customizePackage != null) {
            session.delete(customizePackage);
        }
    }
}
