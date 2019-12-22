package day31;

import java.util.Arrays;

public class OfficeHoursMuhtar {
    public static void main(String[] args) {
        int a='A';
        int[]arr={10,(byte)9,(short)8,'a'};
        System.out.println(Arrays.toString(arr));
        long l1=100;
        int num1=(int)l1;
        System.out.println(arr[arr.length-1]);
        //for each loop is used to accscess each data in the collections of data(array)
        //this loop already been itireted so for each lopp is not for iterating.
        //for each loop for has how many times will be run?depents of numbers of data elements
        //depents of array's size(length)
        // variable names represent each element of the arrays.so I will create a variable for each loop
        // with int.
        //can i give the new veriable to the elements no bc already represented.
        //eger for each long yazarsam int variable yaptigim halde olur mu?olur ama it is not prefered. r
        //run yaptigin zaman 10.0 olarak cikisini alirsin.
        //when do we need for each loop we dont use index numbers.
        for(int arrDatas :arr){
            System.out.println(arrDatas);
   //ccontinue statement and break statement: continue statement SKIPS the correct iteration!!!!!!!!!!!
   //cok onemli Fatma bu yaz aklina!!!! used to skip the correct iteration of the loop.if it skips the correct
   //iteratins
  //if I give sout before if statement what it will be java gets executed top the bottom
  //statement once verirsem continuedan vermeyecek sonra verirsem verecek
 //BREAK means if i equal to 2 so break stament does not executed when 0 will be executed also 1 too
 //but when it comes to 2 the break statement will be exist the loop IMMIDIATELY bc it is not executed.


 for (int i = 0; i <4 ; i++) {
System.out.println(i);
if(i==2){
   if(i==2){
       break;
 //break; or continue the differences!!!!
   }
    System.out.println(i+"is printed");
 }



            }


        }
    }
}
