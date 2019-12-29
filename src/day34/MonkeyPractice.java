package day34;

public class MonkeyPractice {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true,false));
        System.out.println(monkeyTrouble(false,true));
        System.out.println(monkeyTrouble(true,false));

        System.out.println(monkeyTrouble2(true,false));
        System.out.println(monkeyTrouble2(true,true));
        System.out.println(monkeyTrouble2(false,false));

    }

    /**
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile==bSmile;

    //    if ((aSmile && bSmile) || (!aSmile && bSmile)){
       //     return true;
   //     }else{
     //       return false;
        //}
  //return (aSmile && bSmile) || (!aSmile && bSmile);
    }
    public static String monkeyTrouble2(boolean aSmile, boolean bSmile){
        if((aSmile && bSmile) ||(!aSmile&&bSmile)){
            return "Yes";
        }else{
            return "No";
        }
    }
}