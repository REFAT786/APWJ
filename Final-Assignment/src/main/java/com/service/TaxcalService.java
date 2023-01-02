package com.service;

import com.domain.Taxcalculator;

import java.util.List;

public interface TaxcalService {
    public boolean insert(Taxcalculator taxcalculator);
    public List<Taxcalculator> list();
    public Taxcalculator get(Long id);
}
