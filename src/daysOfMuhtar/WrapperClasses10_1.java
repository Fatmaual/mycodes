package daysOfMuhtar;

public class WrapperClasses10_1 {
    public static String RemoveDuplicates(String chars){
        String word="";
        for (int x = 0; x <chars.length() ; x++) {
            if(!word.contains(chars.substring(x,x+1))){
                word+=chars.substring(x,x+1);
            }
        }
        return word;
    }
    public static void main(String[] args) {
        String getResult=RemoveDuplicates("aaaaccccbbbb");
        System.out.println(getResult);



    }
}
