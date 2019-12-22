package day15;

import org.w3c.dom.ls.LSOutput;

public class MyTrySubstring {
    public static void main(String[] args) {
        //                 012345678901234567890
        String sentence = "Fatma Keremi  seviyor";
        int firstSpaceIndex= sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);
        String firstWord = sentence.substring(0,firstSpaceIndex);
        System.out.println(firstWord);
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);
        String secondWord =sentence.substring(firstSpaceIndex+1, lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);
        String lastWord = sentence.substring(lastSpaceIndex);
        System.out.println("lastWord = " + lastWord);

        

        /**
         * //                 01234567890
         * String sentence1 ="I love kids";
         * String secondWord; //location herzaman index!!! how can I get location ->> substring!!
         * int firstSpaceIndex = sentence1.indexOf(" ");
         * System.out.println("firstSpaceIndex = " + firstSpaceIndex);
         * int lastSpaceIndex = sentence1.lastIndexOf(" ");
         * System.out.println("lastSpaceIndex = " + lastSpaceIndex);
         * System.out.println(sentence1.substring(1+1,6));// aslinda o (2,6)
         * secondWord = sentence1.substring(firstSpaceIndex+1 , lastSpaceIndex );
         * System.out.println("second word = "+secondWord);
         * // last index first index about exactly location of numbers of the word or sentence!! substrings totalt opposite
         * //substringde numara veriyorsun sana word location veriyor indexde space sorunca veriyorsun sana exactly
         * //location veriyor space nerede basliyor nerede bitiyor...
         * //                 0123456789012345678
         * String sentence = "you understand java";
         * String firstWord = sentence.substring(0+firstSpaceIndex);
         * System.out.println("first word = "+firstWord);
         * String lastWord = sentence.substring(lastSpaceIndex);
         * System.out.println("last word = "+lastWord);
         */

 }
}


