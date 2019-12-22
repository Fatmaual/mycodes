package day28;

import java.util.Scanner;

public class SerhatBeySunum {
    public static void main(String[] args) {
        //soru 93 herseyden once example odaklan eger java kelimesi index 1 veya 2 de yaziyorsa true
        //coding herzaman deneme yanilma ile olan birsey onca seyi kafada kurgulamak cok zor enbasitine odaklan
        //soruda. metodlari yazip dusunebilirsin nasil yazabilirim javayi kelimenin basinda.her metod farkli
        // birsey ifade ediyor.requirentlara bak neyi anlamaya caliiyorum result true false olmasi lazim
        // return etmek demek result demek.char at sadece bir noktaya atis yapiyor. word.charat-->j verecek
      //substring bize ne return edecek ?herzaman baska bir string return eder bir stringin parcasidir.
        // butun stringi alir bir parcasini verir bize.nerede basliyacak ve reye kadar verecek o da index ile
       // String word ="I love java";
       // String firstwordword=word.substring(2,5);    //-->lov contains satrtswith equalsignorecase
      // System.out.println(firstwordword);kodu guclendirmek icin if || koyup guzlendirecegiz ilki oldu ikici
        //karakter icin substring ile olur kes diye kalan kismini bi metodu uygula sunstring yeni bir string
        //oldu love java simdi substring 1 den sonra . koyup istedigim methodu uygulayabilirim
        //index of ne return eder search yaptigimiz karakter yada string indexini verir bize
        //enson ornekde 0 da ve 1 de java varsa zaten java 4 karakterli
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.startsWith("java") || word.substring(1).startsWith("java")){
            exists=true;// yada sout(exists)
            System.out.println(exists);
          if(word.indexOf("java")==0 ||word.indexOf("java")==1){

          }
          if(word.length()>=4){
              word.substring(0,5).contains("java");
          }

            }

            }



}
