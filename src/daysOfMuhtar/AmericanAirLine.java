package daysOfMuhtar;

import day40.Employee;

public class AmericanAirLine {
    public static void main(String[] args) {
        EmployeeInfo emrah= new EmployeeInfo();
        emrah.setName("Emrah");
        System.out.println(emrah.getName());
        emrah.setName("Hakan");
        System.out.println(emrah.getName());
        emrah.setSsn(234567);
        System.out.println(emrah.getSsn());
        emrah.setAge((byte)40);
        System.out.println(emrah.getAge());
        emrah.setSalary(120000);
        System.out.println(emrah.getSalary());
        System.out.println(emrah.toString());
        System.out.println("=================");
        EmployeeInfo shirin =new EmployeeInfo();
      //---->  System.out.println(shirin.getName);-->ERROR!!!
        shirin.setName("SHIRIN");
        shirin.setAge((byte)41);
        shirin.setSalary(1200000);
        shirin.setSsn(12345678);
        System.out.println(shirin.getName());
        System.out.println(shirin.getSalary());
        System.out.println(shirin.getAge());
        System.out.println(shirin.getSsn());
        System.out.println("===========");
        EmployeeInfo fatma= new EmployeeInfo();
        fatma.setInfo("fatma",1234567,140000,(byte)41);
        System.out.println(fatma.getName());
        System.out.println(fatma.getSsn());
        System.out.println(fatma.getSalary());
        System.out.println(fatma.getAge());
        System.out.println(fatma.toString());


    }
}
