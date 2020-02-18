package day54;

interface IndoorPet{
    public abstract void play();

}
class Dog extends Animal implements IndoorPet{
 String name;
    @Override
    public void speak() {
        System.out.println("bark!!");
    }

    @Override
    public void play() {
        System.out.println("running after the ball");
    }
}

public abstract  class Animal {

    public abstract void speak();
}


class Main{
    public static void main(String[] args) {
        //Dog IS-A Dog
        //Dog IS-A Animal
        //Dog IS-A Object
        //Dog IS-A IndoorPet

  //refer a dog object as a dog it can do everything (including animal indoorPet stuff)
    Dog dog1=new Dog();
        System.out.println(dog1.name);
        dog1.speak();
        dog1.play();

        //refer a dog object as an Animal it can do only those things Animal can do
        //only the speak method in this case
        Animal animal1=dog1;
        animal1.speak();

        //refer a dog object as a Object it can do only those thing Object can do
        //for example toString, hasCode and others
        Object object1=dog1;
     //   ((Dog) object1).speak();

        //refer a dog object as a IndoorPet
        //it can only play
        IndoorPet pet1=dog1;
        pet1.play();


    }
}