package com.java.topics.multithreading;

/*
Write a java program to spawn 2 threads from main. One thread generates prime numbers
from 1 to 50 and finds sum. Other thread generates fibonacci series numbers from 1 to 50
and finds sum. Set the priority of Prime and Fibonacci threads to 9 and 2 respectively
 */

class PrimeSum implements Runnable{
    String name = "Sum of Primes";
    private static final int SIZE = 50;
    @Override
    public void run() {

        int sum = 5;
        int n = 4;

        while (n <= SIZE) {

            boolean isPrime = false;
            for (int i = 2; i * i <= n; i++) {
                if ((n % i == 0)) {
                    isPrime = true;
                    break;
                }
                if (!(isPrime)) {
                    sum = sum + n;
                }
            }
            n++;
        }
        System.out.println(sum);

    }
}

class FibonacciSum implements Runnable {

    String name = "Sum of Factorials";
    private static final int SIZE = 50;

    @Override
    public void run() {

    }
}

public class PrimeAndFibo {

    public static void main(String[] args) {

        PrimeSum prime = new PrimeSum();
        Thread t1 = new Thread(prime,prime.name);

        FibonacciSum fibonacci = new FibonacciSum();
        Thread t2 = new Thread(fibonacci,fibonacci.name);

        t1.setPriority(9);
//        t2.setPriority(2);
        t1.start();
//        t2.start();
    }
}
