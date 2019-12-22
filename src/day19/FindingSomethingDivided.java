package day19;

public class FindingSomethingDivided {
    public static void main(String[] args) {
        //1 den 100 e kadar 15 e bolunen rakamlari goster
        //1-100 kadar kac rakam bolunebilir 15 e 
       int  counter = 0;
        for (int i = 1; i <=100; i++) {
          if(i %15==0) {
              System.out.print(i+",");
              //counter = counter +1;
              //counter+=1;
              ++counter;
          }
          
        }
        System.out.println();
        System.out.println("counter = " + counter);
        String name ="Esra Fidan";


            
        }
}
