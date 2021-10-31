package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    static List<String> namesList() {
        List<String> namesList = StudentDataBase.getAllStudents().stream()// Stream<Student>
                // Student as an input, String as the output
                .map(Student::getName)// Stream<String>
                .map(String::toUpperCase) // Same type, so doing an operation
                .collect(Collectors.toList());
        return namesList;
    }

    static Set<String> namesSet() {
        Set<String> namesSet = StudentDataBase.getAllStudents().stream()// Stream<Student>
                // Student as an input, String as the output
                .map(Student::getName)// Stream<String>
                .map(String::toUpperCase) // Same type, so doing an operation
                .collect(Collectors.toSet());
        return namesSet;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}