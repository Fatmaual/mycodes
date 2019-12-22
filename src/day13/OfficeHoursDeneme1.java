package day13;

import java.util.Scanner;

public class OfficeHoursDeneme1 {
    public static void main(String[] args) {
        // 1- assignment(atama) operator(islemleri) ornek; int x = 10;
        //2-; >=greater than equal 7>=7 -->> true
                 //          <=less or equal   5<=4 --> false
               //         == checking for equality 51 == 54 -->false
              //         != cheking for inequality  51!= 56--> true
        //    3-shorthand | compound  operator
        //     += for example : x = x+10 --> x +=10;
        //    String text = "hello";
        //    text = text +"world"; --> text += "world;
        // -= for example : x = x -10 --> x -=10;
        // *=              x = x*10 --> x *=10;

       //repl.it soru 21:
       // scanner ile olan bir soruda kesinlikle sen value vermiyorsun task code larda veriyorsun
        // display prompt ne demek ask question demek show some messages
        Scanner abc = new Scanner(System.in);
        int num1, num2, num3, sum;
        System.out.println("Enter 3 number");
         num1 = abc.nextInt();
        num2 = abc.nextInt();
        num3 = abc.nextInt();
        sum = num1+num2+num3 ; //"sum of numbers :valueOfSum
        System.out.println("sum of numbers:" +sum);

     /**
      *
      * // logical operators:
      *      && & logical and    & ampersand
      *      || |  logical or    | pipe
      *      !  logical not       ! exclamation mark
      * logical operator ile alakali once metin yaz sonra onu bu sembollerle yazmaya calis.
      *
      * */




    }
}
