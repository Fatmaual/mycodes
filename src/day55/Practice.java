package day55;

public class Practice {
    // we learned that super(..) always should be the first line of the constructor

// what about this(..) :  used to call current class's other constructor to reuse it's code
// it should be always in first statement
// just like super(...) we can only call it once
//  and can not be used together with super(....)
//  once this(...) is used , super() will not be added by compiler

    //any object created using this constructor
    //should call Practice(int x) constructor with value 100
    public Practice(){
        this(100);
        System.out.println("no arg constructor");
    }
    //any object you created using constructor must call no arg constructor first
    public Practice(int x){
        //super(); -->but super who?
       //this();
        System.out.println("1 arg constructor "+ x);
    }

    public Practice(String str){
        this(100);
        System.out.println("1 arg constructor with String "+ str);
    }

    public static void main(String[] args) {
    /**  Practice practice1= new Practice(100);//check this one I didn't put 100 value but still no compile
     * bc I have 2 constrbc I have 2 constructorsuctors
     * hangi constructor kullanmak istedigimizi belirliyor busekil!!eger tons of constructor varsa ne yapacagiz?
     * cevabi!! but ozaman infintiy tekrar edecekti so it gives compile error you can't use super(); and this();
     * in the same constructor
     */
    //22-->6-7   11->.....you can debug
      //  Practice practice1= new Practice();
       Practice practice1= new Practice("abc");
    }
}
