package day19;

import java.util.Scanner;

public class CharAndLoop {
    public static void main(String[] args) {


        // each character has it's corresponding ascii value
        // from ascii table
        //int x = 'A' ;
        //System.out.println(x);

        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)
        Scanner scan = new Scanner(System.in);

        System.out.println("pick your first character by charAt()");
        String charAt = scan.nextLine();
        int firstCha = scan.nextInt();
        String name="Fatma";
        int cnt=0;
        for (int x = 0; x <name.length() ; x++) {


        }

    }

}
