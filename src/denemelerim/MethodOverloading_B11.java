package denemelerim;

import java.util.Arrays;

public class MethodOverloading_B11 {
    public static void main(String[] args) {
   String name="Java";
       // System.out.println(name.indexOf("a"));
        //System.out.println(name.indexOf("a",2));
       // System.out.println(name.replace('a','B'));
        //System.out.println(name.replace("va","java"));
        addNums(1,3);
        addNums(1,2,3);
        addNums(1,2,3);
        addNums(1,2,3,4);
        String word="coffee";
        char[] charofWord= word.toCharArray();
        System.out.println(Arrays.toString(charofWord));
        String[] worOfCharStr=word.split("");
        System.out.println(Arrays.toString(worOfCharStr));
        Arrays.sort(worOfCharStr);
        System.out.println(Arrays.toString(worOfCharStr));
    }
    public static int addNums(int num1, int num2){
        return num1+num2;
    }
public static int addNums(int num3, int num4, int num5){
        return num3+num4+num5;
}
public static void addNums(int num6, int num7,int num8,int num9){
    System.out.println("result is "+ (num6+num7+num8+num9));
}
}
