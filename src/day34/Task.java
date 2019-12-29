package day34;

public class Task {
    public static void main(String[] args) {
/**1, login1 :  static void method
 it has two String method paramters
 called username and password
 (it accept 2 String object as argument when being called)
 it check whther username and password  "user" and "abc123"
 if yes
 print login successful
 else
 print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)
 2, login2 :  static method boolean return type
 it has two String method paramters
 called username and password
 (it accept 2 String object as argument when being called)
 it check whther username and password  "user" and "abc123"
 if yes
 return true
 else
 return false
 * */
 //loginVoid("my username ","abc123");
 //loginVoid("user","abc123");
 boolean result=loginReturn("user","abc123");
        System.out.println("result is : "+result);
       System.out.println("second result is "+loginReturn("aaaa","bdc123"));
       // System.out.println(loginVoid("aaa","bbb"));
        if(loginReturn("user1","abc123")) {
            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The Order");
        } else{
                System.out.println("no shopping unless you signed in!!!");
            }
        }

    // a method that check username and password and print the result
    public static void loginVoid(String username,String password){
        if(username.equals("user") && password.equals("abc123")){
            System.out.println("login successful");
        }else{
            System.out.println("log in failed");
        }
    }
    //a method that check username and password and generate result
    //@param user @param password @return  true only if user name password are:user/abc123
    public static boolean loginReturn(String user, String password){
        return user.equals("user") && password.equals("abc123");
        }
    }

