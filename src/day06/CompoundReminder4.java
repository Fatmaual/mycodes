package day06;

public class CompoundReminder4 {
    public static void main(String[] args) {

        int bankBalance = 1140;
        System.out.println(" I have spent the half of it : " + bankBalance);

        //bankBalance = bankBalance /2;
        bankBalance /= 2;
        System.out.println(" now my balance is: " + bankBalance);

        bankBalance = bankBalance % 500;
        System.out.println("I want to divide the balance by 500 and keep the reminder in my pocket");
        System.out.println("the reminder is : " +bankBalance);





    }
}
