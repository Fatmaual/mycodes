package day10;

public class VariableValueAssignment {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
     char operator ='+';
     switch (operator){
         case '+' :
             System.out.println((num1+num2));
             break;
         case '-' :
             System.out.println((num2-num1));
             break;
         case '*':
             System.out.println((num1*num2));
             break;
         case '/':
             System.out.println((num2/num1));
             break;
         default:
             System.out.println("you have selected unknown number");

              break;

     }

    }
}
