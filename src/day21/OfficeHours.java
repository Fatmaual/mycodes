package day21;

public class OfficeHours {
    public static void main(String[] args) {
        // 3 loops in java
        //for loop while loop do-while loop
        //while loop; whiledan sonra condition gireceksins sonra statement gelecek(sout)
        //eger if condition eger dogru ise sout executed it oluyor
        //
        int a = 0;
        while (a <= 9) {  //int a =9 while (a>0) a--;
            System.out.println("hello Batch15 : " + a);//eger while dogru ise sonsuza kadar statemnt verir
            a++;                                  // false vermesi icin
            }
            //for loop : repeated action
            //for(initialization; condition; )-->contion must be created based on initialization
            //statements;
            //-->initialization is starting point condition is ending point
        System.out.println("==================");
            for (int i = 9; i >= 1; i--) {     //for(int =9; i<1; i
                System.out.println("hello Batch15! " + i);
            }
        System.out.println("==================");
            for(int x=10; x<=20; ){
                System.out.println("counting 10 to 20: "+x);
                x++;      // iterated here doesnt matter up or not you can put it anywhere

            }
        System.out.println("==================");
//while loop;
        int ab = 10;
            while(ab<=20){
                System.out.println("let's count ab 10 to 20: "+ ab);
                ++ab;
            }
//do while loop;
        do {
            System.out.println("hello batch 15!");
        }while(9>10);

        System.out.println("=========");
        int z =10;
        do{

            System.out.println(z);
            z++;
        }while(z <=20);
        }
    }
