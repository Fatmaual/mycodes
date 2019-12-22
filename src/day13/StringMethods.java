package day13;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Yasemin";
        System.out.println(s1.length() );//printin icinde lenght icin int yaziyor cunku number
        int lengthOfStr = s1.length();
        if (lengthOfStr>4){
            System.out.println("more than 4 character");
        }else{
            System.out.println("not more than 4 character");
        }
    //String name = "Ankar";
       // System.out.println(name);//print out aldigim icin ilk isimde cikti
       // name = "bulent";
       // System.out.println(name);
     //String city = "bursa";
     //   System.out.println(city);
      //  String city2 = city;
       // System.out.println(city2);
String name = "Pumpkin";
        System.out.println(name);
        name.toUpperCase();
        System.out.println(name);//aradaki farka dikkat et
        System.out.println(name.toUpperCase());//sadece print out busekil aldik ama save yapmadik
        // if i really wanna print it out with uppercase ile take a look
        name = name.toUpperCase();
        System.out.println(name);
        //herzaman ama herzaman string action or methods chancing the value and actually creating it will be new one!!!!!!





    }
}
