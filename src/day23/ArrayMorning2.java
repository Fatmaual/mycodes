package day23;

public class ArrayMorning2 {
    public static void main(String[] args) {
        // FOR ILE ARRAY YAZIMI 1 TO 10 MANTIGI ILE!!!!
        int []scores = new int[4];
        scores[0]= 95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;

        int itemCount = scores.length;
        int lastIndex = itemCount-1;
        for (int x = 0; x <itemCount ; x++) {
            System.out.println(scores[x]);

        }

    }
}
