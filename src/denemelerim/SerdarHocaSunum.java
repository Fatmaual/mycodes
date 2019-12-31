package denemelerim;
public class SerdarHocaSunum {
    public static void main(String[] args) {
        /**
* javada hersey objectlerle represent ediliyor classi bir kalip gibi dusunursek objectde bir
 * nesne.class ile object arasinda attributelerlri var. bunun disinda bi d her classin
* behaviorlari
* var methodlari var.mesela ayni classdan olusturulmus iki object ama valuelar farkli ama
* herikisi de exlarete edebiliyor declerate edbiliyor object oriented diyoruz buna
* instantiation?
 * class veriyi iceren birsey ama sadece veriden olusmuyor binanin cizimini dusun o class gibi
 * sonra onu build yapinca o object oluyor. static olup olmamasi static yazdigi muddetce herha
 * bir object olmaya gerek yok. her primitive data type onlara karsilik gelen datalari object
* seklinde yerine getirebiliyor.
         * */
        char myChar = '7';
        //how can I convert char to string char stringe donusturmek icin baska bir stringle
        // concatenate yapmam lazim
        String nums = "" + myChar;
        System.out.println("num = " + nums);
        System.out.println(nums + 1);
        int myNum = Integer.parseInt(nums);
        System.out.println("myNum = " + myNum);
        System.out.println(myNum + 1);
        String.valueOf(myChar);

    }
}