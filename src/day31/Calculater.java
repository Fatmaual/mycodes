package day31;

public class Calculater {
    public static void main(String[] args) {
//create a static method that add
//it accept two numbers and print the result of addition
  add(6,23);
  add(2,60);
  add(40,10);
  add3Numbers(10,5,20);
    }
//this static method has two int parameters
public static void add(int num1, int num2){ //how many parameter we can add as much as you want !!
    System.out.println("Addition result "+(num1+num2));
    }
public static void add3Numbers(int num1, int num2, int num3){
    System.out.println("Addition 3 numbers : "+(num1+num2+num3) );
}

}
