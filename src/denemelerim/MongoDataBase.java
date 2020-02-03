package denemelerim;

class DatabaseManager{
    public void addDataBate(Interfacess database){
        database.add();

    }
}

  class Main{




      public static void main(String[] args) {

      }

        }


public class MongoDataBase implements Interfacess {
    @Override
    public void add() {
        System.out.println("Mongo e ekle");
    }

    @Override
    public void delete() {
        System.out.println("Mongo den sil");
    }

    @Override
    public void get() {
        System.out.println("Mongo den elde et");
    }

    @Override
    public void update() {
        System.out.println("Mongo i guncelle");

    }
}
