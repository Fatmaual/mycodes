package denemelerim;

import day39.Student;
class main{
    public static void main(String[] args) {
        Costumerr costumerr=new Costumerr();
        Student student =new Student();
  costumerr.log();
  student.log();
    }
}

public class Costumerr implements InterfaceYtb{


    @Override
    public void log() {
        System.out.println("costumer eklendi");

    }

   class Studentt implements InterfaceYtb{


       @Override
       public void log() {
           System.out.println("student eklendi");
       }
   }
}
