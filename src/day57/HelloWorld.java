package day57;

public class HelloWorld {
    public static void main(String[] args) {
    //it first compile first then execution happens,if something happens there is compile error!
        System.out.println("Hello World");
        int[] nums={34,12,5};
     //   System.out.println(nums[3]);
     //programs runs line by line from top to bottom when program it comes this line the code will stop right here
    //invalid index it will throw exception and execution stops. The remaining statements will not run!!!
    String str="java";
        System.out.println(str.charAt(10));//no compile issues compiles successfully,but when the code is running it
        // will be compile error "runtime exception" ->StringIndexOutOfBoundsException: String index out of range: 10
        //when your code is running ,it will run top to bottom line by line, when java sees a line that has error,it
        //will throw exception. runtime exception
        //Exception: is any event that interrupts the normal flow of program execution
        //COMPILE ERROR-> ERROR DURING COMPILE PROCESS
        //EXCEPTION -> error during running process
        //Since java is object oriented language, even Exceptions are also OBJECTS that are created.
        //for each Exception in Java, there is a Class.Whenever error happens during runtime, object is created from a
        // matching class.
        //if your code is reading from invalid index, then object from ArrayIndexOutOfBoundsException class is created
        // and THROWN
        System.out.println("hello B15!!!");


    }
}
