package daysOfOfficeHours.MuhtarException;

public class ExceptionPractice {
    public static void main(String[] args) {

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Interrupted is handled");
        }
        try {
 int [] arr ={1,2,3};
            System.out.println(arr[50]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception is handled");

        }catch(IndexOutOfBoundsException e){
                System.out.println("index out of boundException is handled");

            }catch (ClassCastException e){
                System.out.println("class cast exception is handled");

            }catch(ArithmeticException e){
                System.out.println("Arithmetic exception is handled");

            }catch (IllegalStateException e){
            System.out.println("illegal state exception");

    }catch(RuntimeException e){
            System.out.println("Runtime exception");

        }
        System.out.println("Test Completed!");
    }
    }

class Test{
    public static void main(String[] args) {
        int[] numbers= {10,20,30,40};
        System.out.println(numbers[0]);
        try {
            System.out.println(numbers[100]);

        }catch(RuntimeException e){
            System.out.println("Runtime exception is occur");
        }
        System.out.println(numbers[2]);
        System.out.println("test completed");

    }
}
