package day05;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        /*
      Task 4:
      *Create an interactive program to ask user for hourly wage
      * and generate yearly salary
      assume that he works 2080 hour for a year
      **/
        System.out.println("How much does your wage hourly?");
        int hourlyWage = scan.nextInt();
        System.out.println("Your hourly wage is : $" + hourlyWage);
        System.out.println("How many hours do you work yearly?");
        int yearlySalary = scan.nextInt();
        int yearlyHour = 2080;
        System.out.println("Your yearly salary is : $" + (yearlyHour * hourlyWage));








    }




}
