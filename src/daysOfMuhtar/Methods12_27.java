package daysOfMuhtar;

public class Methods12_27 {
    public static void main(String[] args) {
        evenOdd(100);
    }
    public static void evenOdd(int number){
        if(number%2==0){
            System.out.println(number +" is even ");
            return; // so return mean here is  kind of else if duty if i don't give any value the
        }          //result will be both odd and even
        System.out.println(number+" is odd number");

    }

}

