package day32;

public class Akbarintaski {

    public static void main(String[] args) {
        repeatString("Java", 3);
        repeatString("DO NOT TOUCH WORKING CODE", 10);
        skipCountBy3From0to50();
 //       countDownByEvenNumberFromXtoY(10, 6);
   //     countDownByEvenNumberFromXtoY(6, 10);
     //   countDownByEvenNumberFrom50to0();
    }
    /**
     * skipCountBy3From0to50
     */
    public static void skipCountBy3From0to50() {
        for (int i = 0; i < 50; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    /**
     * * numberComparision
     * * this method has 2 parameters called num1 and num2
     * * if num1 is more than num2 print num1 is more than num2
     * * if num2 is more than num1 print num2 is more than num1
     * * if num2 are equals num1 print they are equal
     * *
     *
     * @param number1
     * @param number2
     */
    public static void numberComparision(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("num1 is more than num2");
        } else if (number2 > number1) {
            System.out.println("num2 is more than num1");
        } else {
            System.out.println("they are equal");
        }
    }

    /**
     * This method will pring from 1 to the number user passed
     * This method will print from 1 to the number user passed
     *
     * @param x
     */
  //  @@ -94,32 +94,15 @@ public static void countDownByEvenNumberFromXtoY(int x, int y) {
     //   System.out.println();
  //  }


    /**
     * Create static void methods as below
     *
     *
     * skipCountBy3From0to50
     *
     * * create a method that has no parameter
     * and skip count by 3 from 0 to 50
     *
     *
     * print1toX
     * * create a method that has 1 int parameter called x
     * print from 1 to that number in one line
     * print an empty line after the print.
     *
     *
     */

     /*
      * repeatString
      *  this method has 2 parameters
      *     String strToRepeat and int count
      *    repeat printing the string as many time as <count> number define
            repeatString("Java", 3) -->> Java Java Java
     * */

    public static void repeatString(String strToRepeat, int count) {

        for (int i = 1; i <= count; i++) {
            System.out.print(strToRepeat + " ");
        }
        System.out.println();

    }
    }

