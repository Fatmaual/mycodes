package day15;

public class FirsttimeInTheloop {
public static void main(String[] args) {
    /**
     * I started with 100 yani num = 00 --> 100<105 (true)"hello world " -->101 //100den basladigi icin ve
     * system 105 kadar istedigi icin
     * 6 kez print out verdi
     *eger num = 0 ve 10 kere itivation yapmasini istiyorsak 11 gelene kadar itivation yapacak
     * ama 11 gelince onuda checked yapip duracak yani 11 yakez yapiyor!
     */


int num = 0;
    while(num<=5){
    System.out.println(++num);//sout icindeki ++ oldugu icin ilk seferden sonra tekrar etti.dolatisiyla 10 times oldu
}
 int cnt = 1;
    while (cnt <10) {
        System.out.println("counting"+cnt);
        ++cnt;
    }

    }
}
