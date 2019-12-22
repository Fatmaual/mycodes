package day26;

public class ArrayTaskNumberTest {
    public static void main(String[] args) {
        int[] scores = {156, 101, 76, 187, 87, 110};
        String finalResult = "";
        int cntlessThan100 = 0;
        int size = scores.length;
        for (int eachNum : scores) {
            if (eachNum <= 100) {
                finalResult = "no";
                break;
            }
        }
        System.out.println("final result is "+finalResult);
    }
}