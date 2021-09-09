package com.learnJava8.imperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeSum {

    public static void main(String[] args) {

        /**
         * Imperative style of programming
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("Sum using imperative approach : " + sum);

        /**
         * Declarative style of programming
         */
        sum = 0;
        sum = IntStream.rangeClosed(0, 100)
                .parallel() // we can run parallel if we want to
                .sum();
        System.out.println("Sum using declarative approach : " + sum);

    }
}