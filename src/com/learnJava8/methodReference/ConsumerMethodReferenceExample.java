package com.learnJava8.methodReference;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    //standard Lambda, can be simplified to a method reference
    @SuppressWarnings("Convert2MethodRef")
    static Consumer<Student> consumerWithLambda = (s) -> System.out.println(s);
    //ClassName::methodName
    static Consumer<Student> consumerWithMethodReference = System.out::println;
    //ClassName::instanceMethodName
    static Consumer<Student> consumerForInstanceMethodName = Student::printListOfActivities;

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("consumerWithLambda:");
        studentList.forEach(consumerWithLambda);
        System.out.println("consumerWithMethodReference:");
        studentList.forEach(consumerWithMethodReference);
        System.out.println("consumerForInstanceMethodName:");
        studentList.forEach(consumerForInstanceMethodName);
    }
}