package day32;

public class Tasks12_22 {
  public static void AlphabetInRange(char beginning,char ending){
   char firstchr='a';
      char secondchr='d';
      for (char i = 'a'; i >='d' ; i++) {
          if(firstchr>secondchr){

          }else if(secondchr>firstchr){
              if(secondchr>firstchr){
                  for (int j = 'd'; j >='a' ; j++) {
                      System.out.print(i+" ");
                      System.out.print(j+" ");

                  }
              }
          }

      }

  }
    public static void printZtoA(){
        for (char i = 'z'; i >='a' ; i--) {
            System.out.print(i+" ");

        }
    }
    public static void printAtoZ(){
        for (char i = 'A'; i<='Z' ; i++) {
            System.out.print(i+" ");
        }
    }
    public static void CompareNameCharacterCount(String name1,String name2){
        String namefirst="Esad";
        String namesecond ="Mert";
        int name1chr=namefirst.length();
        int name2chr= namesecond.length();
        if(name1chr>name2chr){
            System.out.println("name 1 is longer");
        }else if(name2chr>name1chr){
            System.out.println("name 2 is longer");
        }else if (name1chr==name2chr){
            System.out.println("name 1 and name 2 same character count");
        }
    }
    public static void FullNameInformation(String firstName,String lastName){
        String first ="Nimet";
        String last ="Ulusal";
        int fullName =first.length()+last.length();
        System.out.println("My first name is "+first+","+"my last name is "+last);
        System.out.println("my full name length is "+fullName);
    }
    public static void latsCarachterOfName(String name){
        String chars="Cevdet";
            System.out.println(chars.substring(chars.length()-1));

        }

    public static void reversePrintAnyName(String any){
        String name="Cigdem";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));

        }
    }
    public static void reversePrintMyOwnName(String name){
        String myname="Fatma Olivia";
        for (int i = myname.length()-1; i >=0 ; i--) {
            System.out.print(myname.charAt(i));

        }
    }
    public static void sayHelloWorld7Times(String b){
        System.out.println("Hello World");

        }

    public static void main(String[] args) {
      AlphabetInRange('d','a');
        printZtoA();
        System.out.println();
        printAtoZ();
        System.out.println();
        CompareNameCharacterCount("Esad","Mert");
        FullNameInformation("Nimet","Ulusal");
        latsCarachterOfName("Cevdet");
        reversePrintAnyName("Cigdem");
        System.out.println();
        reversePrintMyOwnName("Fatma Olivia");
        System.out.println();
        sayHelloWorld7Times("Hello world");

    }
}
