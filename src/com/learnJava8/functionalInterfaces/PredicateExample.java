package com.learnJava8.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    @SuppressWarnings("CodeBlock2Expr")
    static Predicate<Integer> p = (i) -> {
        return i % 2 == 0;
    }; // full syntax

    static Predicate<Integer> canDivideBy2 = (i) -> i % 2 == 0; // compact syntax, for single line only
    static Predicate<Integer> canDivideBy5 = (i) -> i % 5 == 0;

    public static void main(String[] args) {
        System.out.println(p.test(4));
        System.out.println(canDivideBy2.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    private static void predicateAnd() {
        System.out.println("Predicate And result is: " + canDivideBy2.and(canDivideBy5).test(10)); // predicate chaining
        System.out.println("Predicate And result is: " + canDivideBy2.and(canDivideBy5).test(9)); // predicate chaining
    }

    private static void predicateOr() {
        System.out.println("Predicate Or result is: " + canDivideBy2.or(canDivideBy5).test(10)); // predicate chaining
        System.out.println("Predicate Or result is: " + canDivideBy2.or(canDivideBy5).test(8)); // predicate chaining
    }

    private static void predicateNegate() {
        System.out.println("Predicate Negate result is: " + canDivideBy2.or(canDivideBy5).negate().test(8));
    }

}