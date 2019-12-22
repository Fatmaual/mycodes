package day05;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner grocery = new Scanner(System.in);
        /*
      Task 5: Grocery Shopping
      * ask user whats the price of tomato and store it
      ask user how many tomato you want to buy and store it
      ask user what is the price of potato you want to buy and store it
      *ask user what the price of banana and store it
      ask user how many banana you want to buy and store it
       */

        System.out.println("What is the tomatoes' price:");
        double tomatoesPrice = grocery.nextDouble();
        System.out.println("How many tomatoes you want to buy?");
        int tomatoes = grocery.nextInt();
        System.out.println("How many potatoes do you want to buy?");
        double potatoes = grocery.nextDouble();
        System.out.println("What is the banana's price? ");
        double banana = grocery.nextDouble();
        System.out.println("How many pounds banana do you want to buy?");
        double bananaPrice = grocery.nextDouble();








    }
}
