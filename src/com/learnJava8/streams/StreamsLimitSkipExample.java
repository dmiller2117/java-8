package com.learnJava8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                .limit(3)  // process the first 3
                .reduce((x, y) -> x + y);
    }


    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream()
                .skip(3)  // skip the first 3
                .reduce((x, y) -> x + y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(7, 8, 9, 10, 12);
        Optional<Integer> limitResult = limit(integerList);
        if (limitResult.isPresent()) {
            System.out.println(limitResult.get());
        } else {
            System.out.println("No input returned");
        }


        Optional<Integer> skipResult = skip(integerList);
        if (skipResult.isPresent()) {
            System.out.println(skipResult.get());
        } else {
            System.out.println("No input returned");
        }
    }
}