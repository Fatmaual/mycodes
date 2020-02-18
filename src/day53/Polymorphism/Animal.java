package day53.Polymorphism;
class Horse extends Animal{
    public void makeNoise(){
        System.out.println("horses makeNoise");
    }
}

class Cat extends Animal{
    public void makeNoise(){

        System.out.println("cats makeNoise");
    }
    @Override
    public String toString(){
        return "Cat version of toString!!";
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise(){

        System.out.println("dogs makeNoise");
    }

}


public class Animal {

    public void makeNoise(){
        System.out.println("animals class makeNoise");
    }
    public static void AnimalNoiseTester(Animal anyAnimal){
        System.out.println("which animal makes noise");

    }
    public static void main(String[] args) {
        Animal[] animals={new Dog(),new Cat(),new Horse()};

Animal animal=new Dog();
        animal.AnimalNoiseTester(animal);
animal.makeNoise();

   Object ob= new Cat();
// System.out.println( ob.toString());
  // Cat ct= (Cat)ob;
    //    System.out.println("ct = " + ct);
   ///Dog o=new Object();  error!!!! only reference type decides the objects!!

  Animal an =new Dog();
  Dog d1=(Dog)an;
  Animal anCat=new Cat();
  Cat c1= (Cat)anCat;
  //Cat cats=(Cat)dogs; ERROR!!


        Object o =new Object();
       // Dog dog =(Dog)o;  
      //  System.out.println(dog); error java.lang can not cast the object to the Dog
        //ONEMLIIII!!!!!
   //at compile time time we cast care about has a relationship!! but at run time it cares about can you  put the object 
   // into the Object class that you are gonna store!-> that means Dog d3=new Object() you try to do this! it is error
   //so what kind of object it will be work?
   Object o1= new Dog();
   Dog d4= (Dog)o1;
 Object objectOfCat = new Cat();
 Cat catObj= (Cat)objectOfCat;


    }
}

