package day53;
abstract class AbstractData{
    public void add(){
        System.out.println("ekle");
    }
    public void delete(){
        System.out.println("sil");
    }
    abstract void update();
    abstract void get();
}

public class AbstractDataBase {
    public static void main(String[] args) {

        AbstractData mayo= new MayoData();
        AbstractData mango= new MangoData();

        mango.add();
        mango.delete();
        mango.get();
        mango.update();

    }

}

