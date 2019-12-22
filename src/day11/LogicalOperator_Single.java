package day11;

import java.util.Scanner;

public class LogicalOperator_Single {
    public static void main(String[] args) {
    // for double & if false ile baslarsa digerlerini extra check yapiyoruz
        // 9 divided by 0 is 3 bu sekil yazdi

        // combine the result of
        // checking 10 is more than 5
        //or divided by 0 is 3

        //System.out.println(10>5 || 9/0 == 3); //10>5 is true(first one) so the whole result will be true!
        //System.out.println(10>5 | 9/0 == 3);//it goes next operation bc just |(sadece bir tane)

        System.out.println(true);
        System.out.println(false);
        System.out.println(! true); //eger ! isareti koyarsan tersini yapiyor
        System.out.println(!false); // it is going to be opposite

         boolean isRecording = false; // ! isareti sadece boolean icin kullaniyor yani cevabini true yada false veriyor
        System.out.println("result of ! recording -->");
        System.out.println( ! isRecording);

        int a = 10;
        System.out.println("result of (a>10) is ");
        System.out.println(!(a >10 ));
        int x = 7;
        System.out.println("result of (y >10 )");
        System.out.println(!(x>10));
        //!(x>10)-->> x<=10











    }
}
