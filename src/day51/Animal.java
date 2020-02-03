package day51;


public class Animal {

    public void makeNoise() {

        System.out.println("this is animal class and general animal noise");
    }
}
// I can add more classes as long as only one class is public and name is same as file name .

  class Dog extends Animal{

    @Override
      public void makeNoise(){
        System.out.println(" this is dog class and makeNoise method is wooofff");
    }

  }

  class Horse extends Animal{

    @Override
      public void makeNoise(){

        System.out.println("this is horse class and makenNoise method is neeiigghh");
    }
  }