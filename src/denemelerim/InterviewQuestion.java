package denemelerim;
import java.util.Arrays;

public class InterviewQuestion {
    public static void main(String[] args) {
        /**
         * INTERVIEWWW QUESTIOOONNNNNN*/
String str1="abc", str2="cbb";
char[] ar1=str1.toCharArray();
Arrays.sort(ar1);
char[]ar2=str2.toCharArray();
Arrays.sort(ar2);
        System.out.println(ar1);
        System.out.println(ar2);
        str1=Arrays.toString(ar1);
        str2=Arrays.toString(ar2);
        System.out.println(str1.equals(str2));
        System.out.println("================");
        String s1="aaabbbcccddddeeee";
        String s2 ="";
        for (int x = 0; x <s1.length() ; x++) {
            String eachChr=""+ s1.charAt(x);
            if(!s2.contains(eachChr)){
                s2+=eachChr;
            }
        }
        System.out.println(s2);
        System.out.println("==========");
 String fiveminutes = "aaabbbdddfffrrrxxee";
 String[]eacChr = fiveminutes.split("");
 String result = "";
 for(String each: eacChr){
     if(!result.contains(each)){
         result+=each;
     }
 }
        System.out.println(result);
    }
}


