package Denemelerim;

public class MethodDenemeler {
    public static void main(String[] args) {
  message("yasemin","dogan",35);
  message("gunday","pistav",40);
  message("fatma","",40);
 boolean ageCompare=yas(10,5);
        System.out.println(ageCompare);
        System.out.println("a b ve c nin tolami"+ numberFinder());


    }
 public static void message(String name, String lastname,int age ){
     System.out.println("hello");
     System.out.println("adiniz "+name);
     System.out.println("soyadiniz "+lastname);
     System.out.println("yasiniz "+age);
     System.out.println();
    }
    public static boolean yas(int a,int b){
       if(a>b){
           return true;
       }else{
           return false;
       }
    }
    public static int numberFinder(){
        int a =10;
        int b =20;
        int c =50;
        int toplam=a+b+c;
        return toplam;

    }

}
