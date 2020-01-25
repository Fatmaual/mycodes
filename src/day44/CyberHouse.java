package day44;

public class CyberHouse {
    /**
     * CyberHouse
     * 	instance fields : houseNum, design
     * 	static field : neighbourhoodName
     * 	add 2 args constructor
     * 		to set the houseNum, design
     * 	instance method
     * 		void showAllInfo()
     * 			just print the houseNum, design neighbourhoodName in one line
     * 	static void method showNeighborhood
     * 		print the neighbourhoodName only
     * 		// try to access houseNum, design and see what happen
     */
    private String design;
    private int houseNum;

    //we can change default value of the fields
    //by assigning value directly in the template class
    private static String neighbourhoodName="Cybertek Ave";

//constructor can access anything
    public CyberHouse(int houseNum,String design){
        this.design=design;
        this.houseNum=houseNum;
    }
    //instance method can access anything
    public void showAllInfo(){
        System.out.println("House number is : "+this.houseNum+" desing is: "+this.design+" neighborhoodName is: "+
                neighbourhoodName);

    }
    //static method can only access static members of same class
    public static void showNeighborhoodName(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);

        //can't access anything non-static inside of static method
        //System.out.println("houseNum :"+this.houseNum);
    }
}
