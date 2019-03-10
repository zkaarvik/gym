package com.kaarvik.gym.service;

import com.kaarvik.gym.model.user.ApplicationUser;
import com.kaarvik.gym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public ApplicationUser register(final ApplicationUser applicationUser) {
        applicationUser.setPassword(bCryptPasswordEncoder.encode(applicationUser.getPassword()));

        return userRepository.save(applicationUser);
    }

    @Transactional(readOnly = true)
    public ApplicationUser login() {

        return null;
    }
}
