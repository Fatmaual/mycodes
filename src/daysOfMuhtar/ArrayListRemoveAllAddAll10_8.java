package daysOfMuhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListRemoveAllAddAll10_8 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);// autoboxing
        list.add(Integer.valueOf("33")); //none
        list.add(Integer.parseInt("100")); //autoboxing
        list.add(200);
        list.add(20);
        list.add(1);
  list.addAll(Arrays.asList(2,1,3,5,4,1,2,3,7,8));
        System.out.println("list after addAll: "+list);
  list.removeAll(Arrays.asList(2,1,3,5,4,1,2,3,7,8));
        System.out.println("list after removeAll: "+list);
        int a = list.indexOf(11); //autoboxing
        System.out.println(a);
        int a2=list.indexOf(200);
        System.out.println(a2);

        int a3=list.indexOf(1);
        System.out.println("list 1 index of: "+a3);
        int a4=list.lastIndexOf(1); //return me 5
        System.out.println(a4);
      Integer[] arr={1,2,3,4,5};
      ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr));//
        System.out.println(arr);
        list2.add(100);
        System.out.println("after add 100: "+list2);
        String[] arr2 ={"java","paython","c#","c++"};//you cannot add anything here but you can add arraylist
        ArrayList<String> list3 =new ArrayList<>(Arrays.asList(arr2));
        //check the arraylist is empty and returns boolean expression
        System.out.println(list3.isEmpty());
        list3.add("F");
        System.out.println(list3);
        int[] arr3 ={1,2,3,4,5};
        //ArrayList<Integer> list4=new ArrayList<>(Arrays.asList(arr3));
        //only the object can be converted!!!!!!!!!!!!!!!
        String[] allNames={"hakan","alexis","rahwa","holy"};
       ArrayList<String> names=new ArrayList<>();
       names.addAll(Arrays.asList("omer","burak","saliha","mert","sevval","eylul"));
       names.addAll(Arrays.asList(allNames));
        System.out.println(names);
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,1,2,3,2,2,2,3,3,3,4,4));
        numbers.removeAll(Arrays.asList(1));
        numbers.removeAll(Arrays.asList(1,2));
        System.out.println(numbers);

        ArrayList<Integer>numbers1=new ArrayList<>();
        numbers1.addAll(Arrays.asList(1,1,1,1,2,3,2,2,2,3,3,3,4,4));
       // numbers1.removeAll(Arrays.asList(1));
        //System.out.println(numbers1);
        for (int i = 0; i <numbers1.size() ; i++) {
            if(numbers1.get(i)==1){
                numbers1.remove(i);// see it removed until 1 try with duplicate and for loop!
            }

        }

        System.out.println("numbers1 after remove 1: "+ numbers1);
        Integer [] array={1000,900,80,765,123,542};
        ArrayList<Integer> price= new ArrayList<>();
        price.addAll(Arrays.asList(array));
        System.out.println(price);
        Collections.sort(price);
        System.out.println("price after sort: "+price);
    }
}
