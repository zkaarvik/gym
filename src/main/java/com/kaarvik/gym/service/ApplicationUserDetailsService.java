package com.kaarvik.gym.service;

import com.kaarvik.gym.model.user.ApplicationUser;
import com.kaarvik.gym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
        final ApplicationUser applicationUser = userRepository.findByEmail(email);

        if (applicationUser == null) {
            throw new UsernameNotFoundException(email);
        }

        return new User(applicationUser.getEmail(), applicationUser.getPassword(), Collections.emptyList());
    }
}
