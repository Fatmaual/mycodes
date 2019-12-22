package day19;

public class SomeOfNumWithRange {
    public static void main(String[] args) {
        //get some nums from 1-10
        //it's interesting 1+2+3+4+5+6+7+8+9 how much is it?
        //when we loop from 1-10
        // before I add any number my num is starting with 0 check it
        int num = 0;
        for(int i = 1; i<=100; i++){
            num = num+i;
            System.out.println(num+",");
        }
    }
}
