package daysOfMuhtar.PoliOfis;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class School{
    String okul;
    List<Student> ogrenciler;

    public School(String schoolName,List<Student> ogrenciler){
        this.okul=schoolName;
        this.ogrenciler=ogrenciler;
    }
    public void addNewStudent(Student ogrenci){

        this.ogrenciler.add(ogrenci);
    }
    public void addNewStudent(Student[] students){
        this.ogrenciler.addAll(Arrays.asList(students));
    }
    public void addNewStudent(List<Student>listOfStudents){
        this.ogrenciler.addAll(listOfStudents);
    }
    public String toString(){

     return  ""+ogrenciler;
    }
}




public class Student {
    int studentAge;
    String studentName;

    public Student(String studentName){
        this.studentName=studentName;
    }
    public Student(String studentName,int studentAge){
        this.studentName=studentName;
        this.studentAge=studentAge;
    }
    public String toString(){
      return studentName; // return " ";->if I put "" always it gives me empty string!!!!!!!!!
    }
}
class Association{
    public static void main(String[] args) {
        Student s1 = new Student("Derya");
        System.out.println(s1);//->hashCode there is no toString method which means toString comes from Object class
        //    System.out.println(s1.studentName);
        Student s2 = new Student("Aysegul");
        Student s3 = new Student("Serife");
        Student s4 = new Student("Fatma");
        Student s5 = new Student("Esra");

        List<Student> ogrenciler = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        System.out.println(ogrenciler);
        s1.studentAge = 35;
        System.out.println("Deryanin yasi: " + s1.studentAge);

        School okulAdi = new School("Cybertek", ogrenciler);
        System.out.println(okulAdi.ogrenciler);
        System.out.println(okulAdi.okul);

        //2 ogrenciyi cyberteke ekle;
        okulAdi.addNewStudent(new Student("Irina"));
        okulAdi.addNewStudent(new Student("Ayse"));
        System.out.println(okulAdi.ogrenciler);
        // okulAdi.addNewStudent(Student)
        System.out.println(okulAdi.okul);

        //add list of student with Array Student[]
        Student[] students = {new Student("Sadiye"), new Student("Gunday")};
        okulAdi.addNewStudent(students);
        System.out.println(okulAdi.ogrenciler);

        //add list of student;
        Student s10 = new Student("Aysegul");
        Student s9 = new Student("Serife");
        List<Student> listOfStudents= new ArrayList<>(Arrays.asList(s9,s10));
        okulAdi.addNewStudent(listOfStudents);
        System.out.println(okulAdi.ogrenciler);

        //get each students one by one
        for(Student eachStudent: okulAdi.ogrenciler){
        }
        System.out.println("Cybertek ogrencileri: "+okulAdi.ogrenciler);
    }
}
