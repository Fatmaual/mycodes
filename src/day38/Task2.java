package day38;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        /**
         * Create a method that accept String object and
         * return List<Character> that contains each character.
         * reverse an ArrayList using the swamp logic
         * evet if statementla şöyle yapabilirsiniz:
         * * Array List inizin adını list1 olarak kabul ediyorum
         * * if( list1.contains( " , "){
         * * list1.remove( list1.lastIndexOf( " , ") );
         * * }
         * * böylece virgülün bulunduğu son index hangisi ise o index i remove edecek
         *  *
         */
        System.out.println(nameChars("Sumeyye"));
        List<Character> resultList = nameChars("Asli");
        resultList.add('M');
        resultList.add('1');
        System.out.println("resultList = " + resultList);


    }
    public static List<Character> nameChars(String name){
         ArrayList<Character> charList= new ArrayList<>();
        for (int x = 0; x <name.length() ; x++) {
            charList.add( name.charAt(x));

        }
        return charList;
    }
}
