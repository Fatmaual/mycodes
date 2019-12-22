package day17;

public class NmaePrinter2 {
    public static void main(String[] args) {
        String name = "call 1-800-Alexander";
        int x = 0;
        while(x<name.length()){   //(x <=name.length()-1 last index !!COK ONEMLI SON KARAKTERI BILMIYORSUN VE YAZMAK ICIN BU FORMUL!
           // System.out.print("index "+ x+ " : ");
            System.out.println(name.charAt(x));
            ++x;

        }
//print you name ama adinin kac karakyer oldugnu bilmiyorsun
        //adini reverse order ile yaz..
    }
}
