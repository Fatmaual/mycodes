package denemelerim;

//import java.util.Scanner;
public class ReturnB11 {
    public static void main(String[] args) {
        //       boolean exists = false;
        //     Scanner scan = new Scanner(System.in);
        //     String word = scan.next();
        //Given a string word, print true if "java" appears starting at index 0 or 1 in the
        // string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
        // The string may be any length, including 0word = .
        //Example:
        //input: javapython
        //output: true
        //Example:
        //input: cjavac++
        //output: true
        //Example:
        //input: c#javaruby
        //output: false
        //GET THE SECOND CRAHARECTER
  //      String name = "Yasemin";
   //     char secondChar = name.charAt(1);
   //     System.out.println(secondChar);
  //      System.out.println(giveMe5());
  //      int giveMethod = giveMe5();
   ///     System.out.println(giveMethod);
   //     long firstYearSalary = mySalary();
        //   long SecondYearSalary=firstYearSalary+firstYearSalary;
     //   long secondYearSalary = (long) (firstYearSalary * 0.5);
     //   System.out.println(firstYearSalary + secondYearSalary);
        //  System.out.println(secondYearSalary);
     //   boolean ageResult = (findTheAge(15));
     //   System.out.println(ageResult);
      //  System.out.println(findTheAge(26));
        int huntingOfNumbers =MyNumbers(34,78);
        System.out.println(huntingOfNumbers);
        System.out.println(MyNumbers(45,6));

    }


    public static int giveMe5() {

        return 5;
    }

    public static long mySalary() {
        return 1800000l;
    }

    public static boolean findTheAge(int age) {
//if(age>18){
        //  return true;
//}else{
        //  return false;
//}
        //  }
        return age > 18 && age < 28;
    }
  public static int MyNumbers(int num1,int num2){
        int FindBigger=(num1>num2) ? num1: num2;
        return FindBigger;
  }
    }
