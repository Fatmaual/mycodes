package Denemelerim;

import java.util.Arrays;

public class Dec16MultiDementionalOfficeH {
    public static void main(String[] args) {
        String[]names={"John","Kevin","Scott"};
        System.out.println("first name "+names[0]);
        for(String herbirName:names){
            System.out.print(herbirName);
        }
String[][]students={
                {"1","John","35","USA"},
                {"2","Kevin","40","Brazil"},
                {"3","Scott","20","Canada"}
        };//1 id adi john yasi 35
        System.out.println("\n------");
        System.out.println("how many arrays inside students 2d array? "+students.length);//index
        System.out.println("how many values in second row(inner array)? "+students[1].length);
        System.out.println(Arrays.deepToString(students));
        System.out.println("\n------");
        for(String[]arr:students){
            for(String value: arr)
            System.out.print(value+" ");
        }
        System.out.println("\n----");
        String oldestPersonName=students[0][1];
        int ageofoldestperson = Integer.parseInt(students[0][2]);
        //find oldest student and print the student's name
        //|student id|name|age|country
        for(String[] row :students){
            System.out.println(row[2]);
            }

        }

    }

