package denemelerim;

public class DenSwap {
    public static void main(String[] args) {
        int num=5;
        System.out.println("multiple table");
        for (int x = 0; x <10 ; x++) {
 //5x1=5
            System.out.println(num+ " x "+(x+1)+ " : "+num*(x+1));

        }
        int num1=5;
        int num2=80;
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("it must be 80 "+num1);
        System.out.println("it must be 5 "+num2);
try {
    String a = "This is example of Exception";
    char c = a.charAt(59);
    System.out.println(c);
}catch(StringIndexOutOfBoundsException e){
    System.out.println("StringIndexOutOfBoundsException");
}
    }
    }

