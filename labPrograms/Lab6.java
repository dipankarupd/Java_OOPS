package com.labPrograms;

/*
Write a Java program that implements a multi-thread application that has three threads.
First thread generates random integer every 1 second and if the value is even, second thread
computes the square of the number and prints. If the value is odd, the third thread will print
the value of cube of the number.
 */

import java.util.Random;

public class Lab6 {
    public static void main(String[] args) {
        Generate generate = new Generate();
        Thread thread1 = new Thread(generate,generate.name);
        thread1.start();

    }
}

class Generate implements Runnable {

    static int number;
    String name = "GeneratingClass";
    @Override
    public void run() {

        while(true) {
            System.out.println("Generating a random number");

            Random random = new Random();
            number = random.nextInt();
            System.out.println(number);

            if ((number & 1) == 0) {
                new FindSquare(number);

            } else {
                new FindCube(number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class FindSquare implements Runnable {

   static int evenNumber;
   private String name = "SquareCalculation";

   FindSquare(int n) {
       evenNumber = n;
       Thread thread2 = new Thread(this,name);
       thread2.start();
   }
    @Override
    public void run() {
        System.out.println("Entered into the square calculation and square is " + evenNumber * evenNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class FindCube implements Runnable {

    static int oddNumber;
    private String name = "CubeCalculation";

    FindCube(int n) {
        oddNumber = n;
        Thread thread3 = new Thread(this,name);
        thread3.start();
    }
    @Override
    public void run() {
        System.out.println("Entered into finding the cube and the value is" + oddNumber * oddNumber * oddNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
