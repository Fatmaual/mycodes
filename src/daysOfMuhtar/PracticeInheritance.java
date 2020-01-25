package daysOfMuhtar;

import javax.imageio.stream.ImageInputStream;

class parent{
   public parent(int a){
       this("A");
       System.out.println("A");
       /**
        * if I don't give any variable of the constructor it will be automatically default value->0
        *
        */
   }
   public parent (String b){
       System.out.println("C");
   }

}

public class PracticeInheritance extends parent {

    /**        sub                        super
     *  public PracticeInheritance(){
     *    }
     *    so if I don't create a constructor in super (parent) class it is going to be create automatically default class
     *    so it will give compile error bc I gave variable of int a so I ave to create a constructor manually
     */
    public PracticeInheritance(){
        super(34); // C A
        System.out.println("B");
    }
    public PracticeInheritance(int a ){
        super("A");
    }

    public static void main(String[] args) {

        PracticeInheritance str= new PracticeInheritance();


    }



}
