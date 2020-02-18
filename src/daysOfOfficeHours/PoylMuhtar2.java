package daysOfOfficeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PoylMuhtar2 {
    public static void main(String[] args) {
        Student s1= new Student("Hasan");
        System.out.println(s1);//hashcode bc there is no toString method
        System.out.println(s1.studentName);
        Student s2= new Student("Muge");
        Student s3= new Student("Aiko");
        Student s4= new Student("Parvin");
        Student s5= new Student("Sumeyye");

        List<Student> listOf=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));//points -> List<Student>allStudentsList!!


        School cybertek=new School("Cybertek",listOf);
        cybertek.addNewStudent(new Student("Irina"));
        cybertek.addNewStudent(new Student("Denis"));

        Student[]students={new Student("Gulnaz"),
                new Student("Rushkona") };
                cybertek.addNewStudent(students);

        System.out.println("cybertek.allStudentsList = " + cybertek.allStudentsList);
        System.out.println("schoolname is: " + cybertek.schoolName);

        for(Student eachStudent:listOf){//cybertek.allStudentsList){
            System.out.println("eachStudent = " + eachStudent);
            System.out.println(cybertek);
        }
    }
    }

