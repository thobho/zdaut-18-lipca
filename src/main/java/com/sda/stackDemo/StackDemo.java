package com.sda.stackDemo;

public class StackDemo {

    public static void main(String[] args) {
        System.out.println("Main started");

        try {
            method1();
        } catch(Exception e) {
            System.out.println("Wyłapano!!! : " + e.getMessage());
        }

        System.out.println("Main stopped");
    }

    public static void method1() {
        System.out.println("Method 1 started");
        method2();
        System.out.println("Method 1 stopped");
    }

    public static void method2() {
        System.out.println("Method 2 started");
        throw new IllegalArgumentException("Informacja w wyjątku");
    }


}
