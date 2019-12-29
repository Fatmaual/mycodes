package denemelerim;

import org.w3c.dom.ls.LSOutput;

public class Methods_PracticeReturn {
    public static void main(String[] args) {
/**5. write a method that can calculate grade
 if score is 100 ~ 90 ==> A
 if score is 89 ~ 80 ==> B
 if score is 79 ~ 70 ==> C
 if score is 69 ~ 60 ==> D
 if score is 0 ~ 59 ==> F
 otherwise ==> Invalid Score
 * */
        System.out.println(meterToCm(5));
        System.out.println(feettoinches(8));
       double inch= (int)feettoinches(8);
        System.out.println(inch);
        int inches=(int)feettoinches(5);
        System.out.println(inches);
        System.out.println(faToCelcius(68));
        char usaeableChar=giveMelastCharacter("olivia");
        System.out.println(usaeableChar);
        System.out.println(giveMelastCharacter("Fatma Ulusal"));
      int findAge = getTheAge(40);
        System.out.println(findAge);
        System.out.println(usaeableChar+ " "+findAge);
      // String classTime = printsomething();
       // System.out.println(printsomething("class will be start soon"));

    }
    // create a method meter to cm it tkaes one int parameter and return cm
    //return fett to inch
    //return fa to celcius
    public static int meterToCm(int meter){
        //100 cm =1m
      return meter*100;
    }
    public static double feettoinches(int feet){
        // 1 foot 12 inches
        double inch =(int)feet*12;
        return inch;
       // return feet*12;
    }
    public static double faToCelcius(double fahrenheit){
       return (fahrenheit-32)*5/9;
    }
    public static char giveMelastCharacter(String word){
        char lastchar =word.charAt(word.length()-1);
        //System.out.println(lastchar);
        return lastchar ;
    }
    public static int getTheAge(int age){
        return age;
    }
    public static void printsomething(){
        System.out.println("class will be start soon");
    }
}