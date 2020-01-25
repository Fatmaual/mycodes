package day43;

import java.util.Arrays;
import java.util.List;

public class PetStore {
    public static void main(String[] args) {
        /**
         * Create 5 pet objects with initial value
         * Store them into a List<Pet>
         *     1, print out all info
         *     2, print out only name
         *     3, print out only cats
         */

       Pet animal1 =new Pet();
        System.out.println("animal 1: "+animal1);
        animal1.speak();
        animal1.setType("cow");
        animal1.speak();
        System.out.println("================");



        Pet animal2 =new Pet("horse","walter");
        Pet animal3 =new Pet("cat","samantha");
        Pet animal4 =new Pet("dog","henry");
        Pet animal5 =new Pet("cow","adam");
        Pet animal6 =new Pet("chicks","ginger");
        Pet animal7 =new Pet("bird","cefa");
        Pet animal8 =new Pet("cat","serius");
     List<Pet> myAnimals= Arrays.asList(animal1,animal2,animal3,animal4,animal5,animal6,animal7,animal8);
     //but if you don't have a tostring method in instance class you will get hash code
        System.out.print("myAnimals = " + myAnimals);

        for(Pet each:myAnimals){
            System.out.println("each is: "+each.getName());
            each.speak();
        }
        System.out.println("========");
        for(Pet each :myAnimals){
            if(each.getType().equalsIgnoreCase("cat")){
                System.out.println("Cat name is : " + each.getName());
                each.speak();
            }
        }
        }
    }

