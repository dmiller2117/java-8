package com.learnJava8.imperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeRemoveDupes {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 7, 7, 9, 10);

        List<Integer> uniqueList = new ArrayList<>();
        /**
         * Imperative style of programming
         */
        for (Integer integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }

        System.out.println("Imperative uniqueList : " + uniqueList);

        /**
         * Declarative style of programming
         */
        uniqueList = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Declarative uniqueList : " + uniqueList);

    }
}