package day33;
public class MethodPractice4 {
    public static void FullNameInformation(String name1,String name2){
String fullName=name1+name2;
int fullOfNameLength =fullName.length();
        System.out.println("Your name is "+name1+"last name is : "+name2);
        System.out.println("your full name is lenght: "+fullOfNameLength);

    }
    public static void LastCharacterOfName(String name){
   char lastChr=name.charAt(name.length()-1);
        System.out.println(lastChr);
        }
//        printLastCharacterOfName
  //              * create a method that has 1 String parameter called name
    //    and print last character of that name
    public static void reversePrintAnyName(String name){
        //            reversePrintAnyName
// create a method that has 1 String parameter called name
        //  and print that name in reversed order
        for (int x =name.length()-1; x>=0 ; x--) {
            System.out.print(name.charAt(x)+" ");
        }
        System.out.println();
    }
    public static void reverseMyOwnName(){
 //       reversePrintMyOwnName
  //              * create a method that has no parameter
    //    and print your name in reversed order
        String name="Olivia";
        for (int x = name.length()-1; x>=0 ; x--) {
            System.out.println(name.charAt(x));
        }
    }
    public static void SpellYourName(){
        // Create a method to spell your name :  Fatma -->F-a-t-m-a
        String myName="Fatma";
        for (int x = 0; x <myName.length() ; x++) {
            System.out.print(myName.charAt(x));
            if(x!=myName.length()-1){
                System.out.print("-");

            }
        }
        System.out.println();
    }
    public static void OddNumbers1to10(){
        // Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
        for (int i = 1; i <100 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    public static void countDownFrom20tillOne(){
        // Create a method called countDownFrom20tillOne
        for (int i = 20; i <=0 ; i--) {
            System.out.println();
        }
    }
    public static void MethodPractice4(){
        // Create a class called MethodPractice4=>>DIKKAT ET CREATE A CLASS DIYOR NOT METHOD!!
// no need for object when being called                : static
// it should be accessible anywhere in your project    : public
// it does not return any value                        : void
// does not need any external data when being called   : (nothing inside)
        //benim bu yaptigim method oldu class olmadi ayrica class generate yapmam lazim

    }
    public static void main(String[] args) {
        MethodPractice4();
        countDownFrom20tillOne();
        OddNumbers1to10();
        System.out.println();
        SpellYourName();
        reverseMyOwnName();
reversePrintAnyName("Yasemin");
LastCharacterOfName("Gunday");
FullNameInformation("Secil","Sari");

    }
}
