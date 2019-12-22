package day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
     String sentence ="I love Java";
     String[]allWords=sentence.split(" ");
        System.out.println("all words :"+ Arrays.toString(allWords));
        System.out.println(allWords.length);
        System.out.println(allWords[allWords.length-1]);
        String sentence2 = "everything is Awesome!!!";
        //how can I get letters or any character with split?
      String[] splitbyeArr = sentence2.split("e");
        System.out.println("Arrays.toString(splitbyeArr) = " + Arrays.toString(splitbyeArr));
        for (String eachPiece : splitbyeArr) {
            System.out.println("each pieces : "+eachPiece);
            String[] splitThing =sentence2.split("is");

            for(String isiBulma: splitThing){
                System.out.println();
            }

        }

    }
}
