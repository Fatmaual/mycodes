package day40;

public class EmployeeInfo {
    public static void main(String[] args) {
        /**
         * Assignment:
         * create a custom class for Employees
         * attributes:
         * EmployeeName
         * EmployeeID
         * JobTitle
         * SSN
         * Gender
         * Salary
         * actions :
         * getInfo
         */
        Employee person1= new Employee();
        person1.EmployeeName="Fatma G.";
        person1.EmployeeID="FG";
        person1.JobTitle="Automation Testing Engineer";
        person1.SSN=23456789;
        person1.Gender='F';
        person1.Salary=140000;

        person1.getInfo();
        person1.givenAction();

        Employee person2= new Employee();
        person2.EmployeeName="Ayse Golcu";
        person2.EmployeeID="AG";
        person2.JobTitle="Automation Testing Engineer";
        person2.SSN=456789098;
        person2.Gender='F';
        person2.Salary=150000;

        person2.getInfo();
        person2.givenAction();
    }
}
