package com.intellias.training.part1.navigation;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SimpleUniversityStatisticProcessorImpl implements UniversityStatisticProcessor {
    private final University university;

    public SimpleUniversityStatisticProcessorImpl(University university) {
        this.university = university;
    }

    @Override
    public Optional<Student> getYoungestStudent() {
        return university
                .getStudents()
                .stream()
                .max(Comparator.comparingInt(Student::getBirthYear));
    }

    @Override
    public Optional<Student> getOldestStudent() {
        return university
                .getStudents()
                .stream()
                .min(Comparator.comparingInt(Student::getBirthYear));
    }

    @Override
    public List<Student> getThreeBestScoresStudents() {
        List<Student> students = university.getStudents();
        if (students.isEmpty()) {
            return Collections.emptyList();
        }
        double[] bestScores = students.stream()
                .sorted(Comparator.comparingDouble(Student::getAverageNote).reversed())
                .mapToDouble(Student::getAverageNote)
                .distinct()
                .limit(3)
                .toArray();
        double threeBestScore = bestScores[bestScores.length - 1];
        return university.findStudents(student -> student.getAverageNote() >= threeBestScore);
    }
}
