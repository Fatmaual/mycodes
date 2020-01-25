package day40;

public class Offer {
    String employyeID;
    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * instance instance method we can directly access instance variable
     */

    public void displayInformation(){
        System.out.println("EmployeeID: "+employyeID+" | "+" Location: "+location+ " | "+"Company: "+company+" | "+
                "Salary: "+salary+"$ | "+ "is ful time: "+isFullTime);
    }
    //write a method called turnToFullTime
    public void turnToFullTime(){

        //how do I know somebody full time or not?
        if (isFullTime == false) {
            isFullTime=true;
        }else{
            System.out.println("Hey you are already full time!!");
        }
    }
    //write a method to change the location of the offer
    //to the location and user
    public void newLocation(String changeLoc){
    location=changeLoc;

    }
    //write a method to accept 4 parameters to cjange all info
    //about offers

    public void changeAll(String newID, String newCompany,String newLocation,
                          long newSalary, boolean newIsFullTime){

        employyeID=newID;
        company=newCompany;
        location=newLocation;
        salary=newSalary;
        isFullTime=newIsFullTime;

    }
    //write a method to check the offer belong to 100K club and retrun the result as true false
    //if a person salary is more than 100k false if not
    public boolean is100KOffer(){
        return salary>=100000;
    }
    /**
     * create an instance method called to String
     * has no parameter
     * return String represantation of Offer Object
     * in below format
     * location =Virginia, company= amazon | salary=150000$| isFulltime = true
     */
    @Override
    public String toString() {
        return "Offer{" +
                "employyeID='" + employyeID + '\'' +
                ", location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
