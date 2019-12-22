package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {
        System.out.println("welcome to McDonald, what can I get for you?");
        String orderName = "";
        int orderCode = 35;
        if (orderCode == 1) {
            System.out.println("you have selected 11");
            orderName = "burger";
        } else if (orderCode == 5) {
            System.out.println("you have selected 5");
            orderName = "frech fries";
        } else if (orderCode == 8) {
            System.out.println("you have selected 8");
            orderName = "nuggets";
        } else if (orderCode == 35) {
            System.out.println("you have selected 35");
            System.out.println("enjoy it");
            System.out.println("yum yum!!");
            orderName = "ice cream";
        } else {
            System.out.println("you have selected unknown item number@!!");
            orderName = "unknown";
            System.out.println("your order is " + orderName);
        }
    }
}