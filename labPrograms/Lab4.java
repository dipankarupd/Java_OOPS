package com.labPrograms;
/*
Write a Java program to create an abstract class namely Shape that contains two integers
and an empty method named print Area (). Provide three classes named Rectangle, Triangle,
and Circle such that each one of the classes extends the class Shape. Each one of the classes
contains only the method print Area () that prints the area of the given shape.
 */
public class Lab4 {
    public static void main(String[] args) {

        Shape shape = new Rectangle(5,10);
        shape.printArea();
        shape = new Triangle(1,20);
        shape.printArea();
        shape = new Circle(7,14);
        shape.printArea();
    }
}
abstract class Shape {

  private int width;
   private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
    abstract void printArea();

    public int getWidht() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}

class Triangle extends Shape {

    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    void printArea() {
        System.out.println("The area of a triangle is: " + (super.getWidht() * super.getHeight())/2);
    }
}
class Rectangle extends Shape {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    void printArea() {
        System.out.println("The area of a rectangle is: " + super.getWidht() * super.getHeight());
    }
}
class Circle extends Shape {
    public Circle(int radius, int diameter) {
        super(radius, diameter);
    }

    int radius = super.getWidht();
    @Override
    void printArea() {
        System.out.println("The area of a circle is: " +(3.14 * radius * radius));
    }
}