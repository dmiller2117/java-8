package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getActivities)// Stream<List<String>>
                .flatMap(List::stream)// Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    static long getStudentActivitiesCount() {
        long noOfStudentActivities = StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getActivities)// Stream<List<String>>
                .flatMap(List::stream)// Stream<String>
                .distinct()
                .count();
        return noOfStudentActivities;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }
}