package day40;

public class Car {
    /**
     * CAR
     * DATA/ATTRIBUTE
     * model,year,brand,color,price,milage,VIN...
     * ACTIONS:
     * start,driver,accelerate,stop,drift,brake,get ticket....
     * instance variable,
     */
    //those are the ATTRIBUTE
    String Model;
    int Year;
    String Color;
    double Price;
    long Mileage;
    String Brand;
//those are THE ACTION
    public void drive(){
        System.out.println("Driving "+Brand);
    }
    public void start(){
     System.out.println(Brand+ " is started");
 }
 // toyota corolla, white , 1000$
     public void getInfo(){
    System.out.println(Year+" "+Brand+" "+Model+", "+Color+", $"+Price);
}
}
