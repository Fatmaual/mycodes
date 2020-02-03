package day52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {
        List<Account> accountList= new ArrayList<>();
        accountList.add(new Account("Jon Snow", 10000));
        accountList.add(new Account("Valid", 11000));
        accountList.add(new Account("Swetlana", 13000));
        accountList.add(new Account("Muhammed", 8000));
        accountList.add(new Account("Amma", 17000));
        accountList.add(new Account("Ata", 150000));


        System.out.println("account list before : \n"+accountList);
      Collections.sort(accountList);
        System.out.println("accountList after = \n" + accountList);


    Account myAccount= new Account("Fatma Ulusal", 0);
    for(Account eachAccount :accountList){
    eachAccount.transferAll(myAccount);
}
        System.out.println("Fatma Ulusal's total account is: "+myAccount);
        System.out.println("account list: "+accountList);

       Account a1 = new Account("Polymorphism",1000);
       Transferable t1= new Account ("Polymorphism2",10000);
       Comparable c1= new Account("Polymorphism3",10000);
       Object ob1= new Account ("Polymorphism4",10000);



    }



}
