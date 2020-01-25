package day39;
public class StudentCreation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Karima";
        s1.age=31;
        s1.gender='F';
        //GET THE VALUES FOR S1 OBJECT ATTRIBUTE
        System.out.println("s1 name: "+s1.name);
        Student s2= new Student();
        s2.name="Juma";
        s2.gender='M';
        s2.age=31;
        System.out.println("s2 age " +s2.age);
        System.out.println(s2.name +" | "+s2.age+" | "+s2.gender);
        System.out.println("s2 name is: "+s2.name+", s2 age is: "+s2.age+", s2 gender is: "+
                s2.gender);
    //I want to save Juma's age before I change so I still have access
     int oldAge= s2.age;
        s2.age=28;
        System.out.println("Juma's old age : "+oldAge);
        //tell me the differences between old age and new age
        System.out.println("the differences between Juma's age: "+(oldAge-s2.age));


    }
}
