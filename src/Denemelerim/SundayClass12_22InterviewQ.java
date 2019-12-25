package Denemelerim;
public class SundayClass12_22InterviewQ {
    public static void main(String[] args) {
        Words("Kerem");
        Reverse("Olivia");
        System.out.println();
        PrintAtoZ();
        System.out.println();
        ReverseCharacters();

    }
    public static void ReverseCharacters(){
        for (char i ='d' ; i >='a' ; i--) {
            System.out.print(i+"");
        }
    }
    public static void PrintAtoZ(){
        for (char i = 'a'; i <='z' ; i++) {
            System.out.print(i+" ");

        }
    }
    public static void Reverse(String adin){
        for (int i =adin.length()-1; i >=0 ; i--) {
            System.out.print(adin.charAt(i));

        }
    }
    public static void Words(String nme){
        for (int i = 0; i < nme.length(); i++) {
            System.out.print(nme.charAt(i));
            if(i!=nme.length()-1){
                System.out.print("=");
            }
        }
        System.out.println();
    }
}


