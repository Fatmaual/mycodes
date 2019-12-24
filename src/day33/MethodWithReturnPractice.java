package day33;

public class MethodWithReturnPractice {
    public static void main(String[] args) {
        //getDaysOfTheWeekFromNumber
        //this method will take number 1-7
        //and convert that actual in word
        //parameter will be int dayCode to represent day in number
        //retrun the day in word in English as String
     //if the number is valid
     //if the number is not 1-7 return FUNDAY!!
        System.out.println(getDaysOfTheWeekFromNumber(1));
        System.out.println(getDaysOfTheWeekFromNumber(8));
        int[] lotsofDays={5,3,11,4,43};
        for (int x = 0; x <lotsofDays.length ; x++) {
            String day= getDaysOfTheWeekFromNumber(lotsofDays[x]);
            System.out.println("day ="+day);
        }
        System.out.println("==============");
        for (int eachDay:lotsofDays) {
            System.out.println("each day = "+getDaysOfTheWeekFromNumber(eachDay));

        }
    }
    public static String getDaysOfTheWeekFromNumber(int numOfDay){
        String day =" ";
        switch(numOfDay){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5 :
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
              day="Sunday";
                break;
            default:
                day="Funday";
        }
        return day;
    }
}
