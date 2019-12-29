package day34;

public class ReturnPractice {
    public static void main(String[] args) {
       printMin4CharacterLengthName("Jon");
       printMin4CharacterLengthName("John Shark");

    }
    public static void printMin4CharacterLengthName(String name ){
       //if the name less than 4 characters get out of the method
       if(name.length()<4){
           System.out.println("invalid name");
           return;//this return mean get out from the method early
       }
        System.out.println(name);
    }
}
