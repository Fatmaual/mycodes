package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoverItempractice {
    public static void main(String[] args) {
        /**
         * Create method that accept a list of string as argument
         * same thing aas a method that has List of String parameter and print out each and every
         * item in the list vertically return nothing
         */
        ArrayList<String >namelst = new ArrayList<String>();
        namelst.add("Yasemin");
        namelst.add("Gunday");
        namelst.add("Mustafa");
        namelst.add("Tarik");
        namelst.add("secil");
        namelst.add("fatma");
        printAList(namelst);

        byte myByte= 17;
        printByte(myByte);
    }
    public static void getLongestElement(List<String>namelst){
        String longestName ="";
        for (int x = 0; x <namelst.size() ; x++) {
            String eachName= namelst.get(x);
            if(eachName.length()>=longestName.length()){
                eachName=longestName;
            }
            System.out.println("eachName = " + eachName); 
        }
    }
    public static void printByte(byte b){
        System.out.println("you passed byte value "+ b);
    }
    public static void printAList(ArrayList<String> lst){
        for (String each : lst  ) {
            System.out.println("each = " + each);

        }
    }
}
