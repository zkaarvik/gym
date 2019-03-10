package com.kaarvik.gym.repository;

import com.kaarvik.gym.model.user.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ApplicationUser, Long> {

    ApplicationUser findByEmail(String email);
}
