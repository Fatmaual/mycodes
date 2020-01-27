package day48;

public abstract class Employee {
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
        String name;
        int id;

        public Employee() {

        }

        // WHY DO WE HAVE CONSTRUCTOR HERE
        // WE CAN NOT CREATE AN OBJECT OUT OF IT ?
        // WHAT IS THE POINT ?
        // So that sub class can reuse the code of setting id and name
        public Employee(String name, int id) {
            this.id = id;
            this.name = name;
        }

        public abstract void calculateAnnualSalary();

        // This is optional : the only reason we put it in here was
        // to enforce sub class to provide toString method
        public abstract String toString();


    }