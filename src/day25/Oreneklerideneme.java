package day25;

import java.util.Arrays;

public class Oreneklerideneme {
    public static void main(String[] args) {
        String name ="fatma";
        char[] namesChar = new char[5];// yada new char [ name.length() ]
        for (int x = 0; x < namesChar.length; x++) {
            namesChar[x]=name.charAt(x);
        }
        char[] namesChars2 = name.toCharArray();
        System.out.println("my name of characters : "+ Arrays.toString(namesChars2));
        Arrays.sort(namesChar);
        System.out.println(Arrays.toString(namesChar));


    }
}
