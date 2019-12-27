package Denemelerim;

import java.util.Scanner;

public class ReplysOME {
    public static void main(String[] args) {
        /**
         Write a loop that displays all possible combinations of two letters where the
         letters are 'z', or 'y', or 'x', or 'w', or 'v'.
         The combinations should be displayed in descending alphabetical order:
         zz
         zy
         zx
         zw
         zv
         yz
         ....
         vv
         */
Scanner input= new Scanner(System.in);
 String[] words={input.nextLine(),input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine()};
        System.out.println(words.toString());
    }
}

