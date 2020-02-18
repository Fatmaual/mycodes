package OOPMuhtar.Day55_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

abstract class ScrumTeam{
     public String name, jobTitle;
     public double salary;

     public abstract void DailyStandUp();
     public abstract void Demo();
  public void getEmployeeInfo(){

      System.out.println("employee name: "+name+" employee job title: "+jobTitle+" employee salary: $"+salary);
      System.out.println("----------------------------");
  }
 }
 class Developers extends ScrumTeam{
     /**
      * Name, jobTitle, salary
      */
     public Developers(String name, String jobTitle, double salary){
         this.name=name;
          this.jobTitle=jobTitle; //  this.jobTitle="Developers";->busekil yazsaydim bana detail vermeyip for each of them
                                  // developers diyecekti
         this.salary=salary;
     }

     @Override
     public void DailyStandUp() {
         System.out.println("developers "+name+" have daily meeting");
     }

     @Override
     public void Demo() {
         System.out.println("developers "+name+" have demo meeting");
     }
 }
  class Testers extends ScrumTeam{

     public Testers(String name, String jobTitle,double salary){
         this.name=name;
         this.jobTitle=jobTitle;
         this.salary=salary;
     }

     @Override
      public void DailyStandUp(){
         System.out.println("Testers "+name+" have daily meeting");
     }
     @Override
      public void Demo(){
         System.out.println("Testers "+name+"reviewing the demo");
     }
  }
public class BOA {
    public static void main(String[] args) {
        ScrumTeam tester1 = new Testers("Fatma", "SDET", 120000);
        ScrumTeam tester2 = new Testers("Esra", "SDET", 140000);
        ScrumTeam tester3 = new Testers("Canan", "Automation Test Engineer", 130000);

        // tester1.DailyStandUp();
        //tester1.getEmployeeInfo();
        //tester2.DailyStandUp();
        //tester2.getEmployeeInfo();

        ScrumTeam[] testers = {tester1, tester2, tester3};
        /**  for(ScrumTeam eachTester: testers){
         eachTester.getEmployeeInfo();
         }
         */
        ScrumTeam developer1 = new Developers("Ayse", "senior developer", 150000);
        ScrumTeam developer2 = new Developers("Serife", "junior developer", 160000);
        ScrumTeam developer3 = new Developers("Derya", "medium developer", 170000);
        ScrumTeam developer4 = new Developers("Furkan", "senior developer", 180000);

        ScrumTeam[] developers = {developer1, developer2, developer3, developer4};
        /** for(ScrumTeam eachDevelopers: developers){
         eachDevelopers.getEmployeeInfo();
         }
         */

        ArrayList<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(Arrays.asList(testers));
        scrum.addAll(Arrays.asList(developers));

        for (ScrumTeam eachMember : scrum) {
            eachMember.getEmployeeInfo();
        }
    }
}