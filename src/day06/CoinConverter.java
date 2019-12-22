package day06;

public class CoinConverter {
    public static void main(String[] args) {
    // you have 2 dollar
    //how many quoter you can get 25c
        // how many dime you can get 10c
        //how many nickel you can get 5c
        //how many penny you can get
        int cent = 200;
        cent -=74 ;
        int quoter = cent/25;
        int penny = cent % 25;
        System.out.println(quoter);
        System.out.println(penny);
        int dime = cent % 10;
        int penny2 = cent % 10;
        System.out.println(dime);
        System.out.println(penny2);












    }




}
