package com.kaarvik.gym.service;

import com.kaarvik.gym.model.User;
import com.kaarvik.gym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User register(final User user) {
        return userRepository.save(user);
    }
}
