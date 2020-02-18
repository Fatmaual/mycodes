package OOPMuhtar.Abstaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {
    public static void main(String[] args) {
        Tester employee=new Tester("Hasan","Manual Tester",8500);
        //System.out.println(employee.jobTitle);//-->null bc I didn't give value
     //   employee.jobTitle="Manual Tester";
       // System.out.println(employee.jobTitle);
        //System.out.println(employee.employeeName);
        //System.out.println(employee.salary);


        employee.getEmployeeInfo(); //-->if I don't wanna print out each by each use getInfo
        Tester employee2=new Tester("Alisa","Automation Tester",67000);
        Tester employee3= new Tester("Rauf","SDET",230000);

        List<Tester> testerList=new ArrayList<>();
        testerList.addAll(Arrays.asList(employee,employee2,employee3));

        for(Tester eachTester: testerList) {
            eachTester.getEmployeeInfo();
            System.out.println("---------------");

        }
        Developers developer1= new Developers("Vlasidlav",130000);
        developer1.getEmployeeInfo();

        Developers developer2=new Developers("Emma",300000);
        Developers developer3=new Developers("Ayse",60000);

        List<Developers> developersTeam= new ArrayList<>();
        developersTeam.addAll(Arrays.asList(developer1,developer2,developer3));

        for(Developers each:developersTeam){
            each.fixingBug();

        }
  List<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(testerList);
        scrum.addAll(developersTeam);

        for(ScrumTeam eachMember:scrum){
            eachMember.getEmployeeInfo();
        }
    }
}
