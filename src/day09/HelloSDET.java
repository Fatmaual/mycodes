package day09;

import java.util.Scanner;

public class HelloSDET {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Calling Center");
        System.out.println("Please select the values 1-4 for saying greeting?");
        int languageOption = abc.nextInt();
        String greeting = " ";
        if(languageOption == 1){
            System.out.println("Selam");
        }else if(languageOption==2){
            System.out.println("Hello");
        }else if(languageOption== 3){
            System.out.println("Bonjour");
        }else if(languageOption == 4){
            System.out.println("szie");
        }else{
            System.out.println("language is not known");
            System.out.println();
        }
        greeting = greeting + " Hello , SDET";
        System.out.println("This is how the greeting message you get : "+ greeting);
    }
}
