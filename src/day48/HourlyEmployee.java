package day48;

/**
 * Warm up
 * ----------
 * abstract super class called Employee
 * instance fields : name , id
 * Constructor : to set all the fields
 * abstract methods :
 * 		calculateAnualSalary
 * 		toString
 * HourlyEmployee
 * instance fields :
 * 	hourlyWage , numsOfHours ,
 * Constructor : to set all the fields
 * instance methods ;
 * 	calculateAnualSalary
 * 	toString
 * ----------------
 * FullTimeEmployee
 * 	instance fields :
 * 		 monthlySalary
 * Constructor : to set all the fields
 * instance methods ;
 * 	calculateAnualSalary
 * 	toString
 */

public class HourlyEmployee extends Employee {

    //    String name ;
//    int id ;
    double hourlyWage;
    int numbersOfHours; // annual hours worked

    public HourlyEmployee(String name, int id, double hourlyWage, int numbersOfHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numbersOfHours = numbersOfHours;
    }

    @Override
    public void calculateAnnualSalary() {

        System.out.println("Hourly Employee yearly : " + (hourlyWage * numbersOfHours));

    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numbersOfHours=" + numbersOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , yearly salary = " + (hourlyWage * numbersOfHours)
                + '}';
    }
}
