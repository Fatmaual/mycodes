package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        String citizenType;
        int age = 80;
        if( age > 65){
            citizenType = "Senior";
        }else {
            citizenType = "Not Senior" ;
        }
        System.out.println("The citizen age is "+ age+ " ,and he is a "+ citizenType);



    }


}
