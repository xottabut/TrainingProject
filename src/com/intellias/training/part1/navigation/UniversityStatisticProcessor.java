package com.intellias.training.part1.navigation;

import java.util.List;
import java.util.Optional;

public interface UniversityStatisticProcessor {

    Optional<Student> getYoungestStudent();

    Optional<Student> getOldestStudent();

    List<Student> getThreeBestScoresStudents();
}
