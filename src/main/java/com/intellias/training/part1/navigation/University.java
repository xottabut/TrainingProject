package com.intellias.training.part1.navigation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class University {

    private final List<Student> students = new ArrayList<>();
    private long lastUpdateTime;

    public void addStudents(Student... students) {
        this.students.addAll(Arrays.asList(students));
        lastUpdateTime = System.currentTimeMillis();
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<Student> findStudents(Predicate<Student> studentPredicate) {
        return students
                .stream()
                .filter(studentPredicate)
                .collect(Collectors.toList());
    }


    public long getLastUpdateTime() {
        return this.lastUpdateTime;
    }
}
