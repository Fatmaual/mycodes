package day43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        /**
         *    List<String> lst=new ArrayList<>();
         *         lst.add("abc");
         *         lst.addAll(null); //any non-primitive type can be assign to null
         *         lst.add(null);
         *
         *         String str= null; //str is reference for here.the address the pointer is an object!!!adress of what??
         *         //if this box said yu can object of scanner what kind of address I can point?any non primitive always
         *         address unreferenced yes if I say coffee1=null -->unreferenced!!
         *         // null
         *         Scanner scan= null;
         *         Coffee cx =null;
         *we wanna protection the price how we did it we blocked the price with setprice method
         */
        
   Coffee coffee1= new Coffee();
  // coffee1=null;
        coffee1.setType("Turkish");
        coffee1.setCaffeineLevel(8);
        coffee1.setPrice(-4.99);
        System.out.println("coffee1 "+coffee1.toString());
        
      Coffee coffee2=new Coffee("Intensito",9);
        System.out.println("coffee2 = " + coffee2);
        
        Coffee coffee3 = new Coffee("Blonde", 5,1.6);
        System.out.println("coffee3 before:  " + coffee3);
        coffee3.setPrice(-100);
        System.out.println("coffee3 after= " + coffee3);
        
        Coffee coffee4 =new Coffee("Latte",3,-2.6) ;
        System.out.println("coffee4 = " + coffee4);
        
        double sumOfCoffee=coffee1.getPrice()+coffee2.getPrice()+coffee3.getPrice()+coffee4.getPrice();
        System.out.println("sumOfCoffee = " + sumOfCoffee);
        }

        }
    

