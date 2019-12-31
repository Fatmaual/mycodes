package denemelerim;

public class B11MethodReviewReverseInterview {
    public static void main(String[] args) {
        System.out.println(isPalindrome("hannah"));
        System.out.println(isPalindrome("was it a car or a cat that I saw "));
        System.out.println(isPalindrome("race car"));
        System.out.println(isPalindrome("pon nop"));
    }

    public static boolean isPalindrome(String word) {
        String reword = reverseString(word);
        word=word.replaceAll(" ","");
        reword = reword.replaceAll(" ", "");
         return reword.equals(word);
    }

    public static String reverseString(String word) {
        String reword = "";
        word = word.replaceAll(" ", "");
        for (int x = word.length() - 1; x >= 0; x--) {
            reword += word.charAt(x) + "";
            System.out.print(word.charAt(x) + " ");
        }
        return reword;
    }


}
