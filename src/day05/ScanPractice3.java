package day05;

import java.util.Scanner;

public class ScanPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asking user are you recording
       // System.out.println("Are you recording? ");
        //boolean isRecording = input.nextBoolean();
        //System.out.println("We are recording " + isRecording);
        //System.out.println("Are you sleeping? ");
        //boolean isSleeping = input.nextBoolean();
        //System.out.println("Are you sleeping? " + isSleeping);

        System.out.println("Are you coming here?");
        boolean comingHere = input.nextBoolean();
        System.out.println();

        // asking user are you recording
        System.out.println(" are you recording ? ");
        boolean isRecording = input.nextBoolean();

        // The result of concatenating a string to any data type -->> String
        System.out.println("We are recording  " + isRecording);


    }

}

