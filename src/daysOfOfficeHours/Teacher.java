package daysOfOfficeHours;

public class Teacher {
   private String name;
    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    //method a set bot name and age!!
    public void initilizeFields(String name, int age){

       // this.name=name;
        //this.age=age;

        //what if setting the name require 100 lines of check
        //what if setting the age require 100 lines of check
        //can I just reuse the method I already have for setting name and age
        setName(name); //-->burasi onemli where is the name coming from?form parameter
        setAge(age);
    }
}
