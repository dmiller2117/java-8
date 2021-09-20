package com.learnJava8.functionalInterfaces;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> gpaLevelPredicate = (student) -> student.getGpa() >= 3.9;

    public static void main(String[] args) {
        filterStudentByGrade();
        filterStudentByGpa();
        filterStudents();
    }

    private static void filterStudentByGrade() {
        System.out.println("filterStudentByGrade :");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (gradeLevelPredicate.test(student)) {
                System.out.println(student);
            }
        }));
    }

    private static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa :");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (gpaLevelPredicate.test(student)) {
                System.out.println(student);
            }
        }));
    }

    private static void filterStudents() {
        System.out.println("filterStudents :");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (gradeLevelPredicate.and(gpaLevelPredicate).test(student)) {
                System.out.println(student);
            }
        }));
    }
}