package com.repository;

import com.domain.Customer;
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
    @Override
    public List<CustomizePackage> list() {
        Session session=sessionFactory.getCurrentSession();
        Query<CustomizePackage> customizePackageQuery=session.createQuery("from CustomizePackage ", CustomizePackage.class);
        return customizePackageQuery.getResultList();
    }

    public boolean create(CustomizePackage customizePackage){
        Session session= sessionFactory.getCurrentSession();
        session.save(customizePackage);
        return true;
    }
    public  CustomizePackage get(Long id){
        Session session=sessionFactory.getCurrentSession();
        return session.get(CustomizePackage.class, id);
    }
    public boolean delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        CustomizePackage customizePackage =session.get(CustomizePackage.class, id);
        session.delete(customizePackage);
        return true;
    }


}
