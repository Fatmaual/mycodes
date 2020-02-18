package denemelerim;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class MethodOverloading_B11 {
    public static void main(String[] args) throws Exception {
   String name="Java";
       // System.out.println(name.indexOf("a"));
        //System.out.println(name.indexOf("a",2));
       // System.out.println(name.replace('a','B'));
        //System.out.println(name.replace("va","java"));
        addNums(1,3);
        addNums(1,2,3);
        addNums(1,2,3);
       // addNums1(1,2,3,4);
        int result4= addNums1(1,2,1,1);
        System.out.println("acaba sonuc nedir: "+result4);


        System.out.println("the coffee result will be print after 3 seconds");
        Thread.sleep(3000);

        String word="coffee";
        char[] charofWord= word.toCharArray();
        System.out.println(Arrays.toString(charofWord));
        String[] worOfCharStr=word.split("");
        System.out.println(Arrays.toString(worOfCharStr));
        Arrays.sort(worOfCharStr);
        System.out.println(Arrays.toString(worOfCharStr));
    }
    public static int addNums(int num1, int num2){
        return num1+num2;
    }
public static int addNums(int num3, int num4, int num5){
        return num3+num4+num5;
}


public static int addNums1(int num6, int num7, int num8, int num9) throws Exception{
        try{
          throw new Exception("gotcha!!!");
        }catch(Exception fnfe){
            System.out.println("gotchaa again");
        }

    return num6+num7+num8+num9;
}
}
