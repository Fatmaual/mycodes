package denemelerim;

public class RetrunPractice {
    public static void main(String[] args) {
    String name=GiveMeMyName();
        System.out.println("name is : "+name);
 //int myResult=doubleTheNumber(10);
 //System.out.println("my result is: "+myResult);
        System.out.println("doubling the number : "+doubleTheNumber(50));
        System.out.println(doubleTheNumber(45));
        System.out.println("for adding of numbers result is : "+addWithReturn(20,67));
        System.out.println(addWithReturn(30,90) + 5);
     addVoid(34,10);
        System.out.println(divide(10,3));
        System.out.println(divide(10,0));
        System.out.println(divide(45,9));

    }
    public static double divide(double number1, double number2){
        if(number2==0){
            return 0.0;
        }else{
            return number1/number2;
        }
    }
    public static void addVoid(int num1, int num2){
        int addVoidResult = num1+num2;
        System.out.println(num1+num2);
    }
    public static int addWithReturn(int num1,int num2){
      //  int sum=num1+num2;
      //  return sum;
        int addResult= num1+num2;
        return addResult;
    }
    public static int doubleTheNumber(int num){
    //make the number double;
        int result =num*2;
        return result;
    }
    public static String GiveMeMyName(){
        //create a static method called givemeMyName
        //it returns your name as a result and it has no parameters
  return "Akbar";
    }
}
