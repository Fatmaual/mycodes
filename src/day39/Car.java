package day39;

public class Car {

  String carModel;
  int carYear;
  int carMilage;
  String carColor;
  char carType;

  public void goForward(){
      System.out.println(carModel +" going forward ");
      //create another instance method
      //instance method are tied to the object
      //it does not have static keyword
      //we need an object when we call them

  }
  //create a method to print hold is this car
  public void printCarAge(){
      System.out.println("car year is "+(2020-carYear));
  }
  //create a method to change the color
  public void changeColor(String newColor){
      //BURAYA nekadar cok code yazabilirsen yazabilirsin
      //user is actually passing correct color
      //for example red, blue is valid color
      //abc, egf is not valid color
      carColor=newColor;

  }

}
