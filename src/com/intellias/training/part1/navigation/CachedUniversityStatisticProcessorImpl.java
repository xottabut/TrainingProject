package com.intellias.training.part1.navigation;

import java.util.List;
import java.util.Optional;

public class CachedUniversityStatisticProcessorImpl implements UniversityStatisticProcessor {

    private final SimpleUniversityStatisticProcessor simpleUniversityStatisticProcessor;
    private final University university;

    private Optional<Student> youngestStudent;
    private long lastUpdateTime;

    public CachedUniversityStatisticProcessorImpl(University university) {
        simpleUniversityStatisticProcessor = new SimpleUniversityStatisticProcessor(university);
        this.university = university;
        this.lastUpdateTime = university.getLastUpdateTime();
        this.youngestStudent = simpleUniversityStatisticProcessor.getYoungestStudent();
    }

    @Override
    public Optional<Student> getYoungestStudent() {
        if (university.getLastUpdateTime() > lastUpdateTime) {
            lastUpdateTime = university.getLastUpdateTime();
            this.youngestStudent = simpleUniversityStatisticProcessor.getYoungestStudent();
        }
        return youngestStudent;
    }

    @Override
    public Optional<Student> getOldestStudent() {
        return simpleUniversityStatisticProcessor.getOldestStudent();
    }

    @Override
    public List<Student> getThreeBestScoresStudents() {
        return simpleUniversityStatisticProcessor.getThreeBestScoresStudents();
    }
}
