package daysOfOfficeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface WaterProof{


}

class iPhone extends Device{
    String platform;


    @Override
    public void sendMessage() {
        System.out.println("device method and iphone has it too");
    }
    public void FaceTime(){
        System.out.println("I am having facetime with my son");
    }
}

class Samsung extends Device{
    String color;

    public void takePicture(){
        System.out.println("I just can use this method for samsung bc method belongs to sub class");

    }

    public void call(){
        System.out.println("samsung class call method");
    }

    @Override
    public void sendMessage() {
        System.out.println("samsung class has sendmessage method from device super class");
    }
}


public abstract class Device  implements WaterProof{
    int size, price;

    public void call(){
        System.out.println("Device is super class and calling with device..");
    }
public abstract void sendMessage();
}
class Main{
    public static void main(String[] args) {
        //references d,s,i
        //objects: new Device() , new Samsung() , new iPhone()
    //    Device d = new Device();-->I can't create an object bc I gave value of abstract

       Device          d       =     new iPhone();
// reference-type   reference           object
        Samsung s = new Samsung();
        s.call();//I can use call() with Samsung bc Samsung and Device IS A relationship
        s.sendMessage();
        s.price=9999;
        s.color="silver";
        s.size=7;

        iPhone i=new iPhone();
        i.call();
        i.sendMessage();
        i.platform="IOS";
        i.call();//i will be use iphone call method bc reference type is decided to use it


        Device d2 = new Samsung();
        d2.price=888;
        d2.size=6;
        //d2.color-->noo bc which one you can call decide by reference type
        d2.call();

        Device d3=new iPhone();
        d3.size=9;
        d3.price=99887;
        d3.call();// d3 will be use call method from device class super class


        WaterProof w1= new Samsung();

        WaterProof w2 = new iPhone();

       // WaterProof w3 = new Device();

        List<String> l = new ArrayList<>();

        ArrayList<Device> devices= new ArrayList<>();



    }
}

