package daysOfOfficeHours;

public class TestUser {
    int a;
    public static void main(String[] args) {
      TestUser t= new TestUser();
        System.out.println(t.a);
        UserInfo Alisa= new UserInfo();
        //System.out.println(Alisa.userName);->error because private is not accessible
        //outside class
        UserInfo Alissa=new UserInfo();
       // Alisa.userName="Alisa";
        Alisa.setUserName("Alisa");
        System.out.println(Alisa.getUserName());
        Alisa.setSSN("1234567");
        System.out.println(Alisa.getSSN());

        UserInfo Kamuran = new UserInfo();
        System.out.println(Kamuran.getUserName());
        System.out.println(Kamuran.getSSN());
        System.out.println(Kamuran.getPassWord());

    }
}
