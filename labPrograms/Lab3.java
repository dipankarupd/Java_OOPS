package com.labPrograms;

import java.util.*;

public class Lab3 {

    public static void main(String[] args) {

        FourWheeler wheeler1 = new FourWheeler(2003);
        TwoWheeler wheeler2 = new TwoWheeler(2000);
        MyTwoWheeler wheeler = new MyTwoWheeler(1990);

        wheeler1.getData();
        wheeler1.putData();

        System.out.println("-------------------------------");

        wheeler2.getData();
        wheeler2.putData();

        System.out.println("-------------------------------");

        wheeler.getData();
        wheeler.putData();

        System.out.println("-------------------------------");
    }
}

abstract class Vehicle {

    int yearOfManufactue;
    static int n = 100;
    Vehicle(int yearOfManufactue) {
        this.yearOfManufactue = yearOfManufactue;
    }

    abstract void getData();
    abstract void putData();
}

final class FourWheeler extends Vehicle {

    Scanner scn = new Scanner(System.in);
    FourWheeler(int year) {
        super(year);
    }

    @Override
    void getData() {
        System.out.println("The year of manufacture of four wheeler is: " + yearOfManufactue);
    }

    @Override
    void putData() {
        System.out.println("Updating....");
        System.out.println("What is the year of manufacture? ");
        yearOfManufactue = scn.nextInt();
        getData();
    }
}

class TwoWheeler extends Vehicle {

    Scanner scn = new Scanner(System.in);

    TwoWheeler(int year) {
        super(year);
    }
    @Override
    void getData() {
        System.out.println("The year of manufacture of two wheeler is: " + yearOfManufactue);
    }

    @Override
    void putData() {
        System.out.println("Updating....");
        System.out.println("What is the year of manufacture? ");
        yearOfManufactue = scn.nextInt();
        getData();

    }
}

class MyTwoWheeler extends TwoWheeler {

    MyTwoWheeler(int year) {
        super(year);
    }
}
