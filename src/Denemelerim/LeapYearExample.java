package Denemelerim;

public class LeapYearExample {
    public static boolean LeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }

        }
    }
    public static void main(String[] args) {
     boolean result=  LeapYear(2019);//1940
        System.out.println(result);
    }
}