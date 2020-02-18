package day54;

import java.util.Arrays;
import java.util.List;

public class Utility {
    public static void main(String[] args) {
    Wearable w1= new Clothes();
    wearMyWearable(w1);

    Wearable w2 = new MakeUps();
    wearMyWearable(w2);

    Wearable w3 = new Watch();
    wearMyWearable(w3);

    Wearable w4 = new Perfume();
    wearMyWearable(w4);

  wearMyWearable(new Watch());
  //wearMyWearable(new String());-->string is not a wearable

        System.out.println("------wearable objects with getMyWearable method----");
   Wearable wearable=getMyWearable();
        System.out.println("wearable is : "+wearable);
        System.out.println(wearable.getClass().getSimpleName());
        System.out.println("********************");

        Wearable ww1=new Clothes();
        Wearable ww2 =new MakeUps();
        Wearable ww3=new Watch();
        Wearable ww4 =new Perfume();

        List<Wearable> myList= Arrays.asList(ww1,ww2,ww3,ww4);
        for(Wearable eachOf : myList){
            eachOf.wear();
        }

    }
    public static void wearMyWearable(Wearable any){

   any.wear();

    }
    public static  Wearable getMyWearable(){
        Wearable w= new Clothes();
        return w;
      //  return new Clothes();
        //return new Watch();
        //return new Perfume();
       // return new Clothes();
    }
}
