package day40;

public class BankAccount {

    String accountHolder;
    String accountType;
    long accountNumber;
    double balance;

    /**
     * show account balance
     * showAccount Holder AccountType
     * <p>
     * getBalance return the balance
     * <p>
     * deposit (amount)
     * withdraw(amount)
     * <p>
     * withdraw100$Cash()
     * <p>
     * purchaseProduct(productPrice, count)
     * toString
     */
    //setAll the value:
    public void seAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance) {
        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance;

    }

    //show account balance:
    public void showBalance() {
        System.out.println("current balance  is : " + balance);

    }

    //show Accountholder account type:
    public void AccountHolderAccountType() {
        System.out.println("account holder is " + accountHolder + " account type is : " + accountType);
    }

    //get balance return the balance:
    public double getBalance() {
        //think about it if you have tons of validation to make sure that have correct credential to view the balance
        return balance;
    }

    //deposit:
    public void deposit(double amount) {
        balance = balance + amount; //balance+=amount
    }

    //withdraw:
    public void withdraw(double amount) {
        balance = balance - amount; //balance-=amount
    }

    //withdraw100$Cash()
    public void withdraw100$Cash() {
        withdraw(100);
        //or balance=balance-100;
    }

    //purchaseProduct:
    public void purchaseProduct(double productPrice, int count) {
        double totalPrice = productPrice * count;
        balance -= totalPrice;
        //or
        //   withdraw(totalPrice);
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}