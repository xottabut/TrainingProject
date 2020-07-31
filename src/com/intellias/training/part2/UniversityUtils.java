package com.intellias.training.part2;

import com.intellias.training.part1.navigation.Student;
import com.intellias.training.part1.navigation.StudentCreator;
import com.intellias.training.part1.navigation.University;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UniversityUtils {

    public static void inverseBooleanExample(University university) {
        // ...
        if (university == null || university.getStudents().size() > 2) {
            System.out.println("No report generated.");
        } else {
            System.out.println("University has " + university.getStudents().size() + " students.");
        }
        // ...
    }

    public static void extractVariableExample(List<Student> students, int year) {
        List<Student> studentsBornAfter20K = students.stream()
                .filter(student -> student.getBirthYear() == year)
                .collect(Collectors.toList());

        if (!studentsBornAfter20K.isEmpty()) {
            Student student = studentsBornAfter20K.get(0);
            System.out.println("Step 1: student = " + student);
        }

        studentsBornAfter20K.forEach(student -> System.out.println(student.getFullName()));

        if (!studentsBornAfter20K.isEmpty()) {
            Student student = studentsBornAfter20K.get(0);
            System.out.println("Step 2: student = " + student);
        }
    }

    public void inlineExample() {
        String paramA = calculateParamA();

        // ...

        System.out.println(paramA);
    }

    private String calculateParamA() {
        if (System.currentTimeMillis() % 2 == 0) {
            return "first";
        } else {
            return "second";
        }
    }

    public String returnExampleScoreInStringNotation(Student student) {
        String stringNotation;
        if (student.getAverageNote() < 1) {
            stringNotation = "F";
        } else if (student.getAverageNote() < 2) {
            stringNotation = "D";
        } else if (student.getAverageNote() < 3) {
            stringNotation = "C";
        } else if (student.getAverageNote() < 4) {
            stringNotation = "B";
        } else {
            stringNotation = "A";
        }
        return stringNotation;
    }

    public void streamExample1(List<Student> students) {
        students.stream()
                .filter(student -> student.getAverageNote() > 4)
                .map(student -> "best:" + student.getFullName())
                .filter(s -> s.contains("Ivan"))
                .forEach(System.out::println);
    }

    public boolean streamExample2(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAverageNote() > 4)
                .filter(student -> student.getAverageNote() < 4.5)
                .anyMatch(s -> s.getBirthYear() > 2000);
    }

    public void optionExample() {
        Optional<String> greeting = getGreeting();

        if (greeting.isPresent()) {
            System.out.println("greeting = " + greeting.get());
        }
    }

    private Optional<String> getGreeting() {
        return Optional.of("Hello!");
    }

    public void forExample() {
        Student a = StudentCreator.create("A", 2000, 5);
        Student b = StudentCreator.create("B", 2000, 4);

        List<Student> students = Arrays.asList(a, b);

        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageNote();
        }

        System.out.println(sum);
    }


}
