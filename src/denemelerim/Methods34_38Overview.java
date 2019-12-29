package denemelerim;

public class Methods34_38Overview {
    public static void main(String[] args) {
        System.out.println(studentNameAndAge("fatma ",40));
        System.out.println(schoolInfo("fatma ",40," Cybertek School"));
        int cometogethernumbers=build3DNumber(4,2,4);
        System.out.println(cometogethernumbers);
        System.out.println(build3DNumber(4,2,4));

    }
    public static String studentNameAndAge(String name , int age){
        int a=age;
        String n=name;
        return n+a;
    }
    public static String schoolInfo(String name, int age, String school){
        String names= name;
        int ages=age;
        String schools=school;
        return names+ages+schools;
    }
    public static int build3DNumber(int digit1, int digit2, int digit3){
       if(digit1==0 || digit1>=9)
           System.out.println(digit1);
       if(digit2==0 || digit2>=9)
           System.out.println(digit2);
       if(digit3==0 || digit3>9)
           System.out.println(digit3);
       return digit1+digit2+digit3;
    }
}
