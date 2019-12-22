package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
    //checking for String equality herzaman bir method icinde olmasi lazim o da;
        // oneString.equals(anotherString)--> true or false
        //sadece iki String compare yapabiliyorsun bu methodla
        System.out.println("Java".equals("java")  );
        String myStr = "Java";
        System.out.println( myStr.equals("Java")  );
        String yourStr = new String("Java");
        System.out.println( "is my string same as your string?" );
        System.out.println( myStr.equals(yourStr)    );
        System.out.println(yourStr.equals(myStr) );
        // create a program to check whether myStr value equal to yourStr value
        //if true -->> correct word
        //if false --- say Java!!
        if(myStr.equals("Java")   ){
            System.out.println("correct word!!!");
        }else{
            System.out.println("say Java");
        }
    }
}
