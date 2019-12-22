package day22;

public class ContinueArray {
    public static void main(String[] args) {
        double [] prices = new double [5];
        System.out.println(prices[0]);

        System.out.println(prices);
        prices[0]= 2.46;
        prices[1]= 12.96;
        prices[2]= 992.146;
        prices[3]= 500;
        prices[4]= 65.126; //if i am gonna go for over the range the system will give you error

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        char[] nameChars = new char[5];
        nameChars[0]= 'A';
        nameChars[1]= 'K';
        nameChars[2]= 'B';
        nameChars[3]= 'A';
        nameChars[4]= 'R';

        System.out.println(nameChars[0]);
        System.out.println(nameChars[1]);
        System.out.println(nameChars[2]);
        System.out.println(nameChars[3]);
        System.out.println(nameChars[4]);
       // System.out.println(nameChars); eger busekil print out alirsak olmaz cunku hata verir sadece charda olur
boolean[] yesNo = new boolean [3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2]=10>7;//(true)
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);





    }
}
