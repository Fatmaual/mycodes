package day40;

import java.util.ArrayList;

public class HotMarketActions {
    public static void main(String[] args) {

      Offer person1 =new Offer();
      person1.employyeID="Fatma Ulusal";
      person1.company="Apple";
      person1.location="DC";
      person1.isFullTime=true;
      person1.salary=140000;
      person1.displayInformation();

      Offer person2=new Offer();
      person2.employyeID="Ayse Golcu";
      person2.company="Google";
      person2.location="Boston";
      person2.isFullTime=true;
      person2.salary=150000;
      person2.displayInformation();

      Offer person3=new Offer();
      person3.employyeID="Esra Fidan";
      person3.company="Amazon";
      person3.location="Vancouver";
      person3.isFullTime=true;
      person3.salary=96000;
      person3.displayInformation();

      Offer person4=new Offer();
        /**
         * if we don't assign values for istance filed /variable
         * we get default value
         * for primitive numbers : 0 or 0.0
         * boolean : false
         * char:''
         * for any reference types:
         * //null
         */
        person4.displayInformation();

        ArrayList<Offer> myOffers= new ArrayList<>();
        myOffers.add(person1);
        myOffers.add(person2);
        myOffers.add(person3);
        myOffers.add(person4);

        System.out.println("myOffers ================== ");

        for(Offer each:myOffers){
            each.displayInformation();
        }
        System.out.println("myOffers======for loop====");
        for (int x = 0; x <myOffers.size() ; x++) {
            //store each item to a variable each
            Offer each=myOffers.get(x);
            each.displayInformation();
            //myOffers.get(x).displayInformation(); -->this is one shot version
        }
        System.out.println();
        person3.salary=person3.salary+20000;
        System.out.println("person 3 new salary: "+person3.salary);
        System.out.println();
       //set the salary value of person4 offer object to sum all the offers
       person4.salary=person1.salary+person2.salary+person3.salary;
        System.out.println("person 4 salary is: "+person4.salary);
        person4.employyeID="Serife Ozer";
        person4.displayInformation();
        person4.turnToFullTime();
        person4.turnToFullTime();
        person4.newLocation("DC");
        person4.displayInformation();

      //change person 1' all information with another person
        person1.changeAll("Yasemin Dogan","Amazon","Virginia",
                150000,true);
        person1.displayInformation();
        System.out.println("is it 100K offer? "+person1.is100KOffer());
        //if this guy earn more than 100k move him to Atlanta
        boolean result=person1.is100KOffer();
        if(person1.is100KOffer()){
            person1.newLocation("Atlanta");
        }
        person1.displayInformation();

   }
}
