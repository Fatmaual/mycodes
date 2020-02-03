package day52;

public class BankTest {
    /**
     * * Warm up Task:
     * * Create a class called Account
     * * it has 2 fields
     * *     name as String (protected) , balance as int (private)
     * *
     * *   -- add constructor to set name and balance
     * *   -- add getters to the balance field
     * *   -- add deposit method that accept 1 int arugument
     * *          -- it will change the balance
     * *   -- add withdraw method that accept 1 int arugument
     * *          -- reduce the balance
     * *   -- add toString method for nice output
     * *  Create an interface called Transferable
     * *  it has single abstract method
     * *      - transferAll accept another Account object as parameter
     * *      - void transferAll(Account otherAccount)
     * *
     * *  Account implements Transferable interface
     * *      logic inside transferAll implementation
     * *          it should take all the balance from current account to other Account
     * *
     * *   Create a class called   Account Action with main method
     * *      Test your code by creating few Account objects
     * *
     * *
     * *
     * *   Optionally : let Account implements Comparable<Account>
     * *          Create List<Account> and sort them using Collecions.sort(..)
     * *
     * *   to honor Palindrome day ,
     * *   add a method inside Account class called
     * *          isPalindrome return true if account name is palidrome (case and space should not matter)
     * */
    public static void main(String[] args) {

        Account a1 = new Account("John Snow", 10000);
        Account a2 = new Account("Hannah", 7000);

        System.out.println("a1 before = " + a1);
        System.out.println("a2 before  = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 after =  " + a1);
        System.out.println("a2 after = " + a2);

        a2.transferAll(a1);
        System.out.println("a1 after 2nd transfer =  " + a1);
        System.out.println("a2 after 2nd transfer =  " + a2);

        System.out.println("Does a1 has palindrome name : " + a1.isPalindrome());
        System.out.println("Does a2 has palindrome name : " + a2.isPalindrome());


        System.out.println(a1.compareTo(a2));

    }


}