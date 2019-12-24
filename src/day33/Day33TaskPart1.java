package day33;

public class Day33TaskPart1 {

    public static void calculateMathProblem(){
 //Create a method to take above action , call it calculateMathProblem()
        int num1=5;
        double num2=3.0d;
        float num3=3.0f;
        double result1= num1+num2;
        double result2=num1-num2;
        double result3=num1*num2;
        double result4=num1/num2;
        float result5=num1/num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
    public static void SevenTimesOfHello(){
 //Create a method called print 7 line of hello and call it sayHelloWorld7Times
        // 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.print("Hello world line 4 ");
        System.out.print("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");

        System.out.println("hello world line 1");
        System.out.println("hello world line 2");
        System.out.println("hello world line 3");
        System.out.println("hello world line 4");
        System.out.println("hello world line 5");
        System.out.println("hello world line 6");
        System.out.println("hello world line 7");
    }
    //store this string with a method i can't do it that can instead of can't
    //run it 15 times
    public static void ICanDoIt(){
        String sentence="I can't do it";
        String keyword= sentence.replace("can't","CAN");
        for (int i = 0; i <3 ; i++) {
            System.out.println(keyword+"!!!");

        }
    }
    public static void main(String[] args) {
        ICanDoIt();
        SevenTimesOfHello();
        calculateMathProblem();

    }

    }

