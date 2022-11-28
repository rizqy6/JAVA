package LATIHAN;

public class Anjing extends Pet {
    String nama;


    
    public void beriNama (String beriNama) {
        this.nama = beriNama;
    }

    public String panggilNama(){
        return this.nama;
    }

    void info(){
        System.out.println(panggilNama());
    }

    public String perilaku(){
        return "Hewan penurut";
    }

    public void Makanan(){
        System.out.println("Menyukai Daging dan Tulang");
    }

    public void Suara(){
        System.out.println("Guk...Guk");
    }


}
