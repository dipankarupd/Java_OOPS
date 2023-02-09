package com.labPrograms;

import java.util.Scanner;

/*
Write a program to add additional functionals like mod() and squrt() for performing modulus
and squreroot operation to an existing class called “Calculator” which performs basic
functions like add(), sub(), mul() and div().
a. Initialize the class’s data members by using the parameterized constructor.
b. Define an overridden method called displayResults() to display the result of mathematical
operation.
c. Demonstrate the use of reusability by extending the existing class.
d. Demonstrate the concept of Dynamic Method Dispatch (or run time polymorphism)
 */
public class Lab5 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of the two operands: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        Calculator calculator = new Calculator(a,b);
        calculator.display();

//        calculator = new AdvancedCalculator(4,0);
//        calculator.display();

        AdvancedCalculator newCalculator = new AdvancedCalculator(7,1);
        newCalculator.display();
    }
}
class Calculator {

    private float val1;
    private float val2;

    Calculator (float val1, float val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
    public float add() {
        return val1 + val2;
    }
    public float sub () {
        return val1 - val2;
    }
    public float mul() {
        return val1 * val2;
    }
    public float div () {
        if (val2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        } else {
            return val1 / val2;
        }
    }
    public float getVal1() {
        return val1;
    }
    public float getVal2() {
        return val2;
    }

    public void display() {
        System.out.println("The sum is: " + add());
        System.out.println("The difference is: " + sub());
        System.out.println("The product is: " + mul());
        System.out.println("The difference is: " + div());
    }
}

class AdvancedCalculator extends Calculator {

    AdvancedCalculator(float val1, float val2) {
        super(val1, val2);
    }

    public float sqrt() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number whose root is to be found: ");
        float val;
        val = scn.nextInt();
        return (float) Math.sqrt(val);
    }
    public float mod() {
        return super.getVal1() % super.getVal2();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The mod is: " + mod());
        System.out.println("The square root is: " + sqrt());
    }
}