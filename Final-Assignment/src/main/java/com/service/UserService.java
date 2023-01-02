package com.service;

import com.domain.User;

import java.util.List;

public interface UserService {
    public boolean insert(User user);
    public List<User> list();
    public User get(Long id);
    public boolean update(User user);
    public boolean delete(Long id);
}
