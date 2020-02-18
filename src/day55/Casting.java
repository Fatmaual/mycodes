package day55;


public class Casting {
    public static void main(String[] args) {
        int x =10;
       double y = (int)x;
        System.out.println(y);

    //    byte b= x;
        byte b =(byte)x;
        Object obj= new Dog("pilav");

      //  obj.bark();-->error
       // Dog d =new Dog("asdfghjkl");------->this is new object!!!!
       Dog dog =(Dog) obj;
       dog.bark();

       Object objt= new Bird();
       Animal ob1= new Bird();


    }
}
