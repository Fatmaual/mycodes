package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {
String[] marvelHeros={"IronMan","Captain America",
        "Spiderman","BlackPanter","Hulk","Black Widow","Wanda","Captain America","Captain America",
        "Captain Marvel","Captain Marvel"};
        System.out.println("marvel heros: "+ Arrays.toString(marvelHeros));
        int sizeOfArray=marvelHeros.length;
        System.out.println("sizeOfArray = " + sizeOfArray);
        String itemToSearch="IronMan";
        int countOfThem=0;
        for(String herbirHero : marvelHeros){
            if(herbirHero.equals(itemToSearch)){
             countOfThem++;
            }
        }
      int countOfBlackName = 0;
        for(String herbirHero:marvelHeros){

     if(herbirHero.toLowerCase().contains("black")){
         countOfBlackName++;

        }

        }
        System.out.println(countOfBlackName);
        
    }
}
