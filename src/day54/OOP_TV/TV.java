package day54.OOP_TV;

import java.util.ArrayList;
import java.util.List;

class Smart_TV extends TV{
    int channelCount=200;

    @Override
    public void play(){
        System.out.println("sub class smart_tv' playing tv");
    }
    @Override
    public int getChannelCount(){
        return channelCount;
    }
    public static void doTvStatic(){
        System.out.println("doTvStatic with sub class");
    }
}

public class TV {
    /**
     * TV as super class int channelCount: give default value of 100
     * create an instance method play
     * smart tv as sub class:
     * hide the channelCount field give default value of 200 override the play method
     * create main method create smarttv object and assign it to tv reference variable
     *
     * ONEMLI!!!!:
     * @Override
     * public int getChannelCount(){
     *  this how compiler see the inherited method if no change is made to the method you have
     *  this method with body that call super class that's the reason we got 100 if we did not override the method
     *  Turkcesi :)
     *  eger sub classinda methodu yazmayip oldu gibi print out alirsan polymorphism ile sana super class result
     *  veriyor. hidden method oluyor
     *  public int getChannelCount(){
     *        return super.channelCount;
     * }
     */
    int channelCount=100;

    public void play(){
        System.out.println("super class' playing tv");
    }
 public int getChannelCount(){
       return channelCount;
 }
 public static void doTvStatic(){
     System.out.println("doTvStatic with super class");
 }
    public static void main(String[] args) {
        TV tv =new Smart_TV();
        System.out.println(tv.channelCount);
        tv.play(); //new Smart_TV().play();
        System.out.println(tv.getChannelCount());
        System.out.println(new Smart_TV().getChannelCount());
        tv.doTvStatic();
     //   List<String> lst= new ArrayList<>();


    }
}
