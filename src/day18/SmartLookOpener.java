package day18;

import java.util.Scanner;

public class SmartLookOpener {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("knock knock ");
        System.out.println("what is the password??");
        String password = abc.next();
        while (!password.equals("B15")){ //ignorecase de koyabilirsin
            System.out.println("wrong password try again!!");
            password = abc.next();

        }
        System.out.println("door opened!");
    }

}
