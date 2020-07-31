package com.intellias.training.part1.assistance;

import com.intellias.training.part1.navigation.Student;
import com.intellias.training.part1.navigation.StudentCreator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TODO: to singleton
        List<Student> students = Arrays.asList(StudentCreator.create("", 0, 0));

    }
}
