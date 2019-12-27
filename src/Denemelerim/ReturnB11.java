package Denemelerim;

//import java.util.Scanner;

public class ReturnB11 {
    public static void main(String[] args) {
 //       boolean exists = false;
   //     Scanner scan = new Scanner(System.in);
   //     String word = scan.next();
        //Given a string word, print true if "java" appears starting at index 0 or 1 in the
        // string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
        // The string may be any length, including 0word = .
        //Example:
        //input: javapython
        //output: true
        //Example:
        //input: cjavac++
        //output: true
        //Example:
        //input: c#javaruby
        //output: false
        //GET THE SECOND CRAHARECTER
  String name ="Yasemin";
 char secondChar= name.charAt(1);
        System.out.println(secondChar);
        System.out.println( giveMe5());
        int giveMethod= giveMe5();
        System.out.println(giveMethod);
     long firstYearSalary=mySalary();
  //   long SecondYearSalary=firstYearSalary+firstYearSalary;
        long secondYearSalary=(long)(firstYearSalary*0.5);
        System.out.println(firstYearSalary+secondYearSalary);

      //  System.out.println(secondYearSalary);
        int age=0;
        if(age>18){
        }else{
            System.out.println(isAdultOrNot(20));
        }

    }
    public static int giveMe5(){

        return 5;
    }
    public static long mySalary(){
        return 1800000l;
    }
    public static boolean isAdultOrNot(int age){
        return true;
    }
}
