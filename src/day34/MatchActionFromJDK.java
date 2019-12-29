package day34;

public class MatchActionFromJDK {
    public static void main(String[] args) {
    //there is a class under java.lang called Math
    //and it has lots of math utility methods that ready to be used
        String str ="Hello";
     int sum= Math.addExact(10,20);
        System.out.println("sum is "+sum);
        System.out.println("max of 10,20 is : "+Math.max(10,20));

        System.out.println("minimum number of : "+Math.min(-1,-99));

    }
}
