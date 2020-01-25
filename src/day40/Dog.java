package day40;

public class Dog {
    String Breed;
    String Size;
    byte Age;
    String color;
    String name;
    char Gender;
    String food;

    public void getInfo(){
        System.out.println(Breed+" "+Size+" "+Age+" years old, "+color+
                Gender+" gender is "+name+" is the name.");
    }
 public void eat(){
     System.out.println(name+" is eating "+food);
 }
 public void play(){
     System.out.println(Breed+" is playing");
 }
}
