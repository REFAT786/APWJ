package com.repository;

import com.domain.Taxcalculator;

import java.util.List;

public interface TaxcalRepository {
    public List<Taxcalculator> list();
    public boolean create(Taxcalculator taxcalculator);
    public Taxcalculator get(Long id);
}
