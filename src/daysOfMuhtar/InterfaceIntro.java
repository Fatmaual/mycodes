package daysOfMuhtar;

public interface InterfaceIntro {

 //   public InterfaceIntro(){

//    }
    //public void method b(){

  //  }
    public static void mm(){

    }
    public default void methodc(){

    }
    public abstract void methodA();


}
 interface Datas{

 }
class Testi implements InterfaceIntro, Datas{
//    subtype           supertype
    @Override
    public void methodA() {

    }

    public static void main(String[] args) {
        InterfaceIntro.mm();

    }
}
class Ab{

}