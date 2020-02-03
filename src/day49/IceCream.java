package day49;

//can a class both extend another class and implement an interface?
public class IceCream extends Object implements Edible {

    @Override
    public void eat() {
        System.out.println("eat chocholate one");
    }

    @Override
    public void drink() {
        System.out.println(" strawberry smoothie is delicious!!");


    }
  @Override
  public void digest(){
      System.out.println("digesting burger mean don't eat too many burgers");
  }


    public static void main(String[] args) {
        IceCream i1= new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        i1.digest();
    }
}
