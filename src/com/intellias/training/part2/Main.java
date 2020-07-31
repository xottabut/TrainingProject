package com.intellias.training.part2;

import com.intellias.training.part1.navigation.Student;
import com.intellias.training.part1.navigation.StudentCreator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                StudentCreator.create("Sergii", 2000, 5),
                StudentCreator.create("Petro", 2000, 5),
                StudentCreator.create("Anna", 2001, 5),
                StudentCreator.create("Natasha", 2002, 5)
        );

        ExtractVariableFromArrayExample.extractVariableExample(students, 2000);
        ExtractVariableFromArrayExample.extractVariableExample(students, 1999);


    }
}
