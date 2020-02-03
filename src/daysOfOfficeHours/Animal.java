package daysOfOfficeHours;


class Cat extends Animal{

    String eyeColor;
public void call(){
    System.out.println("the cat is making sound..");
}
public void eat(){

    System.out.println("the cat is eating her foods");
}
 public void run(){
     System.out.println("cats are running");
  }

    @Override
    public void sleep() {

    }
}


class Dog extends Animal{
    String dogName;

public void run(){
    System.out.println("dogs are running");
}

    @Override
    public void sleep() {
        System.out.println("dos is sleeping");
    }
}


public abstract class Animal implements Zoo{
    //information -->variable
    //local, instance, static
    int age;
    String color;
    String breed;

    //actions -->method
    //instance methods and constructor
    public Animal(){

    }
    public void eat(){
        System.out.println("the animal is eating");
    }

    public void call(){
        System.out.println("the animal is making sound");
    }
    public void run(){
        System.out.println("animals are running");
    }
}
 class TestAnimals{
     public static void main(String[] args) {
      //   Animal animal1=new Animal();

         Dog dog= new Dog();
         dog.eat();
         dog.run();

         Cat cat=new Cat();
         cat.call();
         cat.eat();
         cat.run();



     }
 }