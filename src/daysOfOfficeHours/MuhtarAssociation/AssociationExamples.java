package daysOfOfficeHours.MuhtarAssociation;

import java.util.*;

class Student{
    String studentName;
    public Student(String studentName){
        this.studentName=studentName;
    }

    @Override
    public String toString() {
        return studentName;
    }
}
class School{
    String schoolName;
    List<Student> tumOgrencilerListesi;

    public School(String schoolName, List<Student> tumOgrencilerListesi){
        this.schoolName=schoolName;
        this.tumOgrencilerListesi=tumOgrencilerListesi;

    }
    public void addNewStudent(Student student){
        this.tumOgrencilerListesi.add(student);

    }
    public void addNewStudent(Student[] students ){
        this.tumOgrencilerListesi.addAll(Arrays.asList(students));

    }
    public void addNewStudent(List<Student> listOfStudents){
        this.tumOgrencilerListesi.addAll(listOfStudents);
    }
    public String toString(){
        return " "+tumOgrencilerListesi;
    }
}
public class AssociationExamples {
    public static void main(String[] args) {

        Student s1=new Student("Esra");
        System.out.println(s1);
        System.out.println(s1.studentName);
        Student s2=new Student("Muge");
        Student s3=new Student("Yasemin");
        Student s4=new Student("Fatma");
        Student s5=new Student("Gunday");
        Student s6=new Student("Secil");

        List<Student> list=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6));
        System.out.println(list);

        School sch1= new School("Cybertek",list);
        sch1.addNewStudent(new Student("Mustafa"));
        sch1.addNewStudent(new Student("Tarik"));

        Student s7= new Student("Nimet");
        Student s8=new Student("Esad");
        Student s9=new Student("Omer");
        Student s10=new Student("Saliha");
        Student[] students= {new Student("Burak"),new Student("Mert")};
        sch1.addNewStudent(students);

        List<Student> listOfStudents= new ArrayList<>(Arrays.asList(new Student("Sevval"),
                new Student("Kerem"), new Student("Cevdet"),s7,s8,s9,s10));
        sch1.addNewStudent(listOfStudents);

        System.out.println(sch1.tumOgrencilerListesi);
        System.out.println(sch1.schoolName);
        sch1.addNewStudent(new Student("Sadiye"));
        sch1.addNewStudent(new Student("Bekir"));

        for(Student eachStudent:sch1.tumOgrencilerListesi){
            System.out.println("each student : "+ eachStudent);
        }

        System.out.println(sch1);

    }
}
