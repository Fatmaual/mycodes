package day21;

public class NameBreaker {
    public static void main(String[] args) {
        String name = "Nursultan";
        for (int x = 0; x <name.length() ; x++) {
            char currentCharacter = name.charAt(x);
            System.out.println(currentCharacter);
            if(currentCharacter =='l'){
                System.out.println("I FOUND IT!!!");
                break;
            }
            System.out.print(currentCharacter);
        }
for(int x = 0; x<name.length();x++){
    String currentCharacter = name.substring(x, x+1);
    if(currentCharacter.equalsIgnoreCase("l")){
        System.out.println("I FOUND IT!!!");
        break;
    }
}
    }
}
