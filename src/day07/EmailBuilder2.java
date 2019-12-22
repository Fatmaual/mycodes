package day07;

import java.util.Scanner;

public class EmailBuilder2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name, last name, company separated by space :");
        String firstName, lastName, company, email ;
        firstName = scan.next();
        lastName = scan.next();
        company = scan.next();
        email = scan.next();
        Scanner abd = new Scanner(System.in);
        firstName = "fatma";
        lastName = "ulusal";
        company = "aplle";
        email = firstName+"_"+lastName+"@"+".com";
        System.out.println("My name is "+ firstName+ " "+lastName +" and I work for "+ company+ ", " +
                " my email address is "+ email);
        String name = scan.next();





    }
}
