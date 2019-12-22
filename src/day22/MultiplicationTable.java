package day22;


public class MultiplicationTable {
    public static void main(String[] args) {
       // System.out.println("1 * 1 = "+1 * 1); fori da formul yazarken soutda neyin degisip neyin degismedigine bak!!
      //  System.out.println("1 * 1 = "+1 * 1);
      //  System.out.println("1 * 1 = "+1 * 1);
      //  for (int base = 1; base <=12 ; base++) {
        //    System.out.println("1 x "+base + " = "+1*base);

            for (int timesTable = 1; timesTable <= 10; timesTable++) {
                System.out.println("multiplication table of :"+timesTable);
                for (int base = 1; base <=12 ; base++) {
                    System.out.println(timesTable +" x " + base+ " = "+ timesTable*base);

                }
                for (int evHesabi = 1; evHesabi <= 10; evHesabi++) {
                    System.out.println(" evimizin butcesi :"+evHesabi);
                    for (int i = 1; i <=11 ; i++) {
                        System.out.println(evHesabi+ "x"+evHesabi+" = "+evHesabi);
                        
                    }
                    
                    
                }
        }
    }
}
