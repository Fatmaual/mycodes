package denemelerim;

public class B11WrapperClass1 {
    public static void main(String[] args) {
        Integer i1=new Integer(123);
        Integer i2=new Integer("123");
      //  System.out.println(i1);
       // System.out.println("equals or not with i1 ? "+ i2.equals(123));
        //turn this string a primitive value
        String str="True";
        boolean b1= Boolean.parseBoolean(str);
        boolean b2=Boolean.parseBoolean("Abc");
        boolean b3=Boolean.parseBoolean("true");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        String d="3.14";
        Double d1=Double.valueOf(d);
        Double d2=Double.parseDouble(d);
        System.out.println(d1.toString());


    }
}
