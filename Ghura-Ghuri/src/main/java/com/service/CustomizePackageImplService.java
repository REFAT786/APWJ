package com.service;

import com.domain.CustomizePackage;
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
    @Transactional
    public CustomizePackage insert(CustomizePackage customizePackage) {
        return customizePackageRepository.create(customizePackage);
    }

    @Transactional(readOnly = true)
    public CustomizePackage get(Long id) {
        return customizePackageRepository.get(id);
    }

    @Transactional(readOnly = true)
    public List<CustomizePackage> getAll() {
        return customizePackageRepository.getAll();
    }

    @Transactional
    public CustomizePackage update(CustomizePackage customizePackage) {
        return customizePackageRepository.update(customizePackage);
    }

    @Transactional
    public void delete(Long id) {
        customizePackageRepository.delete(id);
    }
}
