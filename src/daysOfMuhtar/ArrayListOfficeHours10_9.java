package daysOfMuhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListOfficeHours10_9 {
    public static void main(String[] args) {
        /**
         * ArrayList methods=
         * add,get,size,clear,set,contains, equals,remove,IsEmpty,indexof,adAll,remeoveAll
         *- when you have an ArrayList you must import (presented)in "java.util
         * -if you have ArrayList you can store objects and only supports nonprimitives array supports all of them
         *- if comparing aRRAYA AND aRRAYlIST ARRAY IS fixed but arraylist is dynamic this is main differenc between
         * them.
         * both of them have index numbers
         * declaration:
         * 1.ArrayList<0bjectType> list=new ArrayList<>();
         * List<0bjectType> list=new ArrayList<>();
         * add method: add(objects)-->just objects no primitives  so it adds given objects to the list
         * add(index,object) insert given object to the given index
         * list.add(10); //if you are converting primitive into Integer you need autoboxing
         * size()return the totoal number of object the size automatically adjusted
         * get(int index): gets the objects from the given index list.get(1)-->
         *clear() removes everything
         * set() method has 2 argument first index number second is given object
         * se(index,object) the index nmber will be replaced will be given index
         * contains(object) method: functionality of this method checks if the given objet exist in the list.it returns
         * boolean.
         * equals(List) checks if those two list are the same?
         * isEmpty()
         * indexOf(Object)after turns the object the functionalty of this method returns primitive
         * remove(int index) removes the given object  or index
         * remove(object)
         * removeAll()
         * addAll()
         * retainAll()
         *
          */
        int[] arr =new int[5];
        List<Integer> list=new ArrayList<>();
        list.add(10); //AUTOBOX!!!!//if you are converting primitive into Integer you need autoboxing
        System.out.println(list.size());// my expected result should be 1
        list.add(20);//AUTOBOXXX
        list.add(1,30); //i insert this on index 1 so 20 shifted to the next
        int num= list.get(1);
        System.out.println(num);
        //list.clear(); //all the objects will be removed size is 0
        System.out.println(list);
        System.out.println(list.size());
        List<String> list2=new ArrayList<>();
        List<String> list4=new ArrayList<>();
        list2.add("A");
        list2.set(0,"B");
        System.out.println(list2);
        list2.contains("C"); //it returns boolean expression
        boolean result=list2.contains("C");
        System.out.println("result is "+ result);
        list2.equals(list4);
        System.out.println( list2.equals(list4));
        System.out.println(list4.isEmpty());
        System.out.println(list2.indexOf("B"));
        System.out.println(list2.indexOf("D"));//-1 doesn't exist
        List<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        Integer a2=1; //if a2=5 it will be false
        System.out.println("list 3 list: "+list3);
        boolean r1= list.remove(a2);
        System.out.println("after remove" +list3);
        System.out.println(r1);
        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");
        list4.remove(2);
        System.out.println(list4);
        System.out.println(list4.set(2,"G"));
   list4.remove("C");
        System.out.println(list4);
        Integer[] nums={1,2,3,4,5,6,7,8};
        Arrays.asList(nums);
        List<Integer>list5=Arrays.asList(nums);
        System.out.println(list5);
   String [] students={"Nursultan","Irina","Dilsat","Roksana"};
   List<String> names=new ArrayList<>(Arrays.asList(students));
   //Arrays.asList(students);
  // names.addAll(Arrays.asList(students));
   names.addAll(Arrays.asList("Muhammed","Bulent"));
      //  System.out.println(students);  //check this one gives default
        System.out.println(names);
        List<String> grades=new ArrayList<>();
        grades.addAll(Arrays.asList("A","B","C","D","E","F"));
        grades.removeAll(Arrays.asList("A","C"));
        System.out.println(grades);
       List <String> cars=new ArrayList<>();
       cars.addAll(Arrays.asList("BMW","Corolla","BMW","Jaguar","bmw","Honda","Tesla"));
       //removes all the cars that are not BMW or Jaguar or Tesla
       cars.retainAll(Arrays.asList("BMW","Jaguar","Tesla"));
        System.out.println(cars);
        /**
         * given a name list int his list you have Ahmed, John, Ahmed, Eric, Aaron
         * write the program that can all the  removes than can Ahmed
         */
        
      List<String> isimler=new ArrayList<>(Arrays.asList("Ahmed", "John","Ahmed", "Ahmed","Ahmed", "Eric", "Aaron" ));
     isimler.removeAll(Arrays.asList("Ahmed"));
       List<String> isimler2=new ArrayList<> ();
       isimler2.addAll(Arrays.asList("Ahmed", "John","Ahmed", "Ahmed","Ahmed", "Eric", "Aaron" )) ;
       isimler2.retainAll(Arrays.asList("Ahmed"));
       isimler.retainAll(Arrays.asList(isimler2));
        System.out.println("isimler 2: "+isimler2);
       List<Integer> numbers=new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        Collections.sort(numbers);








    }
}
