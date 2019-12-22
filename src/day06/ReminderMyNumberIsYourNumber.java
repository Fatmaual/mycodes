package day06;


import java.util.Scanner;

public class ReminderMyNumberIsYourNumber {
    public static void main(String[] args) {
        int myNumber = 11;
                int yourNumber = 20;
        System.out.println(yourNumber%myNumber);
        int myFavoriteNumber = 3;
        int yourFavoriteNumber = myFavoriteNumber;
        yourFavoriteNumber =100;
        System.out.println("my favorite number "+myFavoriteNumber);
        System.out.println("your favorite number is "+yourFavoriteNumber);

        Scanner input = new Scanner(System.in);
        System.out.println("what is your order? ");
        String yourOrder = input.nextLine();
        String myOrder = yourOrder;
        System.out.println("your order is: "+ yourOrder+"\n"+ "my order is: "+ yourOrder);





    }
}
