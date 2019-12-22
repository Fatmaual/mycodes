package day05;

import java.util.Scanner;

public class TimeConventerTasks {
    public static void main(String[] args) {
      /*
      Task 3:
      *Create an interactive program to ask user for day count
      *and generate minute that  day have
        * */
      /*
      Task 4:
      *Create an interactive program to ask user for hourly wage
      * and generate yearly salary
      assume that he works 2080 hour for a year
      **/
      /*
      Task 5: Grocery Shopping
      * ask user whats the price of tomato and store it
      ask user how many tomato you want to buy and store it
      ask user what is the price of potato you want to buy and store it
      *ask user what the price of banana and store it
      ask user how many banana you want to buy and store it
       */

      //TASK 3
        Scanner scan = new Scanner(System.in);
     //ask user how many days do you work?
     //generate how many minutes that those days work?
     System.out.println("How many days do you work in a week? ");
     int days = scan.nextInt();
     System.out.println("How many hours total do you work in a week?");
     int hour = scan.nextInt();
     int hours = days*hour;
     System.out.println("You work " + days*hour +" hours in a week.");
     int minutes = 60*hours;
     System.out.println("Also you work " + minutes+" minutes in a week.");

















    }
}
