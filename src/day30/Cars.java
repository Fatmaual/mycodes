package day30;

import java.util.Arrays;

public class Cars {
    public static void main(String[] args) {
    String[]cars=    {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
    //count how many chevrolet is in the array
     //count how many civic in the array
 int chevyCount =0;
 int civicCount =0;
 for(String herbirAraba:cars){
     if(herbirAraba.toLowerCase().startsWith("chevrolet")){
         chevyCount++;

     }

if(herbirAraba.toUpperCase().contains("CIVIC")){
    civicCount++;
}
        }
        System.out.println("chevrolerden : "+chevyCount+ " tane var.");
        System.out.println("civicden : "+civicCount+" tane var.");
        //print make and model separetly in this format


    }
}
