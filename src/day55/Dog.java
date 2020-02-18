package day55;
class Animal{

}
class Bird extends Animal{

}

public class Dog extends Animal{

    String type;

    public Dog(String type) {
        this.type = type;
    }

    public void bark() {
        System.out.println(type + " Dog is barking");
    }

}

