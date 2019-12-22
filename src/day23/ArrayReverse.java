package day23;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
   //  String myFavoriteShow = shows[0];
      //  System.out.println("my favorite show : "myFavoriteShow);
     //   System.out.println("my favorite show count is "+myFavoriteShow.length());
   //     System.out.println("myFavoriteShow"+myFavoriteShow+"char count is "+currentShow.length());
       // Example:
        //arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
        //prints:  apple , banana , kiwi
        //banana , kiwi , grape
        //kiwi , grape , milk
        //grape , milk , soda
        Scanner input =new Scanner(System.in);

                //leave above alone! :)
                //assume you have String array of 6 items
                //and print three neibouring items at a time till last item
                //write your code below
       // String myName = "Fatma Olivia";
        //String reversed= "";
        //for (int i = myName.length()-1; i >=0; i--) {
          //  reversed +=myName.substring(i,i+1);
           // System.out.println(reversed);


        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        String[] arr1 ={"apple", "banana","kiwi", "grape","milk","soda"};
        String reversed= "";
        for (int i = arr1.length-1; i >=0; i--) {
            reversed += arr1.toString();
            System.out.println(reversed);

        }
    }

    }

