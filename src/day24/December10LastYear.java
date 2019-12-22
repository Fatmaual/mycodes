package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class December10LastYear {
    public static void main(String[] args) {
    String str ="Cybertek Batch Spartan is most hardworking Batch ever";
    String[] wordSplit = str.split(" ");
    String wordReversed = "";
        for (int x = 0; x < wordSplit.length ; x++)
        {
            String word = wordSplit[x];
            String reWord ="";
            for (int i =word.length()-1; i >=0 ; i--)
            {
                reWord=reWord+word.charAt(i);

            }
            wordReversed=wordReversed+reWord+" ";
        }
        System.out.println();
        System.out.println(wordReversed);
    }
}
