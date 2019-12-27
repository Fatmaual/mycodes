package denemelerim;

public class StringDashAndReturnAndNumbersWithReturn {
    public static void main(String[] args) {
        System.out.println( spellYourName("Serra"));
        System.out.println(spellYourName("Zeynep") );
        System.out.println(getSumFrom1ToX(6));
        System.out.println(buildEmail("Esra","Fidan"));
    }
  public static String buildEmail(String firstName, String lastName){
   String email=firstName.charAt(0)+lastName+"@NightWatch.com";
   return email;
  }
    public static int getSumFrom1ToX(int x) {
        int sum = 0;
        for (int i = 1; i <=x ; i++) {
            sum=sum+i;
        }
        return sum;
    }
    public static String spellYourName(String name) {
String resultName =" ";
        for (int i = 0; i <name.length() ; i++) {
            resultName=resultName+name.charAt(i);
            if(i!= name.length()-1){
                resultName=resultName+"-";

        }
        }
        return resultName;
    }
}
