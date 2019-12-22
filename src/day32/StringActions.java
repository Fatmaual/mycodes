package day32;

public class StringActions {
    public static void main(String[] args) {
        reversedMyOwnName();
        dashOut();
        System.out.println();
        printStringWithDsh("Bekir");
        printStringWithDsh("Bekir Sari");
        printStringWithDsh("canim Babam");
        System.out.println();
        printAtoZ();
        System.out.println();
        printZtoA();
    }
    public static void reversedMyOwnName(){
        String myName ="Yasemin";
        for (int i = myName.length()-1; i >=0 ; i--) {
            System.out.print(myName.charAt(i));
        }
        System.out.println();
    }
    public static void dashOut(){
        String name="Secil";
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
//if I am not at the last location then print -
if(i!=name.length()-1){
    System.out.print("-");
}

  }
    }
    public static void printStringWithDsh(String babam){
      //  String babm="Bekir";
        for (int i = 0; i <babam.length() ; i++) {
            System.out.print(babam.charAt(i));
            if(i!=babam.length()-1){

            }

        }
    }
    public static void printAtoZ(){
        for (char i = 'a'; i <'z' ; i++) {
            System.out.print(i+" ");

        }
    }
    public static void printZtoA(){
        for (char x = 'z'; x >= 'a' ; x--) {
            System.out.print(x+" ");

        }
    }
}
