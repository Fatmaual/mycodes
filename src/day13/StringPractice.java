package day13;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
       // int x = 10;
        //int y = 12;
        //Scanner scan = new Scanner(System.in);
        //anything is nor pirmitive will be object!
     //toUpperCase anlami butun karakterleri uppercase yapiyor!
       /**
        * String s1 = "hello";
        *         System.out.println(s1.equals("hello"));
        *         System.out.println(s1.equalsIgnoreCase("HellO"));
        *         System.out.println(s1);
        *         System.out.println(s1.toUpperCase() ); // consule de check yap!parenthesis bos yada dolu olabilir!
        *         System.out.println(s1.toLowerCase() );
        * */
String myName = "Fatma";

        System.out.println(myName);
        System.out.println(myName.equalsIgnoreCase("Fatme"));
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        System.out.println(myName.equals("fatma"));
        System.out.println("My name is: "+myName.equals("Fatma"));
        System.out.println(myName.length()); // bu da onemli kac karakter oldugunu soyluyor.







    }

}
