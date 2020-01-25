package day43;

public class Pet {

    /**
     * Attributes: Encapsulate your fields
     * type (breed for some specify animals)
     * name
     * Constructor:
     * no arg constructor
     * set the breed to "unknown"
     * set the name to "noName"
     * 2 args constructor
     *
     * Behaviours:
     * getters, setters, to String
     * speak
     * accept no parameter
     * according to the type speak following
     * cat-->meow
     * dog-->woof
     * cow-->moo
     * horse-->neineigh
     *
     */

    private String type, name;



  public Pet(){
      this.type="unknown";
      this.name="no-name";
  }
  public Pet(String type, String name ){
      this.type=type;
      this.name=name;
  }
  //what is best way to check the value
    public void speak(){
      switch (type.toLowerCase()){
          case "cat":
              System.out.println("meow");
              break;
          case"dog":
              System.out.println("woof");
              break;
          case"horse":
              System.out.println("neigh");
              break;
          case"cow":
              System.out.println("mooo");
              break;
          default:
              System.out.println("unknown animal");
      }

}
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;

    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }


    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    //if your method does not read or modify object attribute  you can just make it static
    public static void showGeneralPetInfo(){
        System.out.println("pets are always good friends for us.");
        //this will not work,static method cannot access anything non-static
        //sout(name)
    }
}
