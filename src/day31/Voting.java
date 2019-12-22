package day31;

public class Voting {
    public static void checkEligibility(int age){
     //   int age = 15;
        if(age>18){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible");
        }
    }
    public static void main(String[] args) {
        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(40);
//you can't access here method parameter(sout) you can write here just method!
//System.out.Println(age) WRONG!
int yourAge = 12;
checkEligibility(yourAge);
//you can do this too
    }
}
