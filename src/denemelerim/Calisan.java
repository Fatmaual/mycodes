package denemelerim;



  class sekreter{

          }
class pazarlamaci extends Calisan{

   // void maas(){
  //        this.maas=maas*3;
    //  }

}
 class muhendis extends Calisan{
     void maas(double maas){
         this.maas= maas*2;
     }

        }

public class Calisan {

      double maas;
      double maas(){
          this.maas=maas;
          return maas;
      }

    public static void main(String[] args) {
        muhendis ahmed=new muhendis();
        ahmed.maas=100;
        System.out.println(ahmed.maas);
    }
}
