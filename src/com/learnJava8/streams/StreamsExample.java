package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        // student name and their activities in a map

        // create a predicate and pass as argument, or you can use the predicate inline with the filter
        // .filter((student -> student.getGradeLevel() >= 3))
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()  // initial output
                .peek((student -> {  // use peek as debug
                    System.out.println(student);
                }))
                .filter(studentPredicate)   // intermediate operation
                .peek((student -> {  // use peek as debug
                    System.out.println("After 1st filter" + student);
                }))
                .filter(studentGpaPredicate)    // intermediate operation
                .peek((student -> {  // use peek as debug
                    System.out.println("After 2nd filter" + student);
                }))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));   // terminal operation

        System.out.println(studentMap);
    }
}