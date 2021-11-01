package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getActivities)// Stream<List<String>>
                .flatMap(List::stream)// Stream<String>
                .collect(Collectors.toList());
        return studentActivities;
    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
    }
}