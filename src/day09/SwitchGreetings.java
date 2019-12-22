package day09;

public class SwitchGreetings {
    public static void main(String[] args) {
        System.out.println("welcome to Cybertek Call Center");
        System.out.println("Please select your language option from 1-7");

        int languageOption = 1;
        switch (languageOption){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Merhaba");
                break;
            case 3:
                System.out.println("Hola");
                break;
            case 4:
                System.out.println("Salaam");
                break;
            case 5 :
                System.out.println("Bonjour");
                break;
            case 6:
                System.out.println("privet");
                break;
            case 7:
                System.out.println("szie");
                break;
            default :
                System.out.println("language is unknown");
        }





    }


}
