package com.kaarvik.gym.service;

import com.kaarvik.gym.model.User;
import com.kaarvik.gym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public User register(final User user) {
        return userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public User login() {

        return null;
    }
}
