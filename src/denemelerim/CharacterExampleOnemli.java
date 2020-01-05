package denemelerim;

public class CharacterExampleOnemli {
    public static void main(String[] args) {
   String str="A123b3W423cc4523B $$ aa &&J JsG8 2347SDFSJF";
   int sum=0;
   String upper="";
   String lower="";
   String numbers="";
   char[] strChars= str.toCharArray();
   for(char eachChar: strChars ){
       System.out.print(eachChar);
       if(Character.isDigit(eachChar)){
           numbers+=eachChar;
           int nums=Integer.parseInt(eachChar+"");
           sum+=nums;
       }else if(Character.isUpperCase(eachChar)){
           upper+=eachChar;
       }else if(Character.isLowerCase(eachChar)){
           lower+=eachChar;
       }
   }
        System.out.println("Numbers "+numbers);
        System.out.println("sum is "+sum);
        System.out.println("uppercase letters  "+upper+" ");
        System.out.println("lowercase letters "+lower);
        System.out.println("lowercase to uppercase "+ lower.toUpperCase());

        System.out.println("==========The Other Solution");
        String allNumber="";
        String allUp="";
        String allLow="";
        int sums=0;
        String chars="A123b3W423cc4523B $$ aa &&J JsG8 2347SDFSJF";
        for (int x = 0; x <chars.length() ; x++) {
            if(Character.isDigit(chars.charAt(x))){
                allNumber+=chars.charAt(x);
                int getnumberssum=Integer.parseInt(chars.charAt(x)+"");
                sums+=getnumberssum;
            }else if(Character.isLowerCase(chars.charAt(x))){
                allLow+=chars.charAt(x);
            }else if(Character.isUpperCase(chars.charAt(x))){
                allUp+=chars.charAt(x);
            }

        }

    }

}