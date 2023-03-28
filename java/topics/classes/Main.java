package com.java.topics.classes;

public class Main {
    public static void main(String[] args) {

        Student[] student = new Student[5];

        // creating objects:

        student[0] = new Student("Dipankar", "1NT21CS061",19,"CSE",9.85);
        student[1] = new Student("Ayush", "1NT21CS050",19,"CSE",8.95);
        student[2] = new Student("Aayush", "1NT21CS005",19,"CSE",4.85);
        student[3] = new Student("Bikash", "1NT21AE017",19,"AE",9.85);
        student[4] = new Student("Atik", "1NT21CS048",19,"CSE",9.05);


        for (int i = 0; i < 5; i++) {
            if (student[i].check()){
                student[i].printDetails();
            }
        }
    }
}
