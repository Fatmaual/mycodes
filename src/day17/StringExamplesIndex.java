package day17;

import java.util.Scanner;

public class StringExamplesIndex {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("enter your name pls:");
        String name = abc.nextLine();
        int x = name.length()-1;
        while(x>=0){
            System.out.println("index "+x+ " : "+name.charAt(x));
            --x;
        }
    }
}
