package day19;

import java.util.Scanner;

public class WarmUpSpeedAction {
    public static void main(String[] args){
      /**
       *   int speed = 27;
       *for(speed = 10; speed<=27; ++speed){
       *           System.out.println("speed is getting increased "+ speed);
       *       }if(speed == 2 && speed<5){
       *             System.out.println("speed is "+speed);
       *  }
       *  for(int i = 1; i<=10; i++){
       *           System.out.println(i+" ");
       *       }
       *
       * */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter starting speed and ending speed");
      int start= scan.nextInt(); // 15;
      int end = scan.nextInt(); //29; scanner kullanmasaydim variable koyacaktim

        System.out.println("you have started at speed and ending speed");
       for(int i = start ; i <= end ; i++){ //bu formul cok onemli!!
           System.out.print(i +",");
           // iki spped input al  scannerda start end
       }

    }
}
