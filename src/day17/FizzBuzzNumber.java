package day17;

public class FizzBuzzNumber {
    public static void main(String[] args) {
        int number = 14;
        while(number <= 100) {
            if(number % 3 == 0 && number % 5 == 0){
                System.out.println(number + " is Fizz Buzz Number");
            }else if (number % 5 == 0 ){
                System.out.println(number+" is Fizz Number");
            }else if(number %3 == 0){
                System.out.println(number+ " is Buzz Number");
            }
            ++number;
            System.out.println();





        }

    }
}
