package com.learnJava8.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is: " + sum);

        OptionalInt optionalMax = IntStream.rangeClosed(1, 50).max();
        System.out.println(optionalMax.isPresent() ? optionalMax.getAsInt() : 0);

        OptionalLong optionalMin = LongStream.rangeClosed(20,100).min();
        System.out.println(optionalMin.isPresent() ? optionalMin.getAsLong() : 0);

        OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);
    }
}