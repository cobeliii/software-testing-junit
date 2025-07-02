package com.cobeliii;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Exercise1 exercise1 = new Exercise1();

        String username = exercise1.generateUsername("Newton Jorge");
        System.out.println("Username: " + username);
    }
}
