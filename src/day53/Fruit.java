package day53;
class Apple extends Fruit{
    String type;

    public Apple(String taste, String color, String type) {
        super(taste, color);
        this.type=type;
    }

    @Override
    public void getDigest() {
        System.out.println(type +" apple is "+color+ " color "+ " and it has "
                + taste + " taste when you digest ");
    }

    @Override
    public String toString() {
        return "Apple{" + " type : ' "+ type+ '\''+
                "taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public abstract class Fruit {
    String taste,color;

   public Fruit(String taste, String color){
       this.color=color;
       this.taste=taste;

 }
  public abstract void getDigest();

   public String toString(){
       return " Hello from fruit!!";
   }

}
