package com.service;

import com.domain.Admin;
import com.domain.User;
import com.repository.AdminRepository;
import com.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminImplService implements AdminService{

    private AdminRepository adminRepository;

    public AdminImplService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Transactional
    public boolean insert(Admin admin) {
        admin.setUsername(admin.getUsername());
        admin.setPassword(admin.getPassword());
        return adminRepository.create(admin);
    }
    @Transactional(readOnly = true)
    public List<Admin> list() {
        return adminRepository.list();
    }

    @Transactional(readOnly = true)
    public Admin get(Long id) {
        return adminRepository.get(id);
    }

    @Transactional
    public boolean delete(Long id) {
        adminRepository.delete(id);
        return true;
    }

}
