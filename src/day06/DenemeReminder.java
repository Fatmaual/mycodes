package day06;


import day04.ScannerIntro;

import java.util.Scanner;

public class DenemeReminder {
    public static void main(String[] args) {

       double price;
       double discount;
       Scanner abc = new Scanner(System.in);
        System.out.println("enter your price and discount please");
        price= abc.nextDouble();
        discount =abc.nextDouble();
        double finalPrice =price -(price*discount);
        System.out.println("regular  price is:"+price+" , discount is: "+discount+" and you got deal " +finalPrice);








    }
}
