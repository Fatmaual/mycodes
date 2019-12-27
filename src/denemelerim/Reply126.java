package denemelerim;

import java.util.Arrays;

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
       String str ="olive,fish,pursuit,old,warning,python,java,coffee,cat,ray";
       String[]myArray = str.split(",");
       int shortesWord = myArray[0].length();

       String collectionOfWords="";

        for(String spliteWord:myArray){
            if(spliteWord.length()<shortesWord){
                shortesWord=spliteWord.length();

            }
        }
        for (int i = 0; i <myArray.length ; i++) {
            if(myArray[i].length()==shortesWord){
                collectionOfWords+=(myArray[i]+",");

            }
        }
       String[] shortArray=collectionOfWords.split(",");
        Arrays.sort(shortArray);
        System.out.println(Arrays.toString(shortArray));

       }
            }




