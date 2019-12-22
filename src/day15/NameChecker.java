package day15;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        //String myName ="Fatma";
       //System.out.println(myName.length( ));
        //System.out.println("myName  is = medium name");
       // System.out.println(myName.contains("a"));
       // System.out.println("myName contains a");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name pls");
        String name = scan.nextLine(); // sadece 1 kelime icinse next diyoruz
        int lengthOfThename = name.length();
        System.out.println("lengthOfThename = " + lengthOfThename);
        if(lengthOfThename < 4){
            System.out.println("short name");
        }else if (lengthOfThename >=4 || lengthOfThename <=4){
            System.out.println("medium name");
        }else {            //eger rest of them icinse baska birsey aramiyorsak sadece else diyip bitiriyoruz.!
            System.out.println("longer name");
        }
        ///  second part name contain method
        if (name.contains("a") || name.contains("e")){
            System.out.println("name contains a or e");
        }else{
            System.out.println("I don't have a or e in my name");
        }




    }
}
