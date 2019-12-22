package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double [] prices = {99.23, 11.99,100.23,99.99,56.34};
      //  for (int x = 0; x <prices.length ; x++) {
        //    double eachPrice = prices[x];
          //  System.out.println("eachPrice = " + eachPrice);
        //}
        for( double eachPrice   : prices    ){  //buyol yukaridaki ile tamamen ayni ve kolay
            System.out.println("eachPrice is : " + eachPrice);
            //eachPrice yerine istedigin kelimeyi kullanabilirsin sistem automatically formullu kullanacak
        }
    }
}
