package daysOfMuhtar;

public class Bank {
    public void InterestRate(){
        System.out.println("9 percent");
    }

    public static void main(String[] args) {
        BankOfAmerica BOA = new BankOfAmerica();
        BOA.InterestRate();  //  -->9 percent
        Chase Chase = new Chase();
        Chase.InterestRate();
        CapitalOne CO= new CapitalOne();
        CO.InterestRate();

    }
}
class BankOfAmerica extends Bank{

    public void InterestRate(){
        System.out.println("BOA' interest rate is: 5%");
    }

}
class Chase extends Bank{

    public void InterestRate(){
        System.out.println("Chase' interest rate is: 6%");
    }

}
class CapitalOne extends Bank{
@Override
    public void InterestRate(){
        System.out.println("CapitalOne' interets rate is: %7");
    }

}