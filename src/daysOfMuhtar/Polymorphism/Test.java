package daysOfMuhtar.Polymorphism;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
      Kentucky obj=new Kentucky();
      obj.KFC();
      obj.tax();
      States obj2= new Kentucky();
      obj2.tax();
      //obj2.KFC();// reference type decides what can be called

      States obj3=new California();
      obj3.tax();
      obj3.method1();

        List<States> list= new ArrayList<>();
        list.addAll(Arrays.asList(new Kentucky(),new California()));

        String name1=list.get(0).capitalCity;
        System.out.println(name1);

        States[] states= {obj,obj3};//{new Kentucky(),new California() };
        System.out.println(Arrays.toString(states));
      //  Kentucky obj4= new States(); sub class can't refers to super class object'

    }
}
