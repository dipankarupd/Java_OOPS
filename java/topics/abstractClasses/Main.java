package com.java.topics.abstractClasses;

abstract class F1 {
    int x;
    int y;

    F1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract int compute();
}

class R1 extends F1 {

    R1(int x, int y) {
        super(x,y);
    }

    @Override
    int compute() {
        return x + y;
    }

}

public class Main {

    public static void main(String[] args) {

    }
}
