package denemelerim;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Reply126 {
    public static void main(String[] args) {
        /*Write a program that will find out shortest words in the given string str.
         If there are few words that are evenly short, print them all.
         Use split method in order to split str string variable and create an array of strings.
           Print array with Arrays.toString() method. Sort array before printing.
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
        **/
        //I assume user input this String;
//String str= "Cybertek Batch15 is most hardworking one EVER!";
//String[] strsplit= str.split(" ");
        //     System.out.println(Arrays.toString(strsplit));
        //      int [] num=new int[5];
        //    for (int x = 1; x <num.length ; x++) {
        //   num[x]+=x;
        // }
        //System.out.print(Arrays.toString(num));
        /**Create a method called plus_minus that gets an array of ints (int[]),
         * it outputs how many negative , positive and zero numbers are in the array.
         for example:
         plus_minus (new int[]{1,2,55,-9,-2,0});
         will output:
         positives:3, negatives:2, zeros:1
         * */

        Scanner input = new Scanner(System.in);
  String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),
          input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below
        for (int i = 0; i < words.length ; i++) {
            System.out.println(words[i].charAt(0)+""+words[i].charAt(words.length-1));

        }


        }
    }


