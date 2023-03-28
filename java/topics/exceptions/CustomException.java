package com.java.topics.exceptions;
/*
* Write a Java program to add 2 objects of Distance Class. Distance class has 2 instance
variables-feet
* and inches.If the inches entered from the console is >= 12 throw an exception of Custom
exception class
* and catch it to display "Exception Raised---Inches value should be <12 , you entered it
* as : ", inches and, exit the program
*/

class MyExc extends Exception {
    String msg;
    int inch;

    MyExc(String msg, int inch) {
        this.msg = msg;
        this.inch = inch;
    }

    public String toString() {
        return(msg + " " + inch);
    }
}
class Distance {
    int ft;
    int inch;

    Distance(int ft, int inch) throws MyExc {
        this.ft = ft;
        this.inch = inch;

        if (this.inch > 12) {
            throw new MyExc("Exception Raised---Inches value should be <12 , you entered it as: " , this.inch);
        }
    }

    static Distance calculate(Distance d1, Distance d2) throws MyExc {

        Distance result = new Distance(0,0);

        result.ft = d1.ft + d2.ft;
        result.inch = d1.inch + d2.inch;

        if (result.inch >= 12) {
            int temp = result.inch / 12;
            result.inch = result.inch % 12;
            result.ft += temp;
        }
        return result;
    }
}

public class CustomException {
    public static void main(String[] args) throws MyExc {
        try{
            Distance d1 = new Distance(3,14);
            Distance d2 = new Distance(5,2);

            Distance r = Distance.calculate(d1,d2);
            System.out.println(r.ft + " " + r.inch);
        } catch (MyExc e){
            System.out.println(e);
        }


    }
}
