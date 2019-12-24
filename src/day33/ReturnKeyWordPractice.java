package day33;

public class ReturnKeyWordPractice {
    public static void main(String[] args) {
     //write a method accept a birth year and return the age:
     //the birth year should be within the range of 1900-2020
     //
        int birthYear=0;
        int currentYear=0;
        int ageOf=currentYear-birthYear;
        System.out.println(birthRange(199));
    }
    public static int birthRange(int birthYear){
        //i want to take out negative senerio and just return 0
        if(birthYear<=1900 ||birthYear>=2020 ){
            return 0;
        }
     return -2019;
    }

}
