package day16;

import java.util.Scanner;

public class StringAndGoogleSearch {
    public static void main(String[] args) {
       /**
        * String word1 = "asli";
        *         String word2 = (word1.charAt(3)+""+word1.charAt(2)+""+word1.charAt(1)+""+word1.charAt(0));
        *         System.out.println(word2);
        *
        * //yada su sekil yapabilirsin
        *         // String word1 = "asli";
        *         //String word2 = "";
        *         //word2 = "" +word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        * //word2 = "" +word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        *         //yada word2 += word1.charAt(3)+""+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        *         //eger "" koymazsam charAt yani character numara alacak!! bu onemli!! take a look!
        *         String msg = "hello";
        *         //msg = msg +"world!";
        *         msg += " world";
        *         System.out.println("msg = " + msg);
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the keyword to search");
        String keyWordToSearch = scan.nextLine();

       String tabTitle = keyWordToSearch+" - Google Search";
       if(tabTitle.startsWith(keyWordToSearch)&& tabTitle.endsWith(" - Google Search")){
           System.out.println("test passed");
       }else{
           System.out.println("test failed");
       }

    }
}
