package daysOfOfficeHours;

public class TeachersTest {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("Fatma");
        t1.setAge(19);
        t1.initilizeFields("Nuran",18);
        System.out.println("teacher 1 name is: " + t1.getName());
        System.out.println("teacher1 age is: " + t1.getAge());
    }
}
