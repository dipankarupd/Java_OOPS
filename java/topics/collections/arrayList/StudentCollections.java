package com.java.topics.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class StudentCollections {



    public static void main(String[] args) {



        Student student1 = new Student(10,"Tom",1);
        Student student2 = new Student(20,"Toma",2);
        Student student3 = new Student(30,"Tommy",3);

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the required roll number: ");
        int requiredRoll = scn.nextInt();

        Iterator<Student> it = list.iterator();
        Student current = it.next();
        if (current.roll == requiredRoll) {
            current.display();
        }
        it.next();
    }
}

class Student {
    int age;
    String name;
    int roll;

    public Student(int age, String name, int roll) {
        this.age = age;
        this.name = name;
        this.roll = roll;
    }

    public void display() {
        System.out.print("Name: " + this.name + " Age: " + this.age + " Roll: " + this.roll);
        System.out.println();
    }
}
