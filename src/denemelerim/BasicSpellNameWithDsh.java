package denemelerim;

public class BasicSpellNameWithDsh {
    public static void main(String[] args) {
        String name ="Aliye";
      //  String result =" ";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+"");
            if(i!=name.length()-1){
                System.out.print("-");
            }


        }
    }
}
