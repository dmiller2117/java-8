package com.learnJava8.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    @SuppressWarnings({"Convert2Lambda", "ComparatorCombinators", "Convert2MethodRef", "Anonymous2MethodRef"})
    public static void main(String[] args) {
        /*
         * prior Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
                //i1 == i2 -> 0
                //i1 > i2 -> 1
                //i1 < i2 -> -1
            }
        };
        System.out.println("Result of comparator is : " + comparator.compare(3, 2));

        /*
         * Using lambda
         */
        Comparator<Integer> comparatorLambda = (Integer i1, Integer i2) -> i1.compareTo(i2);
        System.out.println("Result of comparator using lambda is : " + comparatorLambda.compare(3, 2));

        Comparator<Integer> comparatorLambdaNoType = (i1, i2) -> i1.compareTo(i2);
        System.out.println("Result of comparator using lambda with no type is : " + comparatorLambdaNoType.compare(3, 2));
    }

}