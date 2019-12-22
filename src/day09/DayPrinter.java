package day09;

public class DayPrinter {
    public static void main(String[] args) {
       int dayCode = 7;
       String dayName = "";
       if( dayCode == 1){
           System.out.println("Day is Monday");
       } else if( dayCode == 2 ){
           System.out.println("Day is Tuesday");
       }else if( dayCode== 3 ){
           System.out.println("Day is Wednesday");
       }else if( dayCode== 4 ){
           System.out.println("Day is Thursday");
       }else if( dayCode == 5){
           System.out.println("Day is Friday");
       }else if(dayCode == 6 ){
           System.out.println("Day is Saturday");
       }else if(dayCode == 7){
           System.out.println("Day is Sunday");
        } else {
           System.out.println("Day Unknown");
       }
        System.out.println("Day is "+ dayName);






    }

}
