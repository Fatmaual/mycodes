package day40;

public class AtTheBank {
    public static void main(String[] args) {
        BankAccount customer1= new BankAccount();
        customer1.seAllTheValue("Checking","Fatma",
                12345678,10000);
        customer1.showBalance();
        System.out.println("customer 1 balance is:\n"+customer1);

        customer1.AccountHolderAccountType();
        System.out.println("customer1 name and account type:\n "+customer1);

        customer1.deposit(30000);
        System.out.println("customer1 has deposit for $300000 and total amount:\n"+customer1);

        customer1.withdraw(10000);
        System.out.println("customer 1 has withdraw for $10000 and new balance is:\n"+customer1);

        customer1.withdraw100$Cash();
        System.out.println("customer 1 has $100 withdraw and new balance is:\n "+customer1);

        customer1.purchaseProduct(120,5);
        System.out.println("customer purchased some items:\n "+customer1);



    }
}
