package day35;

public class ParsingPractice {
    public static void main(String[] args) {
        //get the number of tomatoes
        //get the price out
        //get the total price
        String sentence= "I bought 3 tomato and the price was 3,14 each";
   //     double priceFind= Double.valueOf("3.14");
     //   System.out.println(priceFind);
       // System.out.println(GetThePrice(3.14));
    //}
    //public static double GetThePrice(double price1){
      //  return price1*3;
   //     String[]words=sentence.split(" ");
    // int count=Integer.parseInt(words[2]);
      //  System.out.println("tomatos are : "+count);
    //String  findOfTomato =words[words.length-2];
    //findOfTomato=findOfTomato.replace(",",".");
    //double priceOfTomato=Double.parseDouble(findOfTomato);
      //  System.out.println("total price is : "+count*priceOfTomato);
        String[] allWords =sentence.split(" ");
        int tomatoCount =Integer.parseInt(allWords[2]);
        System.out.println("I have "+tomatoCount+" tomatoes.");
        String duzelt=sentence.replace(",",".");
        double priceOfTomatoes =Double.parseDouble("3.14");
        System.out.println("total price of tomatoes: "+ tomatoCount*priceOfTomatoes);

    }
}
