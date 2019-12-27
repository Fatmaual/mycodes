package denemelerim;

public class REturnAndArrays {
    public static void main(String[] args) {
     int[]allcodes={1,2,3,56,43,23};
     for (int i = 0; i < allcodes.length; i++) {
            String day= WhichDayWhichNumber(allcodes[i]);
         System.out.println(day);
        }
        System.out.println("==========");
     for(int each:allcodes);
       System.out.println(WhichDayWhichNumber(5));
        System.out.println(CalculateAge(1978));
        }
     public static int CalculateAge(int birthYear){
        if(birthYear<1900 || birthYear>2020){
            return 0;
        }
        return 2019-birthYear;

     }
    public static String WhichDayWhichNumber(int dayCode) {
        String day = " ";
        switch (dayCode) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Satruday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Fun DAY!!!!";
        }
        return day;
    }


}
