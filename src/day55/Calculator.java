package day55;

public class Calculator {
   private int number;
public Calculator addNum(int x){
    this.number=this.number+x; //this.number+=x;
  //  Calculator c= new Calculator();
    //return c;
    //it will return the same object you used to call this method
    //it will allow method chancing using same object
    return this;
}
public Calculator minusNum(int y){
    this.number-=y;
    return this;
}
public void finalResult(){
    System.out.println("final result of numbers: "+number);
}
    public static void main(String[] args) {
        Calculator cal1= new Calculator();
      //  cal1.addNum(100);
        //        c1.result = - 10000 ;

//        System.out.println(c1.result);
//        c1 = c1.addNum(100);
//        c1 = c1.addNum(200);
//        c1 = c1.addNum(100);

        cal1.addNum(100)
                .addNum(200).minusNum(50).finalResult();
       // cal1.number=-10000;// private yaptim fieldi oyuzden etki etmedi sonuca public ile dene
        //cal1.addNum(189);

        System.out.println(cal1.number);
    }
}
