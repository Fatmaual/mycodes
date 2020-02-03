package denemelerim;

public class Star {
    public static void main(String[] args) {
        String star = "fatma";
        int count = 0;
        for (int x = 0; x <= star.length() - 1; x++) {
            if (star.equals(star.substring(x, x + 1))) {
                star += star.substring(x, x + 1);
                count++;
            }
            System.out.println(star);


        }

    }
}
