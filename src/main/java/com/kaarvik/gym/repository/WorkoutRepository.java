package com.kaarvik.gym.repository;

import com.kaarvik.gym.model.gym.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {
}
