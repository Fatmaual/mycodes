package day57;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello B15 OnCampus Friends!");
       // int num=2.5;-->compile error!!
       int[]nums=new int[3];//[0,1,2]
        nums[0]=55;
        nums[1]=56;
        nums[2]=100;
     //   nums[3]=200;//ArrayIndexOutOfBoundsException->this is a class
        //->invalid index ->compile is ok with that but when we running it will give you compile error
        //what is java.lang ->the package
        //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        //at day57.ExceptionExample.main(ExceptionExample.java:11)->java:11 is line 11
        //when the program comes to the this line
        System.out.println("bye bye B15 inCampus");//this line does not run
     //  int result=10/0;//what kind of exception->java.lang.ArithmeticException: / by zero_.ArithmeticException
        //you create an object className:ArithmeticException and it thrown it there.this is description
        //ArithmeticException is thrown
        //cunku 0 a herhangibirsayi bolunur mu hayir! error

       // System.out.println("result is "+result);
        /**
         * error vs exception differences:
         * error->impossible to recover
         * happens during runtime
         * normally caused by environment....??
         *checked by compiler
         */

        int result1= 0/2;
        System.out.println(result1);

     //   int result3=10/0;
       // System.out.println(result3);
    }
}
