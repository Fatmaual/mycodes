package day43;

public class Film {
    private String adi, kindOf;
    private double length;





    public String getAdi(){
        return adi;
    }
    public void setAdi(){
        this.adi=adi;
    }
    public String getKindOf(){
        return kindOf;
    }
    public void setKindOf(){
        this.kindOf=kindOf;
    }
    public double getLength(){
        return length;
    }
    public void setLength(){
        this.length=length;
    }


    public String toString() {
        return "Filmler{" +
                "adi='" + adi + '\'' +
                ", kindOf='" + kindOf + '\'' +
                ", length=" + length +
                '}';
    }
    public Film(String adi, String kindOf, double length){


    }

}
