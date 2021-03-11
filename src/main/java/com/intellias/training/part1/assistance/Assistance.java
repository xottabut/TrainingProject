package com.intellias.training.part1.assistance;

import com.intellias.training.part1.navigation.Student;
import com.intellias.training.part1.navigation.StudentCreator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Assistance {
    public static void main(String[] args) {

        // methodWithManyParameters(); // parameters info

        Stream.of(); // Documentation + definition

        // next error/warning + its description

        // TODO: Context actions to singleton
        List<Student> students = Arrays.asList(StudentCreator.create("", 0, 0));




    }

    private static void methodWithManyParameters(int x, int y, int z, String name) {

    }
    private static void methodWithManyParameters(float x, float y, float z, List<String> name) {

    }

}
