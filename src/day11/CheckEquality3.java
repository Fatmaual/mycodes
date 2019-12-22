package day11;

public class CheckEquality3 {


    public static void main(String[] args) {
        // update this program to aa more condition
        //using else if in the middle
        //check the value of myStr
        //if it is Java ==> correct word
        //if it is Cava --> Pumpkin

        String myStr = "selenium";
        if (myStr.equals("java")) {
            System.out.println("correct word");
        } else if (myStr.equals("Cava")) {
            System.out.println("say pumpkin");
        } else {
            System.out.println("not Java nor Pumpkin");
        }
    }
}
