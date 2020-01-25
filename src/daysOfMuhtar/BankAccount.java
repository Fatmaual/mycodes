package daysOfMuhtar;

public class BankAccount {
    /**
     * Create a class name of BankAccount
     * create a variables AccountHolder,AccountNumber, AvailableBalance
     * do actions;deposit, withdraw,checking balance
     * requirements:
     * 1-apply encapsulation (done)
     * 2-user should be able to deposit withdraw and check the balance
     * 2.1 if the withdrawing amount is greater than available balance $35 penalty fee will be charger from the account
     * 2.2if the available balance is less or equal to 0,  account holder won't be able to withdraw money.
     */
   private String AccountHolder;
   private double AccountNumber;
  private  double AvailableBalance;

    public BankAccount(){

    }
    public String getAccountHolder(){
        return AccountHolder;
    }
    public void setAccountHolder(String AccountHolder){
   this.AccountHolder=AccountHolder;
    }
    public double getAccountNumber(){
        return AccountNumber;
    }
    public void setAccountNumber(double AccountNumber){
  this.AccountNumber=AccountNumber;
    }
    public double getAvailableBalance(){
        return AvailableBalance;
    }
    public void setAvailableBalance(){
        this.AvailableBalance=AvailableBalance;
    }
   //Actions:
    //deposit
    public void deposit(double amount ){
        AvailableBalance+=amount;
    }
    //withdraw:
    public void WithDraw(double amount){
        if(AvailableBalance<=0){
            System.out.println("your account balance is less or equal to 0");
            return;
        }

        if(amount>AvailableBalance){
            AvailableBalance-=35;
        }
        AvailableBalance-=amount;

    }
    //checking balance:
    public void CheckingBalance(){
        System.out.println("available balance is "+AvailableBalance);
    }
    //get account info
    public void getAccountInfo(){
        System.out.println("name: "+getAccountHolder());
        System.out.println("account number: "+getAccountNumber());
        System.out.println("available balance: "+getAvailableBalance());
    }
}
