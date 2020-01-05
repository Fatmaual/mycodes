package day36;

public class WrapperReview {
    public static void main(String[] args) {
       char mychar = '9';
    //    System.out.println(mychar);
        Integer intOne=new Integer(100000000);
        Integer intTwo= Integer.valueOf(123);
      //is intthree primitive type variable
      Integer intThree= 45;//-->45-->new Integer(45); it auto-boxed and make it object and auto-unboxed
     int intFour=54;//which one goes stack which one goes heap? every object goes to stack
    //auto un-boxing :wrapping type to primitive type conversion
  int intFive=new Integer(100);//it is still primitive type this is turning into Integere object
//Auto boxing and unboxing is unique feature of conversion between primitive value wrapper classes obj.
 /**
  **/

    }
}
