package daysOfOfficeHours.MuhtarException;

public class TestCustomClass {
    public static void main(String[] args) throws NoBreakTime {
 boolean studentAskForBreak=false;
 if(studentAskForBreak){
     throw new NoBreakTime();
 }else{
     System.out.println("continue");
 }

    }
    public static void method1() throws NoBreakTime{

    }
}
