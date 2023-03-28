package com.java.topics.multithreading;

public class SumOfPrimes {

    public static void main(String[] args) {

        int n = 50;
        System.out.println(findSum(n));
    }

    static int findSum(int n) {
        int sum = 0;

        for (int i = 2; i <= n ; i++) {
            boolean isPrime = false;
            for (int j = 2; j * j <= i ; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                sum += i;
            }
        }
        return sum;
    }
}
