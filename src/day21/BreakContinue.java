package day21;

public class BreakContinue {
    public static void main(String[] args) {
       // for (int x = 1; x <5 ; x++) {
    //        System.out.println(x);
      //      if(x==5){
    //            break; //bu cok kullanissiz bir kod useless cunku loop zaten 5 ekadar
        //    }
          //  continue;
        //100 ekadar say tum 5 ve katlarini skip yap

for (int x = 0; x < 50; x++) {
if(x%5==0){
   System.out.println("skipping :"+x); //bu formulde sout neden kullaniyoruz cunku console aciklama yapiyor
continue;
 }
System.out.println(x);  //asagidaki ornek without using continue
  }
        for (int i = 1; i <100 ; i++) {
            if(i%5!=0){
                System.out.println(i);
            }else{
                System.out.println("skipping "+i);
            }

        }
 }
}
