package day54.InterfaceOOPClothes;

class MakeUps implements Wearable,Cosmetics{

    @Override
    public void wear() {
        System.out.println("makeUp for my eyes");

    }
}
class Perfume implements Wearable,Cosmetics{

    @Override
    public void wear() {
        System.out.println("wearing jadore or burberry");

    }
}

class Watch implements Wearable{

    @Override
    public void wear() {
        System.out.println("wearing fossil");

    }
}

public class Clothes implements Wearable{
    int size;


    @Override
    public void wear() {
        System.out.println("wearing zara");

    }
}
