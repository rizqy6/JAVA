package LATIHAN;

public class TestPolymorpshim extends Pet {
   public static void main(String[] args){
        
        Kucing b = new Kucing();
        b.beriNama("TOM");
        b.info();
        b.perilaku();
        b.Makanan();
        b.Suara();

        Anjing c = new Anjing();
        c.beriNama("BULL");
        c.info();
        c.perilaku();
        c.Makanan();
        c.Suara();
        
   }
}