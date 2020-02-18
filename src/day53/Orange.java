package day53;

public class Orange extends Fruit {
    int vitaminC;

    public Orange(String taste, String color, int vitaminC) {
        super(taste, color);
        this.vitaminC=vitaminC;

    }

    @Override
    public void getDigest() {
        System.out.println(" orange has  vitamin c "+vitaminC+" color "+color+ " and it has "
                + taste + " taste when you digest ");


    }

    @Override
    public String toString() {
        return "Orange{" +
                "vitaminC=" + vitaminC +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
