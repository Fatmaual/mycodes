package day46;

public class SQLProgrammer extends Programmer{

    //access modifier in sub class can have same visibility or more visibility


   protected  void code(){
        System.out.println("writing SQL QUERY");
    }

    public void writeSQLQuery(){
        System.out.println("testing SQL Query");

    }
    public void createdDatabase(){
        System.out.println("writing SQL Query");

    }
}
