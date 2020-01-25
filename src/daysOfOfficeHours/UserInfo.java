package daysOfOfficeHours;

public class UserInfo {
  //Attributes ==>instance variables
    private String userName, passWord,ssn;

    public UserInfo (){
        setUserName("Kamuran");
        setSSN("123456");
        setPassWord("2345678");

    }
 public String getUserName(){
     return userName;
 }
 public void setUserName(String userName){
     this.userName=userName;
 }
  public String getSSN(){
     return ssn;
  }
  public void setSSN(String ssn){
     this.ssn=ssn;
  }
 public String getPassWord(){
        return passWord;
 }
 public void setPassWord(String passWord){
        this.passWord=passWord;

 }
}
