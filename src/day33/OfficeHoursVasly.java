package day33;

public class OfficeHoursVasly {
    public static void main(String[] args) {
String word = "computer";
        System.out.println(reverseString(word));
        add(5,10);
        int result =addWhiteReturn(5,60);
        System.out.println("result is "+result);
        int myResult = findtheAge(2);
        System.out.println("my age is "+myResult);
    }
    public static String reverseString(String str){
        String reverseString ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseString=reverseString+str.charAt(i); //reverseString+=str.charAt(i);
        }
        return reverseString;
    }
    public static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static int addWhiteReturn(int num1, int num2){
        return num1+num2;
    }
    public static int findtheAge(int theAge){
        int myAge= theAge*20;
        return myAge;
    }
}
