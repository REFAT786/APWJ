package com.repository;

import com.domain.Admin;
import com.domain.User;

import java.util.List;

public interface AdminRepository {
    public List<Admin> list();
    public boolean create(Admin admin);
    public Admin get(Long id);
    public boolean delete(Long id);

}
