package day12;

public class LoginTest {
    public static void main(String[] args) {
       // String str = "abc" ;
       // str.equals("abc") —> true       ! str.equals("abc") —>> false
       // Create class called LoginTest with main method
       //         Create 2 String variable called userName , password
        //and do following
        // your correct username password is  user123  and pass123
       // Check if your username and password correct
      //  If so print login successful
       // Check whether your username correct
       // if not print  , username is not correct
      //  Check your password is correct or not

    // use name fatma password ab12


        String userName = "fatma", password ="sxd34";

        if(userName.equals("fatma")  && password.equals("ab12") ){
            System.out.println("login is sucsessfull");
        }else if(! userName.equals("fatma") &&  password.equals("ab12")  ) {
            System.out.println("username is not correct");
        }else if(userName.equals("fatma") && !password.equals("ab12")  ){
            System.out.println("password is not correct");
        }else{
            System.out.println("username and password are both wrong");
        }



    }
}
