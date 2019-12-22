package day31;

public class MethodPractice2 {
    public static void count1to10(){
        for (int x = 1; x <=10 ; x++) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    //write reusable code to count 1 to 10
    //give a name count1to10
    // no need for object when being called : static
    //it should be accessible anywhere in your project   :  public
    //doesn't return any value   : void
    //doesn't need any external data when being called   :(nothing inside)
   count1to10();
   //system.out.println();
   count1to10();
//optionally you can call using classname.methodName();
        MethodPractice2.count1to10();
    }

}
