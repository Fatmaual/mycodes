package day54;
interface Cosmetic{

}

interface Wearable {
    // void wear();
    void wear();

}
public class Clothes implements Wearable{
  int size;

    public static void main(String[] args) {
     // try out all the polymorphic assignment
     // according to these relationship

      Clothes  clothes1= new Clothes();
      Wearable clothes2= new Clothes();
      Object   clothes3= new Clothes();

      //==============================

        Watch    watch1 = new Watch();
        Wearable watch2 = new Watch();
        Object   watch3 = new Watch();

        //============================

        Perfume perfume1 =new Perfume();
        Wearable perfume2=new Perfume();
        Cosmetic perfume3=new Perfume();
        Object   perfume4=new Perfume();

        //=========================

        MakeUps  makeup1= new MakeUps();
        Wearable makeup2=new MakeUps();
        Cosmetic makeup3=new MakeUps();
        Object   makeup4=new MakeUps();

    }
  @Override
    public void wear(){
      System.out.println("Wearing Clothes!!");
  }
}
class Watch implements Wearable{

    @Override
    public void wear() {
        System.out.println("wearing watches");
    }
}
class Perfume implements Wearable,Cosmetic{

    @Override
    public void wear() {
        System.out.println("wearing perfumes");
    }
}
class MakeUps implements Wearable,Cosmetic{

    @Override
    public void wear() {
        System.out.println("making makeups");
    }
}