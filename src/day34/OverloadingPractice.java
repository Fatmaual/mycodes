package day34;

import org.w3c.dom.ls.LSOutput;

public class OverloadingPractice {
    public static void main(String[] args) {
        /**
         * Create a class called OverloadingPractice
         * create 4 static void overloaded version of add method
         * 	1, add
         * 		has 1 int parameter and add 100 to that number
         * 		and print out the result
         * 	2, add
         * 		has 2 int parameters and add them to get sum
         * 		and print out the result
         * 	3, add
         * 		has 3 int parameters and add them to get sum
         * 		and print out the result
         * 	4, add
         * 		has 2 long parameters and add them to get sum
         * 		and print out the result
         * */
    add(15);
    add(15,45);
    add(15,43,67);
    add(15l,23l);

    }
    public static void add(int a){
        System.out.println(a+100+ " caling int add (int i) ");
       // System.out.println("the result is: "+number);
      //  add(a,100);
    }
    public static void add(int a, int b){
        System.out.println(a+ b +" calling add(int a , int b )");
      //  System.out.println("the result of sum is : "+(num1+num2));
    }
    public static  void add(int a,int b, int c){
        System.out.println(a+ b +c + " calling add(int a , int b,int c )");
       // System.out.println("the result of sum of the 3 numbers : "+(num1+num2+num3));
    }
    public static void add(long a,long b){
        System.out.println(a+b +" calling add(long  a , long  b )");
      //  System.out.println("the result of the long numbers: "+(num1+num2));
    }
}
