package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name = "Alesya";
        char[] namesChar = new char[6];// yada new char [ name.length() ]
        for (int x = 0; x < namesChar.length; x++) {
            namesChar[x]=name.charAt(x);
        }
        System.out.println("name of characters : "+ Arrays.toString(namesChar));
        char[] namesChars2 = name.toCharArray();
        System.out.println("name of characters second way : "+ Arrays.toString(namesChars2));

    }
}
