package day40;

public class Employee {

    String Department;
    String EmployeeName;
    String EmployeeID;
    String JobTitle;
    int SSN;
    char Gender;
    double Salary;

    public void givenAction(){
        System.out.println(EmployeeName+" starts to work at 7 am");
        System.out.println(EmployeeName+" has couple of daily meeting");
        System.out.println(Salary+ "salary she deserves!!");
    }
    public void getInfo(){
        System.out.println(Department+" of Department Employee "+EmployeeName+" | "+JobTitle+" | "+Gender+
                " | $"+Salary);
    }

}
