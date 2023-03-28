package com.java.topics.assignment;

import java.util.*;

public class Working {

    static void doWork(String name,int age,double salary) {

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the user name: ");
        String name = scn.nextLine();

        System.out.println("Enter the age: ");
        int age = scn.nextInt();

        System.out.println("Enter the salary");
        double salary = scn.nextDouble();

        Working.doWork(name,age,salary);
    }
}
