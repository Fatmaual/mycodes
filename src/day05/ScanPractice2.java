package day05;

import java.util.Scanner;

public class ScanPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        //ask where do you live
        System.out.println("Where do you live? ");
        String city = scan.next();
        System.out.println("You live in " + city ) ;
        //ask how old are you?
        System.out.println("How old are you?") ;
        int age = scan.nextInt();
        int ageYear = 2019 - age ;
        System.out.println("Your age is " + age );







    }





}
