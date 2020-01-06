package day35;

public class TakeOutTheCharacters2 {
    public static void main(String[] args) {
        /**
         *  // "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF"
         * Try out above Character methods given to you and try to solve the problem of
         * extracting the number out of the string
         * ONEMLI: Symbolleri sadece print out almak istiyorsan !Character.isLetterOrDigit()kullaniyorsun
         */
        String sentence = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";
        char[] charsFind= sentence.toCharArray();
        int sum = 0;
        String allNumbers="";
        String upChars = "";
        String lowChars = "";
        String charsOut = "";
        for (int x = 0; x < sentence.length(); x++) {
            if (Character.isDigit(sentence.charAt(x))) {
                allNumbers+=sentence.charAt(x);
               int numbersSum=Integer.parseInt(sentence.charAt(x)+"");
                sum += numbersSum;
            } else if (Character.isUpperCase(sentence.charAt(x))) {
                upChars += sentence.charAt(x);
            } else if (Character.isLowerCase(sentence.charAt(x))) {
                lowChars += sentence.charAt(x);
            } else if (!Character.isLetterOrDigit(sentence.charAt(x))) {
                charsOut+=sentence.charAt(x);
            }else{

            }
        }
        System.out.println(allNumbers);
        System.out.println(sum);
        System.out.println(upChars);
        System.out.println(lowChars);
        System.out.println(charsOut);

    }
}
