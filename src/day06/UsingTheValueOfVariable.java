package day06;

import java.util.Scanner;

public class UsingTheValueOfVariable {
    public static void main(String[] args) {


     int myFavoriteNumber = 300;
     int yourFavoriteNumber = myFavoriteNumber ;
     System.out.println(" My favorite Number " + myFavoriteNumber);
     System.out.println(" Your favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100 ;
        System.out.println(" My favorite Number " + myFavoriteNumber);
        System.out.println(" Your favorite Number " + yourFavoriteNumber);

        //Create a variable called yourOrder, type String and assign a value
        //optionally assign this value using Scanner
        //Create another variable called myOrder and assign the value
        // to same as value as yourOrder by copying
        //and just print them out.

        String myOrder = "milk";
        String yourOrder = "chocolate";
        System.out.println("My order is  " + myOrder);
        System.out.println("Your order is " + yourOrder);

        yourOrder = "chips";
        System.out.println("my order is " + myOrder);
        System.out.println("your order is " + yourOrder);
        System.out.print("my order is " + yourOrder);
        System.out.println("==============================");

        // Create a variable called yourOrder , type String
        // and assign a value
        // Create another variable called myOrder and assign the value
        // to same value as yourOrder by copying
        // and just print them out.
        Scanner input = new Scanner(System.in);
        System.out.println("WHAT IS YOUR ORDER ? I WANT THE SAME!");
        String yourOrder1 = input.nextLine();
        String myOrder1 = yourOrder;

        System.out.println("Your order is " + yourOrder1 + "\n" +
                "My order is " + myOrder1);









    }
}
