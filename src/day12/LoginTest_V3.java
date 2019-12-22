package day12;

import java.util.Scanner;

public class LoginTest_V3 {

    public static void main(String[] args) {
        //formul bu sekilde
        //equalIgnoreCase sadece ve sadece string icin!!!!!!!!!!!!

        Scanner scan = new Scanner(System.in);// new anlami new object has been creating
        System.out.println("enter your season please!!");
        String season = scan.next();
        if( season.equalsIgnoreCase("spring")){
            System.out.println("hiking navruz, alergy season,cool weather");
        }else if(season.equalsIgnoreCase("summer")){
            System.out.println("go to the beach");
        }else if(season.equalsIgnoreCase("fall")){
            System.out.println("take a walk");
        }else if(season.equalsIgnoreCase("winter")){
            System.out.println("study");
        }else{
            System.out.println("not valid");
        }

    }
}
