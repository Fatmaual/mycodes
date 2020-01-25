package daysOfMuhtar;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
    public static void main(String[] args) {
        BankAccount Serra= new BankAccount();

        //for now their account infos are null bc I haven't given value them yet
        Serra.setAccountHolder("Serra Pistav");
        Serra.setAccountNumber(4345678);
        System.out.println("name :"+Serra.getAccountHolder());
        System.out.println("account number: "+Serra.getAccountNumber());
        System.out.println("available balance is: "+Serra.getAvailableBalance());
        Serra.deposit(2000);
        Serra.CheckingBalance();
        Serra.WithDraw(2500);
        Serra.CheckingBalance();
        Serra.deposit(300000000);
        Serra.CheckingBalance();

        BankAccount Omer =new BankAccount();
     Omer.setAccountHolder("Omer");
     Omer.setAccountNumber(1234567);
     Omer.getAccountInfo();
     Omer.deposit(900000);
     Omer.CheckingBalance();
     Omer.WithDraw(300987);
     Omer.CheckingBalance();
     Omer.getAccountInfo();

     BankAccount[] accounts={Serra, Omer} ;
        ArrayList<BankAccount> Accounts =new ArrayList<>();
       Accounts.addAll(Arrays.asList(Serra,Omer));  //Account.add(Serra);

        


    }
}
