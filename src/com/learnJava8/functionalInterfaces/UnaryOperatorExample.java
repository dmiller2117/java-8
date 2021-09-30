package com.learnJava8.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    // returns the same type as the input
    static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java8"));
    }
}