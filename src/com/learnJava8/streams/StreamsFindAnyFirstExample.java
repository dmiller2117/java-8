package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> findAnyStudent = findAnyStudent();
        if (findAnyStudent.isPresent()) {
            System.out.println(findAnyStudent.get());
        } else {
            System.out.println("find any student not found");
        }

        Optional<Student> findFirstStudent = findFirstStudent();
        if (findFirstStudent.isPresent()) {
            System.out.println(findFirstStudent.get());
        } else {
            System.out.println("find first student not found");
        }
    }
}