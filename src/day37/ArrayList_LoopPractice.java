package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {
    public static void main(String[] args) {
        ArrayList<String> name =new ArrayList<String>();
        name.add("Qalbinur");
        name.add("Ruzi");
        name.add("Sabahiddin");
        name.add("Guzelnurin");
        name.add("Muyesserim");
        name.add("Mustafa");
        String longest= name.get(0);
        for (int x = 0; x <name.size() ; x++) {
            String eachName=name.get(x);
            if(eachName.length()>=longest.length()){
             //will give you first longest name if you have more than one
             //will give you last longest name if you have more than one
                longest=eachName;
            }
        }
        System.out.println("longest = " + longest);
        /**
         * length:counting the elements inside array, it's a property of array object
         * last item of an array: arr[arr.length-1]
         * length():counting the characters inside String, it's a method of String object
         * last char of a string :str.charAt(str.lenght-1)
         * VS size()counting the elements inside ArrayList object
         * last element of an arraylist:lst.get(lst.size()-1)
         * how do I get the concationaton of all longest words if there are more than one first
         * find out the longest word and get the character count then loop through each names and
         * check whether character count equalcto longest word character count
          */
        for (int x = 0; x < name.size() ; x++) {
            if(name.get(x).length()==longest.length()){
                System.out.println("longest words : "+name.get(x));
            }
/**
 * how do we use for each loop to go through each items
 * especially if we dont know index we use for each loop
 */
            for (String eachName :name){

                System.out.println("eachName = " + eachName);
                
            }
        }
    }
}
