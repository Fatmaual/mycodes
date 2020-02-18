package day53;

public class FruitShop {
    public static void main(String[] args) {
        Apple apple1= new Apple("sweet", "red","Fuji");
        //what can i access using reference variable apple1
        //apple1 has Apple as reference type(data type), so we can access anything inside apple
        System.out.println("apple1.taste = " + apple1.taste);
        System.out.println("apple1.color = " + apple1.color);
        System.out.println("apple1.type = " + apple1.type);
        apple1.getDigest();


        System.out.println("--------------");
        Fruit fruit1= apple1;// store those address--->new Apple("sweet", "red","Fuji");
        //fruit is reference type, apple is actual object type
        System.out.println("fruit1.color = " + fruit1.color);
        System.out.println("fruit1.taste = " + fruit1.taste);
        //fruit1.type--> we can't get access type coming from apple if refer it as Fruit
        //if fruit doesn't getDugest method below will not compile bc only reference type
        //decide what you can access with that variable
        fruit1.getDigest();// new Apple("sweet", "red","Fuji").getDigested()
        fruit1=new Orange("sour","reddish",11);
        fruit1.getDigest();
        System.out.println(fruit1.toString());

        //  String str= null;
        //  System.out.println(str.charAt(0));
        //  System.out.println(str.bark);
        //  System.out.println(str.getDigest);


        Fruit fruit2 = new Apple("crispy","dark red","gala");
        Fruit fruit4 = new Orange("sour","orange",12);
        Fruit fruit3 = new Orange("very sweet ", "red",10);

        Fruit[] myFruits= {fruit1,fruit2,fruit3,fruit4};
        for(Fruit eachFruit:myFruits){
        eachFruit.getDigest();
        }


    }


}
