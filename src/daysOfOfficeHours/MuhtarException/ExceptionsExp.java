package daysOfOfficeHours.MuhtarException;

public class ExceptionsExp {

    public static void main(String[] args) {
        String str= "Batch 15";

        try {
            char c = str.charAt(10);//unchecked exception
            System.out.println(c);
        }catch (RuntimeException e){
            System.out.println("String index out of bound exception");
        }
        try {
            Thread.sleep(5000);
            System.out.println("Test Completed");
            printHello();
        }catch(Exception e){

        }
    }
    public static void printHello(){
        try {
            Thread.sleep(3000);
            System.out.println("hello");
        }catch(Exception e){

        }
    }
}
