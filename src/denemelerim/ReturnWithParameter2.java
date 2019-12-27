package denemelerim;

import java.util.Scanner;

public class ReturnWithParameter2 {
    public static void main(String[] args) {
        System.out.println(UsingScanner());

        System.out.println("your name is : "+UsingScanner());


    }
    public static String UsingScanner(){
        Scanner sc = new Scanner(System.in);
        String name;
        String lastname;
        System.out.println("please enter your name: ");
        name=sc.nextLine();
        System.out.println("enter your last name please: ");
        lastname=sc.nextLine();
        return name+" "+lastname;
    }

    }

