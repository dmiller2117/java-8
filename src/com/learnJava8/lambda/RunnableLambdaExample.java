package com.learnJava8.lambda;

public class RunnableLambdaExample {
    @SuppressWarnings({"Convert2Lambda", "CodeBlock2Expr"})
    public static void main(String[] args) {

        /*
         * prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1, pre Java 8");
            }
        };
        new Thread(runnable).start();

        // java 8 lambda
        // () -> {};  syntax
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2, Java 8 lambda");
        };
        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable, with single line lambda");
        new Thread(runnableLambda1).start();

        new Thread(() -> System.out.println("Inside Runnable, with in line lambda")).start();

        new Thread(() -> {
            System.out.println("Inside Runnable, with in line, 2 line lambda");
            System.out.println("second line");
        }
        ).start();
    }
}