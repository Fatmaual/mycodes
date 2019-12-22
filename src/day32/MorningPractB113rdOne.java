package day32;

public class MorningPractB113rdOne {
    public static void reverse(String name2){
        String reversed ="Fatma";
        for (int i = reversed.length()-1; i >=0 ; i--) {
            System.out.print(reversed.charAt(i));


        }
    }

    public static void spellName(String name){
     String myName="Olivia";
        for (int i = 0; i <myName.length() ; i++) {
            System.out.print(myName.charAt(i)+"-");
        }
        }

    public static void main(String[] args) {
        spellName("Olivia");
        System.out.println();
        reverse("Fatma");


    }
}
