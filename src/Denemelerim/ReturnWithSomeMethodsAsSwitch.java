package Denemelerim;

public class ReturnWithSomeMethodsAsSwitch {
    public static void main(String[] args) {
        //first way;
    //    System.out.println(buildName("FATMA","ULUSAL"));
  //second way;
        String fullName="Olivia Glen";
 // String[] fullnamesplit= fullName.split(" ");
//  String email =buildName(fullnamesplit[0],fullnamesplit[1]);
 //       System.out.println(email);
        //3. way;
        String part1=fullName.split(" ")[0];
        String part2 =fullName.split(" ")[1];
        String email =buildName(part1,part2);
        System.out.println(email);
        System.out.println(WhichDayWhichNumber(8));
    }
    public static String WhichDayWhichNumber(int dayCode){
        String day=" ";
        switch(dayCode){
            case 1 :
                day="Monday";
                break;
            case 2:
               day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                 day="Satruday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
               day="Fun DAY!!!!";
        }
        return day;
    }
    public static String buildName(String firstName,String lastName){
     String email=firstName.charAt(0)+lastName+"@NightWatch.com";
     return email;
    }
}
