package day06;


import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) {

        // + - * /
        // % this is another operator along with others
        //it's called modulus
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        System.out.println(" --- modulus . remainder --- ");
        // 5 divided by 2 is 2 and remainder is 1
        //2*2 + 1 = 5
        System.out.println(5 % 2);
        //10*9+9=99
        System.out.println(99 % 10);
        //10*10+0=100
        System.out.println(100 % 10);
        //declare a variable called minutes data type int
        //print the result in x hour y minutes format
        //for example 135 minutes , 2 hours 15 minutes
        Scanner scan = new Scanner(System.in);
        System.out.println("calculate  minutes that  how many hours and minutes");
        int minutes = scan.nextInt();

       int hour = minutes/60;
       int minutesPart = minutes%60;
        System.out.println("the minutes is : "+minutes+" is "+hour+ " hours and "+minutesPart+" minutes");


    }

}
