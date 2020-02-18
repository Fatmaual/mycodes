package day56.B11;
interface IndoorPet{

}

class Balik extends Animal{

    @Override
    public void makeAnoise() {

    }
}
class Civciv extends Animal implements IndoorPet{
    public String legsCount;

    @Override
    public void makeAnoise(){
        System.out.println("cinvic class make a noise");
    }
}

class Cat extends Animal implements IndoorPet{
   public  String legsCount= "cat legs";

    @Override
    public void makeAnoise(){
        System.out.println("cat class make a noise");
    }

}

public abstract class Animal {

    public abstract void makeAnoise();


    public static Animal getMyAnimal(){
        return new Civciv();
    }
    public static void main(String[] args) {

        Animal animal =getMyAnimal();
      //  Cat cat1= (Cat)animal;yukaridaki code bana bunu veriyor
        String objName= animal.getClass().getSimpleName();
        System.out.println((objName));
        boolean isCivciv= animal instanceof Civciv;
        System.out.println(" is animal pointing to a Civciv? "+isCivciv);
        boolean isCat= animal instanceof Cat;
        System.out.println(" is animal pointing to a Cat? "+isCat);
        if(isCat==true){
            Cat cat=(Cat)animal;
            System.out.println(cat.legsCount);
        }else if(isCivciv==true){
           Civciv civciv= (Civciv)animal;
            System.out.println("is a civciv has 4 legs? "+civciv.legsCount);
        }

    }
}
