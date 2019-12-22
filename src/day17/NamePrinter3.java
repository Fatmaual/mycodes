package day17;

public class NamePrinter3 {
    public static void main(String[] args) {
        //print you name ama adinin kac karakyer oldugnu bilmiyorsun
        //adini reverse order ile yaz..
       // String myName = "Fatma";
        //System.out.println(myName.charAt(4)+""+myName.charAt(3)+""+myName.charAt(2)+
          //      ""+myName.charAt(1)+""+myName.charAt(0)); //tirnak koymadanda dene
        String name = "Sadrettin Cali";
        int x = name.length()-1;
        while(x>=0){
            System.out.println("index "+ x+ ": " +name.charAt(x));
            --x;
        }


    }
}
