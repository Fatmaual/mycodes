package day24;

public class ShoppingTask {
    public static void main(String[] args) {
        double[]price={ 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };
        String[]groceryItems={"apple","banana","grape","strawberry","blueberry","kiwi"};
        for(String eachFruit :groceryItems) { //sag taraf otomatik olarak item name sol taraf istedigin koy ama
                                                        // ne uzerine code yazacaksan onu koy
            int itemCount = groceryItems.length;
            int lastItemIndex = itemCount-1;
            String lastFruit=groceryItems[lastItemIndex];// bu formulu artik kafana yaz!!!!!!!
            //ayni zamanda one shot formul: groceryItems[groceryItems.length-1]!!!!!!!
            //eger oku cikarmak istiyorsam ensondan last item bakarim, kiwi!
System.out.print(eachFruit);
if(!eachFruit.equals(lastFruit)){
    System.out.print("===>");
}



        }


    }
}
