package day21;

import java.util.Scanner;

public class PracticeOfString {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        //System.out.println("enter inhabitants count : ");
        //int inhabitants = scan.nextInt();
        //december 7, saturday ornek soru 96 from last year
        //Day 0[6] Day 1[3] Day 2[1]
        //int day =0;
        //while(inhabitants>0){
          //  System.out.println("Day "+ day + " ["+inhabitants + "]");
            //inhabitants =inhabitants/2;
            //day++;
    //}
      //  System.out.println("========EXTICNT====");
            //0123456789012345678901
String str = "java String is Awesome";
int count = str.length(); //int lastIndex = str.length()-1;
int lastIndex = count -1;
        System.out.println("my sentence is "+ count+ " characters.");
        System.out.println("last character is "+ count+". character");
        //String kelimesinin indexini al;
        int indexOfWordString = str.indexOf("String");
        System.out.println(indexOfWordString);
        int wordOfA = str.indexOf("A");
        System.out.println(wordOfA);
        int wordOfa = str.indexOf("a",0); //yada str.indexOf("a"); yada ('a');
        System.out.println(wordOfa);
        //ikicisini nasil bulurum
        System.out.println(str.indexOf("a",wordOfa+1));// yada ('a',2)

       //how do I get the word is;
        //              0123456789012345678901
       // String str = "java String is Awesome";
        String wordIs = str.substring(12,14);
        System.out.println(wordIs);
        //first space;
        int firstSpace = str.indexOf(" ");
        System.out.println(firstSpace);
        String part = str.substring(1,6);
        System.out.println(part);





    }
}
