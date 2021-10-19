package com.learnJava8.methodReference;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> studentPredicateWithLambda = (s) -> s.getGradeLevel() >= 3;

    static Predicate<Student> studentPredicateWithMethodReference = RefactorMethodReferenceExample::greaterThenGradeLevel;

    public static boolean greaterThenGradeLevel(Student s){
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(studentPredicateWithLambda.test(StudentDataBase.studentSupplier.get()));
        System.out.println(studentPredicateWithMethodReference.test(StudentDataBase.studentSupplier.get()));
    }
}