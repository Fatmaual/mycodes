package day19;

import java.util.Scanner;

public class WarmUpSpeed2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your speed");
        int start = scan.nextInt();
        int end = scan.nextInt();

    if(start<end){
        System.out.println("increasing speed");
        for(int i = start ; i<=end ; i++){
            System.out.print(i+",");
        }
    }else if(start>end){
        System.out.println("decreasing speed");
        for(int x = start ; x >= end ; x--){
            System.out.print(x+",");
        }
    }else{
        System.out.println("no action needed !!same speed" );
    }

    }
}
