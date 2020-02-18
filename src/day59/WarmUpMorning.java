package day59;

public class WarmUpMorning {
    public static void main(String[] args) {

        //StringIndexOutBoundsException ArithmeticException
        System.out.println("Beginning");
        String str="ABC";
        int num1=10;
        int num2=0;
try {
    System.out.println("try started");
    System.out.println(str.charAt(100));
    System.out.println(num1 / num2);
    System.out.println("try ended");

}catch(Exception ex) {
    System.out.println("some exception happen");
}
        System.out.println("Ending");
    }
}
