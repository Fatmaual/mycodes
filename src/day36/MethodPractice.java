package day36;

public class MethodPractice {
    public static void main(String[] args) {
     Boolean result1=   checkIfStringHasNumber("ytz13ck");
        System.out.println("result 1 is "+result1);
        Boolean result2= checkIfStringHasNumber("ABCD");
        System.out.println("result 2 is "+result2);

    }
    public static Boolean checkIfStringHasNumber(String str){
        for (int i = 0; i <str.length() ; i++) {
            char eachChar= str.charAt(i);
            if(Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }
        }
        System.out.println("no number found !!!!! ");
        return Boolean.valueOf(false);
    }
}
