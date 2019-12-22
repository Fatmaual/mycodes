package day10;

import java.util.Scanner;

public class WarmUp {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // create a variable called myAnswer as String with value of empty string
        String myAnswers = "";
        int myNumber = 10;
        if(myNumber % 5 == 0){
            myAnswers = "fizz number";
        }else{
            myAnswers= "is not fizz number";
        }
       System.out.println("print my number is"+myNumber+"it is "+myAnswers);
    }
}
