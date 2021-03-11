package com.intellias.training.part1.navigation;

public final class StudentCreator {
    private StudentCreator() {
    }

    public static Student create(String fullName, int birthYear, double averageNote) {
        return new Student(fullName, birthYear, averageNote);
    }
}
