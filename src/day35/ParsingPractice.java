package day35;

public class ParsingPractice {
    public static void main(String[] args) {
        //get the number of tomatoes
        //get the price out
        //get the total price
        String sentence= "I bought 3 tomato and the price was 3,14 each";
        String[] allWords =sentence.split(" ");
      int count=Integer.parseInt(allWords[2]);
      String pricewithString=allWords[allWords.length-2];
        pricewithString=pricewithString.replace(",",".");
        double price=Double.parseDouble(pricewithString);
        System.out.println("total price is  " + (count*price));

        // Use this number IPR2012-00001 and store the year into a int variable
// This case number always start with 3 character either IPR , PGR , CBM , DER
// followed by year , followed by dash and 5 digit number
        String caseNumber = "IPR2012-00001" ;
        // int year ; //-- get 2012 out of it
        int year=Integer.parseInt(caseNumber.substring(3,7));
        System.out.println("year is : "+year);
        int  number =Integer.parseInt(caseNumber.substring(8));
        System.out.println(number);
        float f6=Float.parseFloat("3.14f");
        System.out.println(f6);

    }
}
