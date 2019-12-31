package daysOfMuhtar;

public class Ofis12_27Methods {
    public static void main(String[] args) {
        /**
         * Arrays.sort is
         * method declaration :
         * public static void main (String [] args)
         * access-modifier specifiers return-type name (parameters){
         *     statements....};
         *during this course :
         * access modifiers:public,protected,default,private
         * specifiers:static , final ,abstract
         *for now we use only public and static for the accessmodifier and specifiers:static,final,abstract
         * return-type(mandatory):void, any other data-types(all primitives or non primitives)
         * parameters: any data-types (all primitives or non primitives)
         * if return type will be void or not void :
         * so if return type would be void means;you can not return any value
         * can I give anything pass that does not match with the parameters NO byte->byte gibi
         * */
        String a="ABCDEFG";
        for (int i = a.length()-1; i >=0 ; i--) {
            System.out.print(a.substring(i,i+1));
        }
        String a1="Esra Fidan";
        method2();
        float num1=10.5f;  //long num1=10; --> double=num2=num1
        double num2=num1;
        double number1 = method3();
        System.out.println(number1);
        System.out.println(EligibleBuy(35));

    }
    public static void method1(){
        //voidi acikliyor !!
        //if I wanna print something
        System.out.println("hello batch15!!");
        //if I want to return it and write return 10; it will be give an error
    }
    public static void method2(){
        if(false){
            return;
        }
        System.out.println("test completed");
    }
    public static double method3(){
        //if give me error bc the method must return a value at the end so how can i get rid of
        //this complier return type must not be void the method must return a return value
        //return type must be match with return type  int->int string->string
        //what kind of value we can assign for double? double float int byte all of them for double
        //if the retturn get execute the statement it is going to be exist immediately
        return 10.5f;
    }
    public static boolean EligibleBuy(int age){
        if(age>=35){
            return true;
        }else{
            return false;
        }
    }

}


