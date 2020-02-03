package daysOfOfficeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Cars{
    String brand; // -->this is instance variable
    Engine engine;  /// dikkat class bu class da variable verdim
    //car has Engine, so we are using Engine as instance variable data type
    //i want car object has passenger names attached to it
  // String[] passengers;
    List<String> passengers; // new ArrayList<>();





    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +", passengers "+passengers+//", passenger "+ Arrays.toString(passengers)+
                '}';
    }

    public static void main(String[] args) {
        Cars c1= new Cars();
        /**
         * how can I create an object?
         */
        //this is first way:
      //  c1.brand="Toyota";


        //this is second way;
        c1.brand = new String("Toyota");
        c1.engine=new Engine("V6",270);

        System.out.println("c1: "+c1);

      //  c1.passengers =new String[]{" Zeliha","Ayse","Yildiz","Asli","Rauf"};
       // System.out.println("c1 = " + c1);

   // c1.passengers=new ArrayList<>();
        c1.passengers=Arrays.asList(" Zeliha","Ayse","Yildiz","Asli","Rauf");

    }



}

class Engine{
    String type;
    int horsePower;


    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}

public class Practice01_29 {





}
