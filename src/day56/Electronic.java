package day56;

import daysOfMuhtar.Polymorphism.A;

import java.util.ArrayList;
import java.util.List;

class AirConditioner extends Electronic{

    @Override
    public void turnOn() {
        System.out.println("turn on sub air conditioner");
    }
}
class Computer extends Electronic{

    @Override
    public void turnOn() {
        System.out.println("turn on your sub computer");
    }
}

public abstract class Electronic {
    public abstract void turnOn();

    public static void main(String[] args) {
        /**
         * create a list of electronic with random 10 items
         * turn them all on
         * find out how many computer and how many air conditioner are there
         */
   Electronic item1=new Computer();
  // Electronic item2=new AirConditioner();
  // Electronic item3=new Computer();
  // Electronic item4=new AirConditioner();
  //Electronic item5=new Computer();
  //Electronic item6=new AirConditioner();
  //Electronic item7=new Computer();
  // Electronic item8=new AirConditioner();
       // int cntComputer=0;
       // int cntAC=0;
       // if(item1 instanceof Computer){
        //    cntComputer++;

       // }else if(item1 instanceof AirConditioner){
         //   cntAC++;
       // }
        List<Electronic> electronics= new ArrayList<>();

        electronics.add(item1);
        electronics.add(new Computer());
        electronics.add(new Computer());
        electronics.add(new Computer());
        electronics.add(new AirConditioner());
        electronics.add(new AirConditioner());
        electronics.add(new AirConditioner());
        electronics.add(new AirConditioner());
        electronics.add(new AirConditioner());
        electronics.add(new AirConditioner());
        electronics.add(new Computer());

        int cntComputer=0;
        int cntAC=0;
        for(Electronic each:electronics){
            each.turnOn();
            if(each instanceof Computer){
                cntComputer++;
            }else if(each instanceof AirConditioner){
                cntAC++;
            }
        }
        System.out.println("computer count: "+cntComputer);
        System.out.println("Air conditioner count: "+cntAC);
    }

}
