package day04;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner abc = new Scanner(System.in);
        System.out.println("enter your current speed");
        int currentSpeed = abc.nextInt();
        if(currentSpeed > 60){
            System.out.println("slow down");
            int diff = currentSpeed - 60;
             currentSpeed -= diff;
        }else {
            System.out.println("keep driving");
        }


    }
}
