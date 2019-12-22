package day14;

public class EmailChecker {
    public static void main(String[] args) {
        String email = "fatmaulusal1@yahoo.com";
        // if it does not contain character @ say invalid
        boolean notContainCharacter =  ! email.contains("@");

        //if it contains space say invalid
        boolean containsSpace = email.contains(" ");

        // if it endsWith @gmail.com --> print gmail
        boolean endsWith  = email.endsWith("@gmail.com");

        //if it endsWith @yahoo.com -->print yahoo email
        boolean endsWith2 =email.endsWith("@yahoo.com");

        //if it ends with @mail.ru -->print russian email
        boolean endsWith3 = email.endsWith("@mail.ru");

        if(!email.contains("@") || email.contains(" ")    ){ // or yerine(||) and && koysaydim manasi degisirdi!!!!
            System.out.println("invalid email");
        }else if( email.endsWith("@gmail.com")  ){
            System.out.println("Google Mail");
        }else if(email.endsWith("@yahoo.com")){
            System.out.println("Yahoo.com");
        }else if (email.endsWith("@mail.ru")){
            System.out.println("Russian Mail");
        }




    }
}
