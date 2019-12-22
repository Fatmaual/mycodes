package day05;

public class VariablePractice {

  public static void main ( String[]args) {

      // 8 primitive
      /*
      Block comment, everything in between will be seen as comment

      whole numbers    : byte, short, int, double
      fractional numbers : float , double
      logical : boolean ( true, false)
      character : char(single character in single quote)
      usually by default for whole numbers :just use int
      usually by default for fractional numbers: just use double
      Is String part of Primitive types? NOOOOOO!!!!!
      String is sequence of character
       */
      // Task 1: age calculator
      // given birth year, please calculate the age
      int birthYear = 1979 ;
      int currentYear = 2019 ;
      int age = currentYear - birthYear ;

       // I was born in year 1979, and I am 40 years old ;
      System.out.println(" I was born in year " + 1979 + " , and I am " + (2019-1979) + " years old") ;
      System.out.println(" I was born in year " + birthYear + ", and I am " + age +" years old") ;

      //Task 2: you are speeding today
      // speed limit is some number , and your current speed is this
      // generate this output of : You are driving 10 mph more than speed limit
      //speedLimit as int, currentSpeed as int , overTheLimit as int
      int mySpeed = 70 ;
      int generateSpeed = 40 ;
      int speed = mySpeed - generateSpeed ;
      System.out.println("The speed limit is "+ generateSpeed +  ".");
      System.out.println("I am driving " + mySpeed + " and I am over the " + speed + " mph.");












  }









}
