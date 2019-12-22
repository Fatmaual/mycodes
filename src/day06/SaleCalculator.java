package day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {
        //Create a program to calculate the final discounted price of an Item
        //Create 3 double variables  called  regularPrice , salePrice and discount
        //
        //Ask user question using scanner for regularPrice and discountPercentage
        //And save the result into the variable
        //
        //Calculate sale price using above information
        //For example :  80 regular price , 0.2 for discount  , salePrice —>> 64
        //
        //Print out  : regular price is 80$ , discount is 0.2  and your got deal for


Scanner scan = new Scanner (System.in);
System.out.println("What is the regular price?");
double regularPrice = scan.nextDouble();
System.out.println("What is the discount rate?");
double discountRate = scan.nextDouble();
double salePrice = regularPrice - (regularPrice*discountRate);


System.out.println("regular price is " + regularPrice
+" $ ,discount is " + discountRate + " and your got deal for "+ salePrice+"$");











    }
}
