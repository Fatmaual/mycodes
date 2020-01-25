package daysOfMuhtar;

import java.util.Arrays;

public class CellPhoneObjects {
    public static void main(String[] args) {
        CellPhones phone1= new CellPhones();
    //    System.out.println(phone1); //default constructor!!!!! first I got default values of attributes and I
        //    created constructor method within in the class and I initialized them then I got value of each of them
        System.out.println(phone1.brand);
        System.out.println(phone1.model);
        System.out.println(phone1.color);
        System.out.println(phone1.price);

        CellPhones phone2 = new CellPhones("Samsung",1000,"Silver",6.1,"Note10");
       phone2.getInfo();

       CellPhones phone3= new CellPhones("Nokia",800,"white",5.2,"x13");
       phone3.getInfo();
     CellPhones phone4=new CellPhones("iPhone",1200,"SILVER",10.2,"XMAX");
     phone4.getInfo();
     phone4.sendMassages(1234567876);

     CellPhones[] phones={phone1,phone2,phone3,phone4};
     //brand of phone3:
        System.out.println(phones[2].brand);
        //if I wanna get entire of phone 3?
        phones[2].getInfo();

    }
}
