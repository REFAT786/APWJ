package com.repository;

import com.domain.CustomizePackage;

import java.util.List;

public interface CustomizePackageRepository {

    public List<CustomizePackage> list();
    public boolean create(CustomizePackage customizePackage);
    public  CustomizePackage get(Long id);
    public boolean delete(Long id);
}
