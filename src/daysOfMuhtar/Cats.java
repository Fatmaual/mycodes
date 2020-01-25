package daysOfMuhtar;

public class Cats {
     private String name, color, breed;
    private int size, age;


    public void running(){
        System.out.println(" is running ");
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color=color;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(){
        this.breed=breed;
    }
   public int getSize(){
        return size;
   }
   public void setSize(){
        this.size=size;
   }
   public int age(){
        return age;
   }
   public void setAge(){
        this.age=age;
   }

    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
    public void setUpAge(int age){
        if(age>3){
            System.out.println("my cat's age is "+age);
        }else{
            System.out.println("unknown");
        }

    }

    public static void main(String[] args) {
        Cats c1= new Cats();
     c1.age=100;
        System.out.println(c1.age);
        c1.setUpAge(5);
    }
}
