package day20;

public class PalindromeTest {
    public static void main(String[] args) {
       String name = "Nurses run"; // how can i take out space-->
        System.out.println("name = " + name);
       String reversedName = "";
        for (int i = name.length()-1; i >= 0; i--) {
            reversedName = reversedName+name.charAt(i);
        }
        System.out.println("reversedName = " + reversedName);

        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");
        }else{
            System.out.println("palindrome test has failed");
        }

    }
}
