package daysOfOfficeHours;

import java.util.Scanner;

public class PalindromeVasly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
 int reverseNumber=0;
 int originalNum=num;
 while(num>0){
     //12%10=2
     //125%10=5
     //3%10=3
     int last_digit=num%10;
     reverseNumber=reverseNumber*10 +last_digit;
     //oncw we retrieved and added last digit to the reversed Number we can get rid off that digit
     //do debug explains everything
     num=num/10;
 }
        System.out.println(reverseNumber);
        System.out.println(reverseNumber==originalNum);
    }
}
