package day44;

public class CyberHouseActions {
    public static void main(String[] args) {

        CyberHouse.showNeighborhoodName();
        CyberHouse number1= new CyberHouse(1,"TownHouse");
        number1.showAllInfo();
        CyberHouse number2=new CyberHouse(2,"Condo");
        number2.showAllInfo();
        CyberHouse number3=new CyberHouse(3,"Private");
        number3.showAllInfo();
       // System.out.println(CyberHouse.neighbourhoodName);

//how do I get max value of Short
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
    }
}
