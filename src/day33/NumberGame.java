package day33;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println(getSumFrom1ToX(6));
        String firstname="jon";
        String lastname="snow";
        System.out.println(build_Got_Email("fatma","ulusal"));
        System.out.println(build_Got_Email("Yasemin","dogan"));
        String fullName ="Esra Fidan";
    //    String part1= fullName.split(" ")[0];
    //    String part2 =fullName.split(" ")[1];
   //     String herEmail=build_Got_Email(part1,part2);
        String[]fullNameSplit =fullName.split(" ");
        String herEmail=build_Got_Email(fullNameSplit[0],fullNameSplit[1]);
        System.out.println("her email is "+herEmail);

    }
    public static int getSumFrom1ToX(int x) {
        //this is calculate of sum
        //the number it is gonna start 1 to the number user passed
        int sum = 0;
        for (int i = 1; i <=x ; i++) {
            sum+=i;
        }
        return sum;
    }
  public static String build_Got_Email(String firstname, String lastname) {
      String email = firstname.charAt(0) + lastname + "@Nightwatch.com";
return email;
  }
}
