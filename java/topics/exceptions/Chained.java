package com.java.topics.exceptions;


class A {
    void demo() throws NullPointerException {
        NullPointerException e = new NullPointerException("Created");
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }
}
public class Chained {
    public static void main(String[] args) {
        A x = new A();
        try {
            x.demo();
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
