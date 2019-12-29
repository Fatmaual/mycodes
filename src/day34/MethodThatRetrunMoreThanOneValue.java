package day34;

import java.util.Arrays;

public class MethodThatRetrunMoreThanOneValue {
    public static void main(String[] args) {
        String sentence="I love Java";
        char[] eachChar = sentence.toCharArray();
        String[] eachCharSlit= sentence.split(" ");
        int[] resultArr=returnboysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));

    }
    public static int[] returnboysVSGirlsResult(){
        int[] boysGirlsCount ={57,57};
        return  boysGirlsCount;
    }
}
