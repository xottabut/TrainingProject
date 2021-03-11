package com.intellias.training.part1.generate;


import java.util.Arrays;
import java.util.List;

public class Generator {

    public static void main(String[] args) {
        // TODO:
        //  1. Create Animal interface with walk method
        //  2. Create two implementations Dog and Cat
        //  3. Generate constructors/methods


        //
        extractInlineDemo();
    }

    // override: 2 ways



    private static void extractInlineDemo(){
        List<String> cities = Arrays.asList("Ukraine", "Poland", "Berlin");

        int length = cities.get(0).length();
        boolean startsWithU = cities.get(0).startsWith("U");

        String expression = length + " -> " + startsWithU;

        System.out.println(expression);
    }


}
