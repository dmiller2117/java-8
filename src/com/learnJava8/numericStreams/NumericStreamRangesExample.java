package com.learnJava8.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        System.out.println("Range count " + IntStream.range(1, 50).count());
        IntStream.range(1, 50).forEach((value -> System.out.print(value + ",")));
        System.out.println();
        System.out.println("Range closed count " + IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + ",")));
        System.out.println();
        System.out.println("Long stream Range closed count " + LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + ",")));
        System.out.println();
        // DoubleStream does not have 'range' methods, but we can do the following
        IntStream.range(1, 50).asDoubleStream().forEach((value -> System.out.print(value + ",")));
    }

}