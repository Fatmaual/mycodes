package day22;


public class WakeUp {
    public static void main(String[] args) {
        String myName = "Fatma Olivia";
        int nameIndex = myName.length();
        for (int i = 0; i <nameIndex ; i++) {
            if(myName.substring(i,i+1).equalsIgnoreCase("o")){
                System.out.print("bingo!!");
                break;
            }
            System.out.println(myName.substring(i,i+1)+" ");
        }


}
        }
    

