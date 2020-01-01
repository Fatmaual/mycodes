package denemelerim;

import java.util.Scanner;

public class B11Var_ArgReturn {
    public static void main(String[] args) {
  // Scanner scn=new Scanner(System.in);
   //String sentence=scn.nextLine();
    String sentence= sentenceBuilder("Ayse, fatma, asli,gunday,yasemin ,sevgi");
        System.out.println(sentence);
      String word= wordBuilder("Kerem","esad","cevdet","nimet");
        System.out.println(word);

   }
   public static String sentenceBuilder(String... sentence) {
       String wordsFind = "";
       for (String eachwords : sentence) {
           wordsFind += eachwords + " ";

       }
       return wordsFind;
   }
  public static String wordBuilder(String ... values){
        String findLastCharOfWords=" ";
       // int i=0;
      //System.out.println("voidde olusturdum cunku ayni anda iki args kullanamam");
      for (String eachChar:values) {
          findLastCharOfWords+=eachChar.charAt(eachChar.length()-1);

      }
return findLastCharOfWords;
  }

}
