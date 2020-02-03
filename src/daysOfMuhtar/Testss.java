package daysOfMuhtar;
 //import static daysOfMuhtar.TestData.Name;
            //packAgeName    //class Name
  //import static daysOfMuhtar.TestData.ID;

  import static daysOfMuhtar.TestData.*;

public class Testss {
    public static void main(String[] args) {
        System.out.println(Name);
        System.out.println(TestData.Name);
        System.out.println(ID);

        System.out.println(TestData.salary);//default access modifier is not visible outside of the package
     //   System.out.println(TestData.number);--> protected access modifier is not visible outside of the package.



    }



}
