package com.java.topics.classes;

public class Student {

    private String name;
    private String usn;
    private int age;
    private String branch;
    private double cgpa;

    // constructor:
    public Student (String name, String usn, int age, String branch, double cgpa) {
        this.name = name;
        this.usn = usn;
        this.age = age;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public boolean check() {

        return (this.branch.equals("CSE") && this.cgpa >= 9);
    }

    public void printDetails() {

        System.out.println("-------------------- Details --------------------------");
        System.out.println("name : " + this.name);
        System.out.println("usn: " + this.usn);
        System.out.println("age: " + this.age);
        System.out.println("branch: " + this.branch);
        System.out.println("cgpa: " + this.cgpa);

        System.out.println("----------------------------------------------------------");
    }
}
