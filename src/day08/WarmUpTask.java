package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess my favorite number : ");
        int myFavoriteNumber = scanner.nextInt();
        if (myFavoriteNumber == 300) {
            System.out.println("Bingo!!!");
        }else{
            System.out.println("you are not my best friend, try again ");
        }
        System.out.println("Can you guess my age?");
        int myAge = scanner.nextInt();
        if (myAge == 40) {
            System.out.println("Yes! You are right!!");
        }else {
            System.out.println("Sorry try next time");
        }


        }
    }