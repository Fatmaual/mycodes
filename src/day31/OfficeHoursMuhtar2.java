package day31;

import java.util.Arrays;

public class OfficeHoursMuhtar2 {
    public static void main(String[] args) {
    //THIS IS ONE OF INTERVIEW QUESTIONS SOLVE THE TASK WITH EXPLANATIONS!!!!!!!
   //     1. write a program that can check if a string is build out of the same letters as another string
   //     Ex: input:
   //     str1 = "abc";
   //     str2 = "cba";
    //    output:
    //    true
    //    2. Write a program that will remove all the dupplicates from a string
    //    Do it withg Arrays only
    //    3. given the array of names:
    //    String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
    //    write a program that can remove all the names named Ahmed from the array
    //    Ex:
    //    names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
    //    System.out.println( Arrays.toString(names) );
     //   output:
	   //			[John, Eric, Hassan]
        // task 1 what is my expected result?search that first
        //what kind of method I can use with those strings sort methods and split and to cahr array.
//if I call the char method; it is going to return me char array so I have to put []
        String str1 = "abc";
       String  str2 = "cbb";
  //split() , toCharArray();
  char[] arr1=str1.toCharArray();
  Arrays.sort(arr1);
  char[] arr2=str2.toCharArray();
        Arrays.sort(arr2);
        //how can I convert arrys to back the strings:'
 str1=Arrays.toString(arr1);
 str2=Arrays.toString(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(str1.equals(arr1));
        System.out.println(str2.equals(arr2));
        System.out.println("=======================");
 //remove duplicated means remove extras
 String s1="aaabbaaccbbdd";
 String s2=""; //if you wanna do something with s1 you need to create another string
        for (int i = 0; i <s1.length() ; i++) {//this loop is gonna ireterate until last index of s1
  //string eachchar = s1.charat() it will be error bc string and char
  String eachChar = ""+s1.charAt(i);
  if(!s2.contains(eachChar)){
s2+=eachChar;
  }
        }
        System.out.println(s2);
        String fiveMinutes ="abcabceeedddttttkkkkbbbbbllloooooaaa";
        String result ="";
        String[] eachChars= fiveMinutes.split("");
 // /I have to declare for each loop with string bc each element represent string
        for(String each :eachChars) {
 if(!result.contains(each)){
     result+=each; // result=result+each
 }
  }
 System.out.println(result);
    }
}
