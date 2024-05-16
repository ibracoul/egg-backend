package com.backend.egg.service;

import com.backend.egg.entity.User;
import com.backend.egg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User addClient(User user){
        return userRepository.save(user);

    }
}
