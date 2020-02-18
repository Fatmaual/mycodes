package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruit {
    public static void main(String[] args) {
        Apple apple1= new Apple("sweet", "red","Fuji");

        Fruit fruit1= apple1;// store those address--->new Apple("sweet", "red","Fuji");

        fruit1=new Orange("sour","reddish",11);
        fruit1.getDigest();
        System.out.println(fruit1.toString());

         Fruit fruit2 = new Apple("crispy","dark red","gala");
        Fruit fruit4 = new Orange("sour","orange",12);
        Fruit fruit3 = new Orange("very sweet ", "red",10);

        Fruit[] myFruits= {fruit1,fruit2,fruit3,fruit4};
        for(Fruit eachFruit:myFruits){
            eachFruit.getDigest();
        }

       // List<Fruit>fruitList= Arrays.asList(fruit1,fruit2,fruit3,fruit4);
        List<Fruit>fruitList= new ArrayList<>(Arrays.asList(fruit1,fruit2,fruit3,fruit4));// this one is changeble you can add or remove or etc.
        // ama yukaridaki gibi olursa yapamzsin iki array arasindaki fark
        for( Fruit each: fruitList){
            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class Type: "+each.getClass().getSimpleName());

    }


}

    }

