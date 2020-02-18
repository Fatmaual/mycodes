package day57;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Berofe try catch: ");
        try {
            System.out.println("In try block");
            int result = 10 / 0;
            System.out.println("After 10/0 line");
        }catch(ArithmeticException e){
            System.out.println("exception happened , and was caught and handled!");
        }
        System.out.println("after try catch");

        try{
            System.out.println("in second Try block");
            String str="java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch(Exception e){
            System.out.println("Exception was happened in Try Block and caught");
        }
        System.out.println("After second try catch..");
    }
}
