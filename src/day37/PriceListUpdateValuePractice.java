package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListUpdateValuePractice {
    public static void main(String[] args) {
        List<Double> priceList= new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);
        System.out.println("priceList = " + priceList);
        //change the third price to $10
        //Add 4 dollar to first price
        //change last price to sum of first and second price

        //updating the 3.item
        priceList.set(2,10D); //10.0
        System.out.println("third item's price is: " + priceList.get(2));

        //add 4 dollars at first item
        priceList.set(0,priceList.get(0)+4);
        System.out.println("add 4 dollars to first item : "+priceList.get(0));

        //change last item's price with sum of first and second price
        double sumOfFirst2Item= priceList.get(0)+priceList.get(1);
        priceList.set(priceList.size()-1,sumOfFirst2Item);
        System.out.println("new  price list: "+priceList);

        //give 40% off to seconde price
        priceList.set(1,priceList.get(1)*0.6);
        System.out.println("after 40% off second item value is: "+priceList.get(1));

        //double the value of each and every price in the list
      //  priceList.set(0,priceList.get(0)*2);
        for (int x = 0; x <priceList.size() ; x++) {
          double newWal=  priceList.get(x)*2;
          priceList.set(x,newWal);
        //  priceList.set(x,priceList.get(x)*2);
        }
        System.out.println("price list after doubling : "+priceList);

        //cut the price into half if the price is more than $20
        for (int x = 0; x <priceList.size() ; x++) {
           double eachPrice = priceList.get(x);
           if(eachPrice>=20){ // put = bc we wanna get half of 20 dollars index3
               priceList.set(x,eachPrice/2);
           }
        }
System.out.println("price list after cutting half price if the price is more than 20: \n\t"+priceList);

 // gwt swamp! for first and last item
int lastIndex= priceList.size()-1;
Double temp = priceList.get(0);
priceList.set(0,priceList.get(lastIndex));
priceList.set(lastIndex,temp);
        System.out.println("pricce list after swaping first land last value:\n\t "+priceList);

    }
}
