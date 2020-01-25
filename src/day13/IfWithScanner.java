package day13;


import java.util.Scanner;

public class IfWithScanner {
    public static void main(String[] args) {
        String study = "Starbucks";
        if (study.equals("Starbucks")) {
            System.out.println("study well!!!");
            System.out.println("I believe you!!!");
            System.out.println("you got this!!!");
            if (study.equals("at home")) {
                System.out.println("study well!!!");
                System.out.println("I believe you!!!");
                System.out.println("you got this!!!");
                if (study.equals("library")) {
                    System.out.println("study well!!!");
                    System.out.println("I believe you!!!");
                    System.out.println("you got this!!!");

                } else {
                    System.out.println("you seem yo wan to study at home");
                }
            }
            System.out.println(study.equals("library"));
            Scanner scn = new Scanner(System.in);

            System.out.println("Where do you want to study? ");
            String answer = scn.nextLine();
            if (answer.equals("Starbucks")) {
                System.out.println("good choice");
            } else if (answer.equals("seklinde gidiyor.....")) {
                System.out.println("good choise");
            } else {
                System.out.println("you seem you don't want to go anywhere..");

            }
        }
    }
}