package daysOfMuhtar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList10_1ScannerReply {
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
       list.add(12);
        list.add(20);
        list.add(30); //[12,20,30] --> index 0 1 2
       System.out.println(list.get(2));
     System.out.println(list.size());
      list.clear();
     System.out.println(list);
        System.out.println("======");
        ArrayList<String> namelist=new ArrayList<>();
        namelist.add("gunday");// size is 1
        System.out.println(namelist.size());
        namelist.add("Yasemin");
        System.out.println(namelist);
 //create array list call student names
  //create scanner object call scan

  ArrayList<String> studentName=new ArrayList<>();
  Scanner scan= new Scanner(System.in);
  while(true){
      System.out.println("enter the student name:");
      String names=scan.nextLine();
      studentName.add(names);
      System.out.println("do you want to add another name?");
      String answerYes=scan.nextLine().toLowerCase();
      if(! answerYes.equals("yes")||answerYes.equals("no")){
          System.out.println("invalid");
          break;
      }
      if(answerYes.equals("no")){
          break;
      }
  }
        System.out.println(studentName);
    }
}
