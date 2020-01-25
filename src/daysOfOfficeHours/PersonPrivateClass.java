package daysOfOfficeHours;

public class PersonPrivateClass {
    private String firstName;
    private String lastName;
    private String dob;
    public void setFirstName(String firstName){
        if(firstName.length()<2){
            System.out.println("name is too short");
        }else{
            this.firstName=firstName;
        }
        System.out.println(firstName);
    }
}
