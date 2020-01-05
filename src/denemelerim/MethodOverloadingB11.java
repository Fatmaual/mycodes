package denemelerim;

import java.util.Arrays;

public class MethodOverloadingB11 {
    public static void main(String[] args) {
        System.out.println(largestWord("Ayse", "fatma","asli","cemile"));

  }
  public static String largestWord(String ...large){
    String findLarge=large[0];
    for(String eachWord:large){
        if(findLarge.length()<=eachWord.length()){
            findLarge=eachWord;
        }
    }
      return findLarge;
  }

    }


