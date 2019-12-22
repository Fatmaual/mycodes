package day06;

import java.util.Scanner;

   public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
    Scanner den = new Scanner(System.in);
    System. out.println("What is your name? ");
    String name = den.nextLine();
    System.out.println("Your name is "+ name);

    System.out.println("What is your age? ");
    int age =  den.nextInt();
    //String age = den.nextLine();
     // notice we are not storing this into variable
     //we just want below line to capture ENTER keyboard input
     //so that it does not accidentally get captured bu
     //the nextLine we use to capture address
     den.nextLine();
    System.out.println("your age is "+ age);

    System.out.println("What is your address");
    String address = den.nextLine();
    System.out.println("Your address is "+ address);



    }













}
