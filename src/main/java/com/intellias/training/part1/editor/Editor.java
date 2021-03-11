package com.intellias.training.part1.editor;

// Tasks:
// TODO:
//  1. Introduce wrapper for the result class
//  that contains operands and results of the sum and use it everywhere
//  2. Add map method to wrapper

public class Editor {

    public static int sum(short a, short b) {
        // adding two short values
        return a + b;
    }

    public static int sum(int a, int b) {
        // adding two int values
        return a + b;
    }

    public static int sum(byte a, byte b) {
        // TODO: move method up
        // TODO: move comment before calculations
        // TODO: move ByteResult annotation to method
        @ByteResult
        int res;
        if (a < 0) {
            res = Math.abs(a) + b;
        } else {
            res = a + b;
        }
        return res;
        // adding two byte values
    }

    public static long sum(long a, long b) {
        // adding two long values
        return a + b;
    }

    public static float sum(float a, float b) {
        // adding two float values
        return a + b;
    }

    public static double sum(double a, double b) {
        // adding two double values
        return a + b;
    }

    public static long sum(String a, String b) {
        // TODO: add check of input params
        // adding two String values
        return Long.parseLong(a) + Long.parseLong(b);
    }

}
