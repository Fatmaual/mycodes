package denemelerim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplyDenemeler {
    public static void main(String[] args) {
        /**find longest name in List of String that contains 6 names
         *
         for (int i = 0, j=names.size()-1; i <names.size() /2 ; i++, j--) {
         String temp= names.get(i);
         names.set(i,names.get(j));
         names.set(j,temp);
         Given List of names with various character count,
         Remove any name with less than 2 characters
         and if any name has more than 10 character only keep 10 characters
         and if it has exactly 5 characters , reverse it
         Of course , Otionally make a method out of it.
         Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
         * print pass if its more than 60 fail if not
         * count how many score are more than 90
         * get the average score
         * update the values with score-grade pair
         for example
         79C , 54F, 100A, 65D, 44F , 89B , 95A
         Optionally create 4 methods according to above criteria
         */
        List<String> names=new ArrayList<>(Arrays.asList("Muhammed","Hikmet Kerem","Abdullah","Esad",
                "Mert","Cevdet"));
     //   System.out.println(names.get(6));
    //swap with arraylist

  ArrayList<String> name= new ArrayList<>(Arrays.asList("esadi","a","yasemindogan","esadim"));
        System.out.println(Various(name));


        }
       public static List<String> Various(ArrayList<String>name){
           String reverse=" ";
           for (int x = 0; x <name.size() ; x++) {
               if(name.get(x).length()<2){
                   name.remove(x);
               }else if(name.get(x).length()>10){
                   name.set(x,name.get(x).substring(0,11));

               }else if(name.get(x).length()==5){
                   for (int i = name.get(x).length()-1; i >=0 ; i--) {
                       reverse+=name.get(x).charAt(i);
                   }
                  name.set(x,reverse);
               }

           }
       return name;
       }
    }

