package OOPMuhtar.Abstaction;

public class BOA {
    public static void main(String[] args) {
        BA ba1=new BA("Mohammed",230000);
        BA ba2=new BA("Esra",450000);
        BA ba3=new BA ("Fatma",3400000);

        BA[] BAteam={ba1,ba2,ba3};

        Tester tester1=new Tester("Sevim","Automation tester",120000);
        Tester tester2=new Tester("Sevim","Manual tester",180000);
        Tester tester3=new Tester("Serife","SDET",190000);

        Tester [] testers={tester1,tester2,tester3};
        ScrumTeam[][] scrum = {testers, BAteam};

        for(ScrumTeam [] eachArray: scrum){
            for(ScrumTeam eachMember:eachArray){
                eachMember.getEmployeeInfo();
            }
        }

    }
}
