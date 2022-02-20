package com.learnJava8.streams_terminal;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

    public static String joiningNoArg() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) // Stream<String>
                .collect(joining());
    }

    public static String joiningDelim() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) // Stream<String>
                .collect(joining("-"));
    }

    public static String joiningDelimPrefixSuffix() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) // Stream<String>
                .collect(joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println(joiningNoArg());
        System.out.println(joiningDelim());
        System.out.println(joiningDelimPrefixSuffix());
    }
}