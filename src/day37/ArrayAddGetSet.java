package day37;
import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
   String word ="aaabbbccchhhyyyrrrggggg";
   String takeThemOnes="";
        for (int x = 0; x <word.length() ; x++) {
            if(!takeThemOnes.contains(word.substring(x,x+1))){
                takeThemOnes+=word.substring(x,x+1);
            }
        }
        System.out.println(takeThemOnes);
        String words="ccddee";
        String wordOnes="";
        for (int x = 0; x <words.length() ; x++) {
            if(!wordOnes.contains(""+words.charAt(x))){
                wordOnes+=""+words.charAt(x);
            }
        }
        System.out.println(wordOnes);
        System.out.println( removeDup("HEEEllllllPPPPPP"));
    }
    public static String removeDup(String str){
        String resulOfRetrun ="";
        for (int x = 0; x <str.length() ; x++) {
            if(!resulOfRetrun.contains((""+str.charAt(x)))) {
                resulOfRetrun+=str.charAt(x);
            }

        }
        return resulOfRetrun;

    }
   public static int frequent(String a,char b){
        int count=0;
       char[] bChar= a.toCharArray();
       for (char each :bChar) {
            if(each==b){
                count++;
            }
       }

          return count;
        }

    }


