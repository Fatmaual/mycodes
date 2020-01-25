package daysOfMuhtar;

public class EmployeeInfo {
   private String name;
    private long ssn;
   private  double Salary;
   private byte Age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public byte getAge(){
        return Age;
    }
    public void setAge(byte Age){
        this.Age=Age;
    }
    public long getSsn(){
        return ssn;
    }
    public void setSsn(long ssn){
        this.ssn=ssn;
    }
    public double getSalary(){
        return Salary;
    }
    public void setSalary(double Salary){
        this.Salary=Salary;
    }


    public String toString() {
        return "EmployeeInfo{" +
                "name='" + name + '\'' +
                ", ssn=" + ssn +
                ", Salary=" + Salary +
                ", Age=" + Age +
                '}';
    }
    //set info
    public void setInfo(String name, long ssn,double Salary, byte age){
        setName(name);
        setAge(Age);
        setSsn(ssn);
        setSalary(Salary);
    }
}
