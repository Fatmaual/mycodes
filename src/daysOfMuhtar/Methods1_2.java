package daysOfMuhtar;

public class Methods1_2 {
    public static void main(String[] args) {
        /**IF I wanna remove the duplicate values i need to check so in order to do that i need a loop
         * for for loop if i dont get itiratino it will be infinite loop x++
         * it should be ending index and begining index so I need substring str.substring(xbegining and
         * x+1 ending
         *    for(int x=0; x<str.length();x++) {
         *             if(!result1.contains(str.substring(x,x+1))){
         *                 result1 +=  str.substring(x,x+1);
         *             }
         *         }
         *         System.out.println(result1);
         *         contains methods it is only accept substring not charAt
         * */
        String str="AAABBBDDEEE"; //expected result: ABDE
        System.out.println(longestord("ayse","fatma","fehime"));

    }
public static String longestord(String... words){

        String longest=words[0];
    for (int i = 0; i <words.length ; i++) {
        if(longest.length()>words.length){
            longest=words[i];
        }

    }
    return longest;


}
}
