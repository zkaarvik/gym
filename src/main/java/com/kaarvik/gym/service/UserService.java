package com.kaarvik.gym.service;

import com.kaarvik.gym.model.user.ApplicationUser;
import com.kaarvik.gym.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public ApplicationUser register(final ApplicationUser applicationUser) {
        applicationUser.setPassword(bCryptPasswordEncoder.encode(applicationUser.getPassword()));

        return applicationUserRepository.save(applicationUser);
    }

    @Transactional(readOnly = true)
    public ApplicationUser login() {

        return null;
    }
}
