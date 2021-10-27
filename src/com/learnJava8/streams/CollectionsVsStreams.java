package com.learnJava8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // with a collection you can add and remove elements
        names.add("Libby");
        names.add("Maisy");
        names.add("Tracey");
        for (String name : names) {
            System.out.println(name);
        }
        // can traverse more than once with collections
        for (String name : names) {
            System.out.println(name);
        }
        names.remove(0);
        System.out.println(names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        // nameStream.forEach(System.out::println); //stream has already been operated upon or closed
    }
}