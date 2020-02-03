package OOPMuhtar;

import java.util.List;

 public class Zoo{
    public static void main(String[] args) {
        Tiger tiger1=new Tiger();
        Tiger[] Tigers = {tiger1, new Tiger()};

        Octopus octopus1= new Octopus();
        Octopus[] octopus ={octopus1, new Octopus()};

//        Octopus octopus1 = new Octopus();
  //      Octopus[] octopus={octopus1, new Octopus() };

       //   Animal    animal1=        new Tiger();
//reference type    referenceName    object
     //   Animal animal2= new Octopus();


    }


}

class Tiger extends Animal{

    public void hunts(){
        System.out.println("tiger is hunting");

    }
    public void talk(){
        System.out.println("tiger is talking-->rrooaarr");
    }
}

class Octopus extends Animal{

    @Override
    public void talk(){
        System.out.println("the octopus makes some sounds");

    }
    public void swim(){
        System.out.println("The Octopus is swimming");
    }
}

 class Animal {

    public void talk(){
        System.out.println("Animals are talking");

    }
}
