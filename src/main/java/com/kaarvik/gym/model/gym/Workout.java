package com.kaarvik.gym.model.gym;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Workout {

    @Id
    @GeneratedValue
    private Long id;

    private WorkoutType workoutType;

    private OffsetDateTime date;

    private double bodyWeight;

    @OneToMany
    private List<Exercise> exercises;
}
