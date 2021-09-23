package com.learnJava8.functionalInterfaces;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> gradeLevelPredicate = (s) -> s.getGradeLevel() >= 3;
    Predicate<Student> gpaLevelPredicate = (s) -> s.getGpa() >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student -> {
        if(gradeLevelPredicate.and(gpaLevelPredicate).test(student)){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    private void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);

    }
}