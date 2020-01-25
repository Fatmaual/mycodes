package day42;

import javax.lang.model.SourceVersion;

public class BikeAction {
    public static void main(String[] args) {
        Bike b1= new Bike("abc"); //default olacak console da
        Bike b2 =new Bike();
        System.out.println("b1 gear: "+b1.gear);
        System.out.println("b2 gear: "+b2.gear);

        Bike b3= new Bike(4);
        System.out.println("b3.gear = "+b3.gear);

      //I want a bike object with both speed and gear set to the value
      //I specify

     Bike b4= new Bike(3,55);
        System.out.println("b4.gear is: "+b4.gear);
        System.out.println("b4.speed is: "+b4.speed);
        

    }
}
