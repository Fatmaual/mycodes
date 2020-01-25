package daysOfMuhtar;

public class Methods12_27 {
    public static void main(String[] args) {
        evenOdd(100);
    }
    public static void evenOdd(int number){
        //   1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the
        //   String
        //   RemoveDuplicate("aaabbbccc") ==> "abc"
        //   2. write a return method called Frequency that accepts String and  char, the method will return the
        //   total number of ocuurence of the given char in the given string
        //  Frequency("AAABBB", 'A') ==> 3
        //   3. Combined the methods 1 & 2 to write a method that prints the the frequency of each characters
        //   from the given String
        //   FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
        //  String str = "aaabbbbbccccddddddddeeefffa";
        //
        String resultOfFirst= RemoveDup("aaabbbccc");
        System.out.println(resultOfFirst);
        int resultOfSecong= Frequency("AAABBB", 'A');
        System.out.println(resultOfSecong);
        System.out.println(FrequencyOfChars("CCAAABBBCCCC"));
    }
    //  Task 1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the
    //   String
    //   RemoveDuplicate("aaabbbccc") ==> "abc"
    public static String RemoveDup(String word){
        String needed="";
        for(int x=0;x<word.length();x++){
            if(! needed.contains(""+word.charAt(x))){
                needed+=""+ word.charAt(x);

            }
        }
        return needed;
    }
    //   2. write a return method called Frequency that accepts String and  char, the method will return the
    //   total number of ocuurence of the given char in the given string
    //  Frequency("AAABBB", 'A') ==> 3
    public static int Frequency(String word, char chr){
        char[] chars=word.toCharArray();
        int count=0;
        for(char each: chars){
            if(each==chr){
                count++;
            }
        }
        return count;
    }
    //   3. Combined the methods 1 & 2 to write a method that prints the the frequency of each characters
    //   from the given String
    //   FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
    public static String FrequencyOfChars(String word){
        String needed2= RemoveDup(word);
        String resultOfThird="";
        for (int x = 0; x <needed2.length() ; x++) {
            int neededCount= Frequency(word,needed2.charAt(x));
            resultOfThird+= ""+ needed2.charAt(x)+neededCount;

        }
        return resultOfThird;
    }
}
