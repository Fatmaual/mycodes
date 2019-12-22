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


    }
}
