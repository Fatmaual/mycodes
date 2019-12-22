package day25;

import java.util.Arrays;

public class FindingLongestWord {
    public static void main(String[] args) {
        String sentence = "batch15 try to understand the Split";
        String[] allWords = sentence.split(" ");
        System.out.println("all words : "+ Arrays.toString(allWords));
        String longestWord = allWords[0];//longest wordu character encok olandan bulurum
        int maxCharCount = 0;
        for(String tumkelimeler : allWords){
            if(tumkelimeler.length()>longestWord.length()){
                longestWord=tumkelimeler;
            }
        }
        System.out.println("en uzun kelime :" + longestWord);


    }
}
