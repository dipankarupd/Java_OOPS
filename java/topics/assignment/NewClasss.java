package com.java.topics.assignment;

public class NewClasss{
    String name;

    NewClasss(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

//        String a = "Dipankar ";
//        String b = "Upadhyaya";
//
//    //    System.out.println(a + b);
//
//        System.out.println(a.concat(b));


//        String str1 = new String("Cat");
//        String str2 = new String("Cat");
//
//        System.out.println(str1 == str2);

       final NewClasss c1 = new NewClasss("abc");
       c1.name = "Dipankar";
       System.out.println(c1.name);
    }


}