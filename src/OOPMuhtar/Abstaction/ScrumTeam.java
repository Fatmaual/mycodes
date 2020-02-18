package OOPMuhtar.Abstaction;

/**
 * Task:
 * 	create an abstract class called ScrumTeam:
 * 			Data: employeeName, jobTitle, salary
 * 			actions (Abstract):  Demo();
 * 					 			 DailyStandUp();
 * 			instance method:
 * 					 employeeInfo(): prints employeeName, Job Title, employee salary
 * 	create the following sub classes of ScrumTeam:
 * 			1. Testers:
 * 						actions: foundBug()
 * 			2. Developers: job title by default should be software developer
 * 						actions: fixingBug()
 * 	create class capitalOne:
 * 			create List of Testers, and store two objects of Testers class
 * 			create List of Developers, and store two objects of Developers class
 * 			create List of ScrumTeam, and store the list of Testers and Developers
 * 			use for each loop to print out each of the scrum team member's EmployeeInfo
 */

public abstract class ScrumTeam {
    public String employeeName,jobTitle;
    public double salary;

    public abstract void Demo();
    public abstract void DailyStandUp();

    public void getEmployeeInfo(){

        System.out.println("employee name "+employeeName+" job title: "+jobTitle+" salary: "+salary);
        System.out.println("-----");
    }

}
class Tester extends ScrumTeam{

    /**
     * the instance variable we have here which are inherit from super abstract class
     * and the method too (getEmployeeInfo()  )
     */
 public Tester(String employeeName, String jobTitle, double salary){

     this.jobTitle=jobTitle;
     this.employeeName=employeeName;
     this.salary=salary;


    }

    @Override
    public void Demo() {
        System.out.println("this is sub class and abstract  demo method ");
        System.out.println("Tester "+this.employeeName+" is doing demo ");
    }
     @Override

    public void DailyStandUp(){
         System.out.println("this is sub class and override abstract method of DailyStandUp");
         System.out.println("Tester "+employeeName+" is attending the daily meeting");

     }
     public void foundTheBug(){
         System.out.println("Tester "+this.employeeName+ " report a bug ");
     }
}
class Developers extends ScrumTeam{

    public Developers(String employeeName, double salary){
        this.jobTitle=" software developer";
        this.employeeName=employeeName;
        this.salary=salary;

    }

    @Override
    public void Demo() {
        System.out.println("Dveloper "+this.employeeName+" is doing coding");

    }

    @Override
    public void DailyStandUp() {
        System.out.println("Developer "+this.employeeName+" attend the daily stand up");
    }
    public void fixingBug(){
        System.out.println("developers "+this.employeeName+" is fixing the bug");
    }
}
class BA extends ScrumTeam{
    /**
     * inherited features: employeename, jobtitle and salary
     * getemployeeinfo()
     */

public BA(String employeeName, double salary){
    this.jobTitle="Business Analyst";
    this.employeeName=employeeName;
    this.salary=salary;


}
    @Override
    public void Demo() {
        System.out.println("Business Analyst "+this.employeeName+" is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("business analyst "+ this.employeeName+" gathering requirement");

    }
}