package com.intellias.training.part1.editor;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Objects;
import java.util.function.Function;

public class EditorAfter {

    public static final class Result<T, R> {
        private final T a;
        private final T b;
        private final R res;

        public Result(T a, T b, R res) {
            this.a = a;
            this.b = b;
            this.res = res;
        }



        public T getA() {
            return a;
        }

        public T getB() {
            return b;
        }

        public R getRes() {
            return res;
        }

        public <NT> Result<NT, R> map(Function<T, NT> mapFunction) {
            NT newA = mapFunction.apply(a);
            NT newB = mapFunction.apply(b);
            return new Result<>(newA, newB, res);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Result<?, ?> result = (Result<?, ?>) o;
            return Objects.equals(a, result.a) &&
                    Objects.equals(b, result.b) &&
                    Objects.equals(res, result.res);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b, res);
        }

        @Override
        public String toString() {
            return a + " + " + b + " = " + res;
        }
    }

    @ByteResult
    public static Result<Byte, Integer> sum(byte a, byte b) {
        // adding two byte values
        return new Result<>(a, b, a + b);
    }

    public static Result<Short, Integer> sum(short a, short b) {
        // adding two short values
        return new Result<>(a, b, a + b);
    }

    public static Result<Integer, Integer> sum(int a, int b) {
        // adding two int values
        return new Result<>(a, b, a + b);
    }

    public static Result<Long, Long> sum(long a, long b) {
        // adding two long values
        return new Result<>(a, b, a + b);
    }

    public static Result<Float, Float> sum(float a, float b) {
        // adding two float values
        return new Result<>(a, b, a + b);
    }

    public static Result<Double, Double> sum(double a, double b) {
        // adding two double values
        return new Result<>(a, b, a + b);
    }

    public static Result<String, Long> sum(String a, String b) {
        if (NumberUtils.isParsable(a) && NumberUtils.isParsable(b)) {
            // adding two String values
            return new Result<>(a, b, Long.parseLong(a) + Long.parseLong(b));
        } else {
            throw new IllegalArgumentException("Input parameters are not numbers.");
        }
    }

}
