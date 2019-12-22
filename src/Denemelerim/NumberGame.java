package Denemelerim;

public class NumberGame {
  public static void reportName(String first,String last){
      System.out.println(first+" has length is "+first.length());
      System.out.println(last+" has length is "+last.length());
      System.out.println("your initial is "+first.charAt(0)+" "+last.charAt(0));

      }
      public static void reverseString(String reverse){
          for (int i = reverse.length()-1; i >=0 ; i--) {
              System.out.print(reverse.charAt(i));
          }
          System.out.println();
      }

    public static void main(String[] args) {
      reportName("Fatma","Ulusal");
      reverseString("Olivia");
      reverseString("Fatma");
      reverseString("Kerem");
    }
    }




