package day18;

import java.util.Scanner;

public class BeginningWithLoop {
    public static void main(String[] args) {
      //  int x = 10;
       // while(x>5){
         //   System.out.println(x+ " is more than 5");
           // --x;
        //}
        //System.out.println("the end");
        //soru keep asking 20 dolar or 5 dollar until you get them!
        Scanner scan = new Scanner (System.in);
        System.out.println("pls give me 5 or 20!!");
        int x = scan.nextInt();

      while (x!=5 && x!=20){   //yada soyle de deniyebilirsin while(!(x==5 || x==20))
          System.out.println("not the bill I am asking for");
          System.out.println("pls give me 5 or 20");
          x = scan.nextInt();
      }
        System.out.println("the happy ending!! got the money!!");
    }
}
