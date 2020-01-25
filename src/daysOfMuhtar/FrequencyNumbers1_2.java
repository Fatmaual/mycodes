package daysOfMuhtar;

public class FrequencyNumbers1_2 {
    public static String frequencyOfChar(String str){
        //task aaacccggg --> a3c4g4
        String result="";
        String characters= removeDup(str);
        for (int x = 0; x <characters.length() ; x++) {
            int countThem=frequency(str,characters.charAt(x));
           result+=""+characters.charAt(x)+countThem;



        }
 return result;

    }
    public static int frequency(String str, char ch){
        //task "aaaccccbbbb" 'b'--> b3
        int count =0;
        char[] chs=str.toCharArray();
      for(char each:chs){
          if(each==ch){
              count+=1;
            }

        }
        return count;

    }
  public static String removeDup(String strs){
      String word="";
      for (int x = 0; x <strs.length() ; x++) {
        if(!word.contains(strs.substring(x,x+1))){
            word+=strs.substring(x,x+1);
        }
      }
      return word;
  }
    public static void main(String[] args) {
     String printDups= removeDup("AAAAABBBBBCCCCCC");
        System.out.println(printDups);
        int result= frequency("aaabbbccc",'c');
        System.out.println(result);
        System.out.println(frequencyOfChar("xxxcccffrrr"));
    }
}
