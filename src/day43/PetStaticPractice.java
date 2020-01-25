package day43;

public class PetStaticPractice {
    public static void main(String[] args) {
       // String str=String.valueOf(10);

        Pet.showGeneralPetInfo();
        //does not work
     //Pet.getName();
     Pet animal1= new Pet("cat","ginger");
        System.out.println("animal 1 name is: "+animal1.getName());
        animal1.speak();

        Pet.showGeneralPetInfo(); //I put pet first instead of animal1 because DO NOT PUT OBJECT ON STATIC METHOD it
        // does not give you error but it is very unlikely!

    }
}
