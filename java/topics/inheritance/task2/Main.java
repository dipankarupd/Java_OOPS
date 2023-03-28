package com.java.topics.inheritance.task2;

public class Main {
    public static void main(String[] args) {
//
//        Figure rectangle = new Figure(5,10);
//        System.out.println(rectangle.area());

        final MyClass a = new MyClass();
        a.a = 100;
        System.out.println(a.a);
    }
}
//
// class Figure {
//    double length;
//    double width;
//
//    Figure(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    double area(){
//        return 0;
//    }
//}
//
//class Rectangle extends Figure{
//
//    Rectangle(double length,double width) {
//        super(length,width);
//    }
//
//
//    double area() {
//        return length * width;
//    }
//}

class MyClass {
    int a = 10;
}
