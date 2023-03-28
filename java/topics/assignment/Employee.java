/*

                                                 PROBLEM STATEMENT:

Design an employee class. Develop a driver class to create and compare two employee objects. Display
the details of the employee with higher salary.

Class employee
String name
int empid
double salary

employee compare(Employee) : compare the salary ad return the employee with higher salary

void display() : display employee object detail on console
 */

package com.java.topics.assignment;
public class Employee {

    public static void main(String[] args) {

        // initializing the first object:
        Employees emp1 = new Employees();
        emp1.name = "Aayush";
        emp1.empid = 100;
        emp1.salary = 25000;

        // initializing the second object:
        Employees emp2 = new Employees();
        emp2.name = "Bikash";
        emp2.empid = 105;
        emp2.salary = 20000;

        Employees emp = new Employees();    // creating the third object to store the one with the highest salary:
        emp = emp1.compare(emp2);   // calling the compare method

        emp.display();  // calling the display method
    }
}


class Employees {
    // instance variables declaration:
    String name;
    int empid;
    double salary;
    // declaring and defining the method that compares the salary of the two objects
    public Employees compare(Employees e) {
       Employees result =  (e.salary > this.salary) ? e : this;
       return result;
    }
    // declaring and defining the method to display the result:
    public void display() {
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        System.out.println("Name of the employee: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary of the Employee: "+ salary);
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
    }
}