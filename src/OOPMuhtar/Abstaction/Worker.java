package OOPMuhtar.Abstaction;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class hourlyWorker extends Worker{
   private int hourlySalary;


   public hourlyWorker(int hourlySalary,String name){
       this.hourlySalary=hourlySalary;
       this.name=name;
   }

    @Override
    public int calculateSalary() {
        return hourlySalary*40*45;
    }
}

class FULLtIME extends Worker{

   int monthlySalary;

   public FULLtIME(int monthlySalary, String name){
       this.monthlySalary=monthlySalary;
       this.name=name;
    }

    @Override
    public int calculateSalary() {
        return monthlySalary*12;
    }

    @Override
    public String toString() {
        return "FULLtIME{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }

    @Override
    public void sleep(Worker anyWorker) {
        //super.sleep
        System.out.println(anyWorker.name+"full time worker is sleeping ");
    }
    public void dismiss(){
        System.out.println("dismiss method just for fulltime");
    }

}

public abstract class Worker {
    public String name;

    public abstract int calculateSalary();

    public void sleep(Worker anyWorker){
        System.out.println(anyWorker.name+" is sleeping");

    }
    public static void drinkWater(Worker w1){
        System.out.println(w1.name +" is drinking water");
    }
}
class company{
    public static void main(String[] args) {
        FULLtIME f1= new FULLtIME(3500,"john");
        f1.monthlySalary=40000;
        f1.monthlySalary=-400000; // burada -4000 de olabilir oyuzden private veriyorum
hourlyWorker h1 =new hourlyWorker(20,"cemile");
        System.out.println("f1 "+f1);
        System.out.println("h1 "+h1);

        Worker w1= new FULLtIME(4000,"esra");
        Worker w2= new hourlyWorker(15,"sevgi");
        System.out.println("f1.calculateSalary() = " + f1.calculateSalary());
        System.out.println("h1.calculateSalary() = " + h1.calculateSalary());
        System.out.println("w1.calculateSalary() = " + w1.calculateSalary());
        System.out.println("w2.calculateSalary() = " + w2.calculateSalary());
        f1.sleep(w1);//-->worker is sleeping
        System.out.println("worker.drinkwater(w1): ");
        Worker.drinkWater(w1);
        Worker.drinkWater(f1);
        Worker.drinkWater(h1);
        ((FULLtIME)w1).dismiss();

        int a=5;
        double b=a;
        int c= (int) b;
        System.out.println("b = " + b);
        List<Worker> workerList= new ArrayList<>();
        workerList.add(w1);
        workerList.add(w2);
        workerList.add(f1);
        workerList.add(h1);

        List<Worker> workerList1=new ArrayList<>(Arrays.asList(w1,w2,h1,f1));
        System.out.println("worker list 1: "+workerList1);

        List<Integer> salaryList=new ArrayList<>();
     //   salaryList.add(f1.calculateSalary());
       // salaryList.add(w1.calculateSalary());
        //salaryList.add(h1.calculateSalary());
        //System.out.println("salary list "+salaryList);
      //  for (int x = 0; x <workerList.size() ; x++) {
        //    salaryList.add()

        // }

     for(Worker eachWorker: workerList){
         salaryList.add(eachWorker.calculateSalary()); //repl tjmax sorusu bak

     }

        System.out.println("salaryList = " + salaryList);

    }
}