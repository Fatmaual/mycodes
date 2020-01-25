package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

 Scanner abc = new Scanner(System.in);
 System.out.println("What is your name? ");
 String name = abc.next();
 String anotherWord = abc.next();
 System.out.println("You have entered " + name);
 System.out.println("Another word is " + anotherWord);

 System.out.println("wHAT IS YOUR AGE?");
 int age = abc.nextInt();
System.out.println("Your age is "+ age);
        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ? ");

        String name1 = blabla.next(); // it will only capture first word (separated by space)

        //String anotherWord = blabla.next();
        int age1 = blabla.nextInt();

        System.out.println("You have entered name " + name1);
        //System.out.println("Another word is  " + anotherWord);
        System.out.println("You have entered age " + age1);


    }
}
