package com.service;

import com.domain.Authority;
import com.domain.Taxcalculator;
import com.repository.TaxcalRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaxcalImplService implements TaxcalService{
    private TaxcalRepository taxcalRepository;

    public TaxcalImplService(TaxcalRepository taxcalRepository) {
        this.taxcalRepository = taxcalRepository;
    }

    @Transactional
    public boolean insert(Taxcalculator taxcalculator) {
        taxcalculator.setCatagory(taxcalculator.getCatagory());
        taxcalculator.setZone(taxcalculator.getZone());
        taxcalculator.setGsalary(taxcalculator.getGsalary());
        taxcalculator.setSalary(taxcalculator.getSalary());
        taxcalculator.setRent(taxcalculator.getRent());
        taxcalculator.setMedical(taxcalculator.getMedical());
        taxcalculator.setConveyance(taxcalculator.getConveyance());
        taxcalculator.setOthers(taxcalculator.getOthers());
        taxcalculator.setTotal(taxcalculator.getTotal());
        taxcalculator.setSalarytaxable(taxcalculator.getSalarytaxable());
        taxcalculator.setRenttaxable(taxcalculator.getRenttaxable());
        taxcalculator.setMedicaltaxable(taxcalculator.getMedicaltaxable());
        taxcalculator.setConveyancetaxable(taxcalculator.getConveyancetaxable());
        taxcalculator.setOtherstaxable(taxcalculator.getOtherstaxable());
        taxcalculator.setTotaltaxable(taxcalculator.getTotaltaxable());
        taxcalculator.setMonthly(taxcalculator.getMonthly());
        return taxcalRepository.create(taxcalculator);
    }
    @Transactional(readOnly = true)
    public List<Taxcalculator> list() {
        return taxcalRepository.list();
    }


    @Transactional(readOnly = true)
    public Taxcalculator get(Long id) {
        return taxcalRepository.get(id);
    }

}
