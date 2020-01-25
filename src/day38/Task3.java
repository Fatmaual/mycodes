package day38;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        /**  *Given a ArrayList of 10 String(yes String) as scores"79", "54", "100", "65", "44". ...
         * *print pass if its more than 60 fail if not
         *                 *count how many score are more than 90
         *                 *get the average score
         *                *update the values with score - grade pair
         * for example
         * 79 C, 54F, 100 A, 65D, 44F, 89 B, 95 A
         * Optionally create 4 methods according to above criteria
         *       */
        List<String> numlst= Arrays.asList("79", "54", "100", "65", "44","78","68","98","77");
        System.out.println("numlst = " + numlst);
        for(String each:numlst){
            int eachNum=Integer.parseInt(each);
            if(eachNum>60){
                System.out.println("passed: "+eachNum);
            }else{
                System.out.println("failed:  " + eachNum);
            }
        }
        //count how many number more than 90
        int count=0;
        for(String each:numlst){
            if(Integer.parseInt(each)>90){
                ++count;
            }
        }
        System.out.println("more than 90 counted: "+count);
        //get the average score
       int sum=0;
       for(String each:numlst){
           sum=sum+Integer.parseInt(each);
       }
        System.out.println("average is : "+sum/numlst.size());
    }
}
