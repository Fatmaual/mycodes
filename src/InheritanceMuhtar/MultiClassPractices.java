package InheritanceMuhtar;

class Data{
    public String name;
    private String age;
   String ID;
   protected String DOB;


    public void Hello(){

    }
    private void Hola(){
        System.out.println("Hola");
    }
     void Merhaba(){
        System.out.println("merhaba");
    }
}

public class MultiClassPractices{
    public static void main(String[] args) {
        Data obj= new Data();
        System.out.println(obj.name);//public is visible everywhere
        //System.out.println(obj.age);// private is not visible outside the class
        System.out.println(obj.ID);//default access modifier is visible to class
        System.out.println(obj.DOB);
        obj.Hello();
      //  obj.Hola();
        obj.Merhaba();

    }

}
