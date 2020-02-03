package denemelerim;

public class MysqrDataBase implements Interfacess{
    @Override
    public void add() {
        System.out.println("Msqr e ekle");
    }

    @Override
    public void delete() {
        System.out.println("Msqr den sil");
    }

    @Override
    public void get() {
        System.out.println("Msqr den elde et");
    }

    @Override
    public void update() {
        System.out.println("Msqr i guncelle");

    }
}
