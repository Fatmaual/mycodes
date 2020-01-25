package day35;

public class IntegerAndCharacter {
    public static void main(String[] args) {
        /**
         * get the number out and store them into Integer variable num
         * for additionally get the sum of the num inside of a string
         * and optionally mekae it a method*/
        char myChar = '7';
        //get int 7
        int myNum=Integer.parseInt(myChar+"");
        System.out.println(myNum);



        String str = "A34B123C4X";
        int sum=0;
char[] allChars = str.toCharArray();
for(char each: allChars){
   if(Character.isDigit(each)){
       System.out.println("each = " + each);
       int eachNum=Integer.parseInt(each+"");
       sum=sum+eachNum;
   }
}
        System.out.println("sum is : "+sum);
        // "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF"

        //     Try out above Character methods given to you and try to solve the problem of
        //     extracting the number out of the string
        Character charObject = Character.valueOf('a');
        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a'));
        System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
        System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
        System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
        System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
        System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
        System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));
        System.out.println("IS DIGIT METHOD PRACTICE :");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));
        /**
         * get the number out and store them into Integer variable num
         * for additionally get the sum of the num inside of a string
         * and optionally mekae it a method*/
        String str1="A34B123C4X";
        String numsInStr="";
        for (int x = 0; x <str.length() ; x++) {
            if(Character.isDigit(str.charAt(x))){
                System.out.println("str.charAt("+x+") = "+str1.charAt(x));
                numsInStr += str1.charAt(x);
            }
        }
        System.out.println("numInStr list is "+numsInStr);
        Integer num=Integer.valueOf(numsInStr);
        System.out.println("numbers are in Integer method "+num);
    }

}




