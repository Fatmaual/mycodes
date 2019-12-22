package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {

    public static void main(String[] args) {
        // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address
        Scanner abc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = abc.next();
        String anotherWord = abc.next();
        System.out.println("You have entered " + name);
        System.out.println("last name is " + anotherWord);

        System.out.println("which city do you live in, including state");
        String city = abc.next();
        String state = abc.next();
        System.out.println("You entered " + city + " / " + state);

        System.out.println("What is your street address");
        String streetAddress = abc.next();
        String address = abc.next();
        System.out.println("You have entered " + streetAddress + " " + address + " for your address.");














    }





}
