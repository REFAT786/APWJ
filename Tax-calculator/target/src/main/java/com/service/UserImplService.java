package com.service;

import com.domain.Taxcalculator;
import com.domain.User;
import com.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserImplService implements UserService{

    private UserRepository userRepository;

    public UserImplService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public boolean insert(User user) {
        user.setUsername(user.getUsername());
        user.setPassword(user.getPassword());
        user.setGender(user.getGender());
        return userRepository.create(user);
    }

    @Transactional(readOnly = true)
    public List<User> list() {
        return userRepository.list();
    }

    @Transactional(readOnly = true)
    public User get(Long id) {
        return userRepository.get(id);
    }

    @Transactional
    public boolean update(User user) {
        user.setId(user.getId());
        user.setUsername(user.getUsername());
        user.setPassword(user.getPassword());
        user.setGender(user.getGender());

        /* if (leaveApplication.getTotalDays() <= leaveApplication.getLeaveType().getTotalDays()) {*/
        return userRepository.update(user);
        /*}
        return false;*/
    }



    @Transactional
    public boolean delete(Long id) {
        userRepository.delete(id);
        return true;
    }

}
