package day04;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println( "Enter Fahrenheit") ;

        double fahrenheit = scan.nextDouble() ;
        double celsius = (5/9.0)* (fahrenheit -32) ;
        System.out.println(fahrenheit + "f = " + celsius + " 56C.");





    }







}
