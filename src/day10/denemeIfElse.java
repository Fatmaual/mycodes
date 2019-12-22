package day10;

import java.util.Scanner;

public class denemeIfElse {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        //starbuksada calismak ister misin
        //degilse kutuphanede
        //degilse evde
        //bitir
        System.out.println("Do you want to study on Starbucks?");
        boolean study = abc.nextBoolean();
        String  starbucks =abc.next();
        String  libraryChoose =abc.next();

     if(study){
       System.out.println("you can study at a library");
        }else{
         System.out.println("you can study at home");
     }

    }
}
