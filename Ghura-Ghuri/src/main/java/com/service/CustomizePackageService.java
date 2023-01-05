package com.service;

import com.domain.CustomizePackage;

import java.util.List;

public interface CustomizePackageService {
    public CustomizePackage insert(CustomizePackage customizePackage);
    public CustomizePackage get(Long id);
    public List<CustomizePackage> getAll();
    public CustomizePackage update(CustomizePackage customizePackage);
    public void delete(Long id);
}
