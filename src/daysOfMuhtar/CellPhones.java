package daysOfMuhtar;

public class CellPhones {
    String brand;
    double price;
    String color;
    double screenSize;
    String model;
    byte size;



    public CellPhones(){ //set up default values for attributes of the class bc I got default value without initialized
        brand="iPhone";
        model="10";
        screenSize=5.8;
        color="Silver";
        price=700;
    }
    public CellPhones(String brand,double price, String color,double screenSize,String model){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.screenSize=screenSize;
        this.price=price;

    }

    public void call(long PhoneNumber) {
        System.out.println(brand + " " + model + "  is calling ");
    }
    public void sendMassages(long PhoneNumber){
        System.out.println("you got a message from: "+PhoneNumber);
    }
 public void getInfo(){
     System.out.println(brand+" "+model+" "+color+" "+screenSize+" $"+price);
 }
}
