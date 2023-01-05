package com.repository;

import com.domain.User;

import java.util.List;

public interface UserRepository {
    public List<User> list();
    public boolean create(User user);
    public User get(Long id);
    public boolean  update(User employee);
    public boolean delete(Long id);

}
