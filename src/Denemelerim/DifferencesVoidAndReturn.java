package Denemelerim;

public class DifferencesVoidAndReturn {
    public static void main(String[] args) {
    addWithVoid(35,10);
    int addwith=addWithReturn(5,2);
        System.out.println(addwith);
        System.out.println(addWithReturn(10,20));
        System.out.println(addWithReturn(5,10)+5);
    }
    public static int addWithReturn(int num1, int num2){
        int resultWithReturn=num1+num2;
        return resultWithReturn;
    }
    public static void addWithVoid(int num1, int num2){
        int resultWithVoid = num1+num2;
        System.out.println(resultWithVoid);
    }
}
