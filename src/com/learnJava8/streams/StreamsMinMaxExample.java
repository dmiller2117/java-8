package com.learnJava8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce((x, y) -> x > y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> emptyArrayList = new ArrayList<>();

        System.out.println(findMaxValue(integerList));

        Optional<Integer> maxValueOptional = findMaxValueOptional(emptyArrayList);

        if (maxValueOptional.isPresent()) {
            System.out.println(maxValueOptional.get());
        } else {
            System.out.println("no max value");
        }
    }
}