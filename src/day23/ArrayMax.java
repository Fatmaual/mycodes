package day23;

public class ArrayMax {
    public static void main(String[] args) {
        long[] salaries = new long[]{10000l,200000l,1500000l,11500000l,600000l};
        //bir rakami diger rakamla compare yapabilmek icin herhangi birini almam lazim genelde ilki oluyor
        //hangisini pick yapacagim hangisini istersen nasil yapacagim formul asagida!
        long max = salaries[0];
for(long salary : salaries){
    if(salary>max){
        max = salary;
    }
}
        System.out.println("maxSalary = " + max);
    }
}
