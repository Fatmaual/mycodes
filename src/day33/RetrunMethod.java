package day33;

public class RetrunMethod {
    public static void main(String[] args) {
       int result = add(10,20);
       String name =giveMeMyName();
        System.out.println("my instroctor' name is "+name);

    }
    public static int add(int num1, int num2){
        int sum =num1+num2;
        return sum;
    }
    public static String giveMeMyName(){
        return "Akbar";
    }
    public static int doubleTheNumber(int number){
        System.out.println("I am going to get double the value of "+number);
        int result =number*2;
        return result;
    }
   }

