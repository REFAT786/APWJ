package com.service;

import com.domain.Customer;
import com.domain.CustomizePackage;
import com.repository.CustomerRepository;
import com.repository.CustomizePackageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomizePackageImplService implements CustomizePackageService{

    private CustomizePackageRepository customizePackageRepository;

    public CustomizePackageImplService(CustomizePackageRepository customizePackageRepository){
        this.customizePackageRepository=customizePackageRepository;
    }
    @Transactional(readOnly = true)
    public List<CustomizePackage> list() {
        return customizePackageRepository.list();
    }

    @Transactional
    public boolean insert(CustomizePackage customizePackage){

        customizePackage.setPlace(customizePackage.getPlace());
        customizePackage.setPerson(customizePackage.getPerson());
        customizePackage.setTransportation(customizePackage.getTransportation());
        customizePackage.setCost(customizePackage.getCost());

        return customizePackageRepository.create(customizePackage);

    }
    @Transactional(readOnly = true)
    public CustomizePackage get(Long id){
        return customizePackageRepository.get(id);
    }

    @Transactional
    public boolean delete(Long id) {
        customizePackageRepository.delete(id);
        return true;
    }

}
