package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    private static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    private static List<Student> sortStudentsByGPA() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    private static List<Student> sortStudentsByGPADesc() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by name:");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA:");
        sortStudentsByGPA().forEach(System.out::println);
        System.out.println("Students sorted by descending GPA:");
        sortStudentsByGPADesc().forEach(System.out::println);
    }

}