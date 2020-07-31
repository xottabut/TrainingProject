package com.intellias.training.part1.navigation;

import java.util.Objects;

public class Student {
    private final String fullName;
    private final int birthYear;
    private final double averageNote;

    public Student(String fullName, int birthYear, double averageNote) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.averageNote = averageNote;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getAverageNote() {
        return averageNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return birthYear == student.birthYear &&
                Double.compare(student.averageNote, averageNote) == 0 &&
                Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, birthYear, averageNote);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", birthYear=" + birthYear +
                ", averageNote=" + averageNote +
                '}';
    }
}
