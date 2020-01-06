package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {
        List<String>superHeros=new ArrayList<>();
        superHeros.add("superman");
        superHeros.add("batman");
        superHeros.add("wonder woman");
        superHeros.add("cyborg");
        superHeros.add("aquaman");
        superHeros.add("flash");
        System.out.println("super heros list: "+superHeros);
     
      //do we have superman int the list
        System.out.println("superHeros.contains(\"Superman\") =" +superHeros.contains("superman")); 
        
     //does this this contains contains an item with exact value of man 
        System.out.println("superheros.contains(\"man\")=" +
                superHeros.contains("man")); 

        //remove any heros that does not have man in the String
        for (int i = 0; i <superHeros.size() ; i++) {
            String eachHero=superHeros.get(i);
            if(! eachHero.contains("man")){
                superHeros.remove(eachHero);
                --i;
         //once hero is removed this inex will be filled by next item
         //so we need to decrease the index by 1 so stay at the same index
            }
        }
        System.out.println("superHeros = " + superHeros);
        //take away from here :
        //removing item during the for loop
        //when you remove 1 item you will have one less item in the list
        //everything after the removed item will move to one index to the left
        //so in order not to miss the item right after the removed item
        //we need to decrease the index by one to stay at same index after removing
        List<String>superHeroCopy=new ArrayList<>(superHeros);
        System.out.println("superHeroCopy = " + superHeroCopy);
        List<String>topics= Arrays.asList("java","selenium","database","api");
        System.out.println("topics : "+topics);
        List<String>topicsCopy = new ArrayList<>(topics);
        System.out.println("topics copy : "+topicsCopy);

    }
}
