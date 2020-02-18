package day54.InterfaceOOPAnimal;

public class AnimalShop {
    // Dog IS-A Dog
// Dog IS-A Animal
// Dog IS-A Object
// Dog IS-A IndoorPet
// refer a dog object as a dog
// it can do everything a dog can do (including Animal, IndoorPet stuff)
    public static void main(String[] args) {

        // refer a dog object as a Animal
        // it can do only those thing Animal can do
        // only the speak method in this case
      //  Animal a1 = d1;
        //a1.speak();
        //   Animal animal1= new Dog();
        // IndoorPet pet1=new Dog();
       // Object object1=new Dog();


       // Animal animal2= new Cat();
        //  IndoorPet pet2= new Cat();

       //refer a dog object as a dog
        // it can do everything a dog can do (including animal,indoorPet stuff)
        Dog dog1= new Dog();
        Animal animal1=dog1;


        // refer a dog object as a Object
        // it can do only those thing Object can do
        // for example toString, hasCode and others
     //   Object o1 = d1;
//        o1.speak();
        // refer a dog object as a IndoorPet
        // it can only play
    //    IndoorPet p1 = d1;
      //  p1.play();
        IndoorPet pet1=dog1;
        Object object1=dog1;

        dog1.name="Ginger";
        System.out.println("dog 1 name is: "+dog1.name);
        dog1.getInfo("Ginger",10);
        dog1.play();
        dog1.speak();
        animal1.speak();
        pet1.play();
     //   animal1.play(); --ERROR! Bc sub can use all supers method but super class can't so needs to cast
        System.out.println("------about cat----------");
        Cat cat1= new Cat();
       // cat1.play();
       // cat1.speak();
        //cat1.getInfo("Duman",12);
        animal1=cat1;
        animal1.speak();

        pet1=cat1;
        pet1.play();








    }

}
