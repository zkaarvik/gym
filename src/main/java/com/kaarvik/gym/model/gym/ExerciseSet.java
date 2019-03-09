package com.kaarvik.gym.model.gym;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExerciseSet {

    @Id
    @GeneratedValue
    private long id;

    private int goalReps;

    private int completedReps;

    private double weight;

    private boolean isAmrap;
}
