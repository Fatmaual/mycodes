package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFurkan2 {
    public static void main(String[] args) {
        System.out.println("The Start"); //-> line 1
        String name = "Furkan";//->line 2
        Scanner scan = new Scanner(System.in);//->line 3
        System.out.println("Character at what index you want to get from Furkan's name ? ");//->line 4

 //       try {
 //       int targetIndex = scan.nextInt();//->line 5
  //      System.out.println(name.charAt(targetIndex));//->line 6 STOBE captured here in this line
  //          System.out.println("end of try");
 //       }catch(StringIndexOutOfBoundsException e){//->and right after captured came here
  //          System.out.println("Something unusual happen!!!");


        try {
            int targetIndex = scan.nextInt();
            System.out.println(name.charAt(targetIndex));//  LINE 5 AND user entered abc characters and what happened??
            //so abc is input mismatch first catch about index of string and it will try second one bc input mismatch!!!
            System.out.println("try method basari ile tamamlandi catch methoda gerek yok");
        }catch(StringIndexOutOfBoundsException e){ //StringIndexOutOfBoundsException e= new InputMismatchException
            System.out.println(" ilk yanlis islem girildi ");
            System.out.println("enter between 0 and "+name.length());
        }catch(InputMismatchException ikinciyanlis){
            System.out.println("Input mismatch, oyuzden baska bir catch method olusturuldu enter number again");
            System.out.println("here is what you get if you enter 0 "+ name.charAt(0));
        }
        System.out.println("The End");
    }
}
/**
 *
 import java.util.InputMismatchException;
 import java.util.Scanner;

 public class ExceptionPractice2 {


 public static void main(String[] args) {


 System.out.println("The Start");
 String name = "Furkan";

 Scanner scan = new Scanner(System.in);
 System.out.println("Character at what index you want to get from Furkan's name ? ");

 // we want to take different action according to
 // different type of exception happen during the program
 // We can have more than one catch block
 // to handle different types of exception
 // and take action according to the exception type at runtime

 try {
 int targetIndex = scan.nextInt();
 System.out.println(name.charAt(targetIndex));
 System.out.println("end of try");

 } catch (StringIndexOutOfBoundsException e) {

 System.out.println("You are out of bound !!!!");
 System.out.println("Enter between 0 and " + name.length());

 } catch (InputMismatchException bla) {

 System.out.println("Input mismatch , enter number!!");
 System.out.println("Here is what you get if you enter 0 " + name.charAt(0));
 // YOU CAN HAVE AS MANY CATCH BLOCK AS YOU WANT !!!!
 } catch (Exception e) {
 System.out.println("IF I DONT CATCH ABOVE 2 TYPES I WILL COME HERE!!!");
 }
 System.out.println("The End");

 }

 }
 */
