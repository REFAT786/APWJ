package com.repository;

import com.domain.CustomizePackage;

import java.util.List;

public interface CustomizePackageRepository {

    public List<CustomizePackage> getAll();
    public CustomizePackage create(CustomizePackage customizePackage);
    public CustomizePackage get(Long id);
    public CustomizePackage update(CustomizePackage customizePackage);
    public void delete(Long id);
}
