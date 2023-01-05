package com.service;

import com.domain.Admin;
import com.domain.User;

import java.util.List;

public interface AdminService {
    public boolean insert(Admin admin);
    public List<Admin> list();
    public Admin get(Long id);
    public boolean delete(Long id);
}
