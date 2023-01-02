package com.service;

import com.domain.CustomizePackage;

import java.util.List;

public interface CustomizePackageService {
    public List<CustomizePackage> list();
    public boolean insert(CustomizePackage customizePackage);
    public CustomizePackage get(Long id);
    public boolean delete(Long id);
}
