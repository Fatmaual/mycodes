package day32;
/**
 * Create static void methods as below
 *
 * numberComparision
 * this method has 2 parameters called num1 and num2
 * if num1 is more than num2 print num1 is more than num2
 * if num2 is more than num1 print num2 is more than num1
 * if num2 are equals num1 print they are equal
 *
 * String repeater
 * this method has 2 parameters
 *     String strToRepeat and int count
 *    repeat printing the string as many time as <count> number define
 *
 * skipCountBy3From0to50
 *
 * * create a method that has no parameter
 * and skip count by 3 from 0 to 50
 *
 * countDownByEvenNumberFrom50to0
 * * create a method that has no parameter
 * and count Down By Even Number From 50 to 0
 * for example 50 , 48 , 46 .....0
 *
 * print1toX
 * * create a method that has 1 int parameter called x
 * print from 1 to that number in one line
 * print an empty line after the print.
 *
 *
 */

public class NumberAction {
    public static void print1toX(int x){
        for (int i = 1; i <=x ; i++) {
            System.out.print(i+" ");
            }

            System.out.println();

        }

    public static void countDownbyEvenNumberFrom50to0(){
        for (int i = 50; i >=0 ; i--) {
            if(i%2==0){
                System.out.print(i+" ");

            }
        }
        System.out.println();
    }
    public static void skipCountBy3From0To50(){
        for (int x = 0; x <=50 ; x++) {
            if(x==3){
                continue;

            }
            System.out.print(x+" ");
        }

    }
    public static void repeater(String strtoRepeat, int count){
        for (int i =0; i <=strtoRepeat.length(); i++) {
            count++;
            if(count==strtoRepeat.length()){
                break;
            }
            System.out.print(i+" ");
        }

    }
    public static void numberComparison(int num1,int num2){
        if(num1>num2){
            System.out.println("num1 is more than num2");
        }else if(num2>num1){
            System.out.println("num2 is more than num1");
        }else{
            System.out.println("they are equal");
        }
    }
    public static void main(String[] args) {
    //this method has 2 parameters num1 num2
    //if num1>num2 print => num1 is more than num2
    //if num2 >num1 num2 is more than num1
    //if num2 are equal num1 print they are equal
    numberComparison(10,10);
    numberComparison(90,54);
    numberComparison(1999888,22200000);
    repeater("Fatma",7);
        System.out.println();
    repeater("Sadiye",6);
    skipCountBy3From0To50();
        System.out.println();
    countDownbyEvenNumberFrom50to0();
        System.out.println();
        print1toX(9);
    }
}
