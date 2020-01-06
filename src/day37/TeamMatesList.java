package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMatesList {
    public static void main(String[] args) {
        /**get the first and last item we use get get() it will be index
         *
         */
      //  Create Arraylist of String and store
       // teamMates
        //print one by one
        //print reverse
        //print first last
        //print 2 at a time
        //concat everyone in one string separated by -
         ArrayList<String> teamMates= new ArrayList<>(); //List<String> teamMates=new ArrayList<>();
         teamMates.add("Esra");
         teamMates.add("Canan");
         teamMates.add("Ayse");
         teamMates.add("Aysegul");
         teamMates.add("Muhammed");
         teamMates.add("Serife");
         teamMates.add("Sumeyra");
         teamMates.add("Asena");
         teamMates.add("Sidika");
       //  teamMates.add("Safiye");
        System.out.println("\n my team mates are : " +teamMates);
        System.out.println("first classmate is : "+teamMates.get(0));
        int lastItem =teamMates.size()-1;
        System.out.println("last classmate is: "+ teamMates.get(lastItem));
        //print by one
        for (int x = 0; x <teamMates.size() ; x++) {
          System.out.println("\n each person in the team: "+(x+1)+" : "+ teamMates.get(x));
        }
        for (int x = lastItem; x >=0 ; x--) {
            System.out.println("\t teammates reverse: "+(x+1)+" : "+teamMates.get(x));
        }

     //print 2 items at a time we use = bc remember 2nin anlami kac tane eklemek istersen for eachline
      //for example: 1-2 , 2-3, 3-4, 4-5, 5-6...
        for (int x = 0; x <=teamMates.size()-2 ; x++) {
            System.out.println("\t"+ teamMates.get(x)+"-->"+teamMates.get(x+1));
        }
//print 2 items at a time
// for example :1-2 , 3-4, 5-6 ,7-8, 9-10
        System.out.println("\n Print 2 items at a time without repeating: ");
        for (int x = 0; x <=teamMates.size()-2 ; x+=2) {
            System.out.println("\t"+ teamMates.get(x)+"-->"+teamMates.get(x+1));
        }
       //Challenge: pair them up by 3 concat everyone in one string separated by-
      String get3oFThemEach="";
        for (int x = 0; x <teamMates.size() ; x++) {
            get3oFThemEach=get3oFThemEach+teamMates.get(x)+"-";
       //  if(!teamMates.get(lastItem).equals("-")){
       //      teamMates.get(lastItem)=teamMates.get(x);
          }
            System.out.println(get3oFThemEach);
        String lstToString= teamMates.toString();
        System.out.println("lstToString after replacing = \n" +
                lstToString.replace(",","-")
                 .replace("[","")
                 .replace("]",""));
        }
    }
//}
