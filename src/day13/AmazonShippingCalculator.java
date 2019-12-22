package day13;

import java.util.Scanner;

public class AmazonShippingCalculator {
    public static void main(String[] args) {
        /** usera shopping yapmak isteyip istemedigini sor if yes
         *
         * */
        boolean youWantToShop = true; // or false affect the answers
        String preference = "online";
        //Scanner scan =new Scanner(System.in);
        //"Do you want to shop");
        if (youWantToShop == true) {
            if (preference.equals("store")) {
                System.out.println("going to store for shopping?");
            } else {
                System.out.println("want to shop online?");
            }
        }else {
            System.out.println("stay at home and coding!!!");
        }
        }
    }