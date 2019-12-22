package day31;

public class Calculator_V2 {
    public static void main(String[] args) {
  //     char operator ='+';
  //      int num1 = 15;
  //      int num2 = 3;
 calculate(10,30,'-');
 calculate(20,10,'+');
 calculate(40,3,'*');
 calculate(40,4,'/');
 calculate(40,4,'A');



    }
public static void calculate(int num1, int num2, char operator){
    switch(operator){
        case '+':
            System.out.println("Addition result is "+(num1+num2));
            break;
        case '-':
            System.out.println("Subtraction result is "+(num1-num2));
            break;
        case'*':
            System.out.println("Multiplication result is "+(num1*num2));
            break;
        case'/':
            System.out.println("DivisiOn result is "+( num1+num2));
            break;
        default:
                System.out.println("Invalid Operator");

    }

}
}
