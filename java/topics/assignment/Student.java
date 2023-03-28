
/*

                                                   Problem Statement:

            Design a student class with two instance variables- USN and Name and two methods -a parameterized
            constructor to initialize the objects of student class and a printStudent() method to display
            student details on the console. Write a driver class to create and display 2 student objects on the console.
 */


package com.java.topics.assignment;

  class Students {

      // declaring the instance variables:
      String name;
      String usn;

      // constructor calling:
      Students(String name, String usn) {
          this.name = name;
          this.usn = usn;
      }

      // method of the class:
      public void printData() {
          System.out.println("Name of the Student is: " + this.name + " and the USN is " + this.usn);
      }

  }
   public class Student {


    public static void main(String[] args) {

        // creating the objects of the Students class:
         Students s1 = new Students("Aayush","1NT21CS050");
         Students s2 = new Students("Atik", "1NT21CS048");

         // for printing the data:
         s1.printData();
         s2.printData();
    }

}




