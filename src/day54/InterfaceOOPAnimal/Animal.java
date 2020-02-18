package day54.InterfaceOOPAnimal;

class Cat extends Animal implements IndoorPet{
    String name;
    int weight;
    public Cat(){

    }
    public void getInfo(String name,int weight){
        System.out.println("This cat's name is: "+name+" and the cat's weight is: "+weight);

    }
    @Override
    public void play(){
        System.out.println("cats love play with cats' toys");
    }
    @Override
    public void speak(){
        System.out.println("cats make sound like mmeeeoooww");
    }

}

class Dog extends Animal implements IndoorPet{
    String name;
    int weight;
    public Dog(){

    }
    public void getInfo(String name,int weight){
 System.out.println("This dog's name is: "+name+" and the dog's weight is: "+weight+" pounds");

    }
    @Override
    public void play(){
        System.out.println("dogs like to play with dogs' toys ");
    }
  @Override
    public void speak(){
      System.out.println("dogs make sound like wooaafff");

  }
}

public abstract class Animal{

  abstract void speak();

}
