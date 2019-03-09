package com.kaarvik.gym.controller;

import com.kaarvik.gym.model.Workout;
import com.kaarvik.gym.model.WorkoutType;
import com.kaarvik.gym.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping(HelloController.REQUEST_MAPPING)
public class HelloController {

    static final String REQUEST_MAPPING = "/api/v1/hello";

    @Autowired
    private WorkoutRepository workoutRepository;

    @GetMapping
    public ResponseEntity hello() {
        final Workout workout = new Workout();
        workout.setDate(OffsetDateTime.now());
        workout.setWorkoutType(WorkoutType.FIVETHREEONE);
        workout.setBodyWeight(152.5);

        workoutRepository.save(workout);

        return ResponseEntity.ok("Hello! " + workout.toString());
    }
}
