package com.intellias.training.part1.navigation;

public class UniversityLife {

    public static void main(String[] args) {
        University university = new University();
        university.addStudents(
                StudentCreator.create("Ivan Java", 2105, 4.5),
                StudentCreator.create("Petro Scala", 2104, 4.1),
                StudentCreator.create("Panas Script", 2105, 4.4),
                StudentCreator.create("Maria Sql", 2105, 4.0)
        );

        UniversityStatisticProcessor statisticProcessor = new CachedUniversityStatisticProcessorImpl(university);

        statisticProcessor.getYoungestStudent()
                .ifPresent(student -> System.out.println("Youngest student = " + student));

        statisticProcessor.getOldestStudent()
                .ifPresent(student -> System.out.println("Oldest student = " + student));

        System.out.println("threeBestStudents = " + statisticProcessor.getThreeBestScoresStudents());

    }

}
