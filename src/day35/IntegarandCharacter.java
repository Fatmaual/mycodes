package day35;

public class IntegarandCharacter {
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

    }
}
