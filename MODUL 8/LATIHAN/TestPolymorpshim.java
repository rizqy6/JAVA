package LATIHAN;

public class TestPolymorpshim  {
   public static void main(String[] args){
       Kucing pet1 = new Kucing();
       Anjing pet2 = new Anjing();

       pet1.beriNama("TOM");
       System.out.println(pet1.panggilNama());
       System.out.println(pet1.perilaku());
       System.out.println(pet1.suaraKucing());

       pet2.beriNama("BULL");
       System.out.println(pet2.panggilNama());
       System.out.println(pet2.perilaku());
       System.out.println(pet2.suaraAnjing());
        
   }
}