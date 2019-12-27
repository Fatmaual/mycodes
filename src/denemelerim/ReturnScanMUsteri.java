package denemelerim;

import java.util.Scanner;

public class ReturnScanMUsteri {
    public static void main(String[] args) {
        String MusteriInfo=MusteriBilgileri();
        System.out.println("Hello "+MusteriInfo);
    }
    public static String MusteriBilgileri(){
        Scanner scn =new Scanner(System.in);
        String name;
        String lastName;
        System.out.println("please enter your name: ");
        name=scn.nextLine();
        System.out.println("please enter your last name: ");
        lastName=scn.nextLine();

        return name+" "+lastName;
    }
}
