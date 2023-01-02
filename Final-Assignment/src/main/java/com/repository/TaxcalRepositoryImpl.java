package com.repository;

import com.domain.Taxcalculator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TaxcalRepositoryImpl implements TaxcalRepository {
    private SessionFactory sessionFactory;

    public TaxcalRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Taxcalculator> list() {
        Session session = sessionFactory.getCurrentSession();
        Query<Taxcalculator> taxcalculatorQuery = session.createQuery("from Taxcalculator", Taxcalculator.class);
        return taxcalculatorQuery.getResultList();
    }

    public boolean create(Taxcalculator taxcalculator) {
        Session session = sessionFactory.getCurrentSession();
        session.save(taxcalculator);
        return true;
    }

    public Taxcalculator get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Taxcalculator.class, id);
    }
}
