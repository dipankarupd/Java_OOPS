package com.java.topics.inheritance.task1;


// declaring the parent class:

public class ParentClass {

    int num1;
    int num2;

    ParentClass(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition() {

        return num1 + num2 ;
    }
    public int subtraction() {
        return num1 - num2;
    }
}

// child class definition:
class ChildClass extends ParentClass {

    ChildClass(int num1, int num2) {

        super(num1, num2);
    }

    public int multiply() {
        return num1 * num2;
    }
}

class Main {
    public static void main(String[] args) {
        ChildClass c1 = new ChildClass(2,3);

        System.out.println("Added result : " + c1.addition());
        System.out.println("Subtracted result: " + c1.subtraction());
        System.out.println("Multiplied result: " + c1.multiply());
    }
}
