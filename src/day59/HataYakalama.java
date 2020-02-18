package day59;

public class HataYakalama {
    public static void main(String[] args) {

        int[] number = {100, 200, 300};
        try {
            System.out.println(number[5]);
            System.out.println("checked exception, try block occur");

        }catch(ArrayIndexOutOfBoundsException exp){
            System.out.println("the unchecked exception, catch block executed !!!");

        }
        //compile error is not happy with that. so we have to handle it firstwhat we are
        // gonna do ->try and catch
        System.out.println("------------------------------");
        try {
            Thread.sleep(2000);
            System.out.println("try block executed , checked exception ");
        }catch(InterruptedException e){
            System.out.println("catch block executed , unchecked exception ");
        }


        System.out.println("work done");

    }
    public static void method(String kfc){

    }
}
