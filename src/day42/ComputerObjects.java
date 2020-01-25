package day42;

public class ComputerObjects {
    public static void main(String[] args) {
        Computer com1= new Computer();
        com1.setBrand("Apple");
        com1.setPrice(32);
        com1.setPrice(2000);

        com1.runProgram();
        com1.calculating();

        com1.setPrice(12);
        com1.setRam(1000);
        System.out.println("com1 : "+com1.toString());

        int myRam=com1.getRam();
        System.out.println("myRam is: " + myRam);

        Computer com2= new Computer();
        com2.setBrand("HP");
        //set hp price to half of apple price
        com2.setPrice(com1.getPrice()/2);
        //set hp ram to quarter of apple ram
        com2.setRam(myRam/4);
        System.out.println("com2 is: " + com2);

    }
}
