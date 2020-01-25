package day40;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1.name);

        dog1.Breed="English Cocker Spaniel";
        dog1.Size="small";
        dog1.color="gray and white";
        dog1.name="Ginger";
        dog1.Gender='F';
        dog1.Age=25;
        dog1.food="sushi";

        System.out.println(dog1.Breed);
        dog1.getInfo();


        Dog dog2 = new Dog();
        dog2.Breed="Dalmatian";
        dog2.Size="small";
        dog2.name="Puffy";
        dog2.Gender='F';
        dog2.Age=1;
        dog2.color="orange and white";
        dog2.food="Sushi";

        dog1.getInfo();
        dog2.eat();
        dog1.eat();
        dog1.play();
        dog2.play();

      //  String str= new String("Hello");
        //str.toLowerCase();

    }
}
