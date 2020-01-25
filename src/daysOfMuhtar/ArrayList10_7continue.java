package daysOfMuhtar;

import java.util.ArrayList;

public class ArrayList10_7continue {
    public static void main(String[] args) {
        ArrayList<String> shoppingList= new ArrayList<>();
        shoppingList.add("sut"); // index: 0, size=1
        shoppingList.add("yumusatici"); //index:1 , size: 2
        shoppingList.add("limon"); //index : 2, size:3
        shoppingList.add(3,"maydanoz");
        System.out.println(shoppingList);
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(0,5);
        numbers.add(1,10);
        numbers.add(2,15);
        numbers.add(1,1);
        numbers.add(1,6);
        System.out.println(numbers);
        ArrayList<String> myKids=new ArrayList<>();
        myKids.add("Kerem");
        myKids.add("nimet");
        myKids.add(1,"cevdet");
        myKids.add(1,"selim");
        myKids.add(0,"mert");
        System.out.println(myKids);
        String myFam= myKids.get(1);
        System.out.println(myFam);
        int length=myKids.size();
        System.out.println(length);
        for (int x = 0; x <myKids.size() ; x++) {
            String eachkid=myKids.get(x);
            System.out.print(eachkid+" ");

        }
        System.out.println();
        for(String eachkid :myKids){
            System.out.print(eachkid+" ");
        }
        System.out.println();
  ArrayList<String> students=new ArrayList<>();
        students.add("fatma");
        students.add("esra");
        students.add("ayse");
        students.add(3,"canan");
        students.add(3,"asena");
        System.out.println(students);
        students.set(4,"canan");
        students.add("muhtar");

        System.out.println(students);
        boolean result=students.contains("muhammed");
        System.out.println(result);
        ArrayList<String> goodGuys = new ArrayList<>();
        goodGuys.add("muhtar");
        goodGuys.add("akbar");
        goodGuys.add("kuzzat");
        goodGuys.add("vasly");
        if(students.contains("muhtar") && goodGuys.contains("muhtar")){
            System.out.println("muhtar is an instructor");
            goodGuys.remove(2);
            System.out.println(goodGuys);
        }

        

    }
}
