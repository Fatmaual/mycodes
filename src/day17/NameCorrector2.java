package day17;

public class NameCorrector2 {
    public static void main(String[] args) {

                       //  0123456789
        String fullName = "arYa sTarK"; // index of bak ve alistirmalarini yap kendin isim soyisim vererek
        System.out.println("enter your full name in 2 words");
        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace); //arya //fullname.substring(0,4)
        // index 4 un acilimi ben ilk adin nekadar uzunlukda oldugunu bilmiyorum ozaman ne yapacagim indexOfspace yaziyorum!!!
        String lastName = fullName.substring(indexOfSpace+1);   // stark
        //rule for substring starts with uppercase I have to put 0,1!!!!!!!
        // for lowercase rule start with 1 and then rest of them ....put just 1!!
        //
        String firstNameCorrected
                =firstName.toUpperCase().substring(0,1)+   // ARYA-->>A
                firstName.toLowerCase().substring(1);      //arya ---> rya
        System.out.println(firstNameCorrected);


        String lastNameCorrected = lastName.toUpperCase().substring(0,1) +
                                    lastName.toLowerCase().substring(1);
        System.out.println("lastNameCorrected = " + lastNameCorrected);

        // fullname nasil fix yapariz?
        fullName= firstNameCorrected+" "+lastNameCorrected ;
        System.out.println(fullName);

    }
}
