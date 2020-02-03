package day49;

public class Burger implements Edible,Juicy {

  //  public Burger(){
    //    super();
   // }

    @Override
    public void eat() {
        System.out.println("eat burger with big bite");

    }

    @Override
    public void drink() {
        System.out.println("eat burger and drink ayran");
    }

    @Override
    public void digest() {




    }

    @Override
    public void melt() {

    }
}
