package daysOfMuhtar;

import java.util.Arrays;

public class OfficeHour12_30 {
    public static void main(String[] args) {
        int a =10;
        Integer A=a;
        float f=0.5f;
        Float F= f;
        Double num1=0.5;
        Short num3= 45;
        Integer num4=100;
        double num2=num4;
        Long number1=100L;//auto boxing
        Float f1=100.0f;
        double d1=f1;//unboxing
        System.out.println(Byte.MAX_VALUE);// maximum value of primitive byte
        System.out.println(Byte.MIN_VALUE);//minimum value of primitive byte
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //parse method
        String str1="123";//this is just task yani string 1 ekledigimde toplamiyacak concatenate
        int result= Integer.parseInt(str1);                    //yapacak
        System.out.println(result+1); //124
        String str2="true";
        boolean r1= Boolean.parseBoolean(str2);
        System.out.println(r1==false);
        String str3="FalSe";
        boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2);
        String str4 ="Parvin";
        boolean r4 =Boolean.parseBoolean(str4);//it is going to give me result of false bc parvin is
        //not a boolean
        String str5 ="true or false";//anything instead of true will be false
        boolean r5 =Boolean.parseBoolean(str5);
        System.out.println("r5 is " +r5);
        String s1="100.5";
        Double c1=Double.parseDouble(s1);//auto boxing
        System.out.println(c1+1);
        Double c2=Double.valueOf(s1);
        System.out.println(c1);
        System.out.println(c2);
        String s2="fAlSe";
        //System.out.println(s2);
        Boolean b1=Boolean.valueOf(s1);
        System.out.println(b1);
        int[]arr =new int[3];
        System.out.println(Arrays.toString(arr));
        Double[] arr1=new Double[3];
        System.out.println(Arrays.toString(arr1));
        Boolean[] arr2= new Boolean[3];
        System.out.println(Arrays.toString(arr2));
        String name="string";
        String name1=new String("string");
        Integer I1=new Integer("123");//this is older version but still accept it


        System.out.println(addNum(100.5,200.8));
    }
    public static int addNum(int a, int b){

        return a+b;

    }
    public static double addNum(double a,double b){
        return a+b;
    }
}


