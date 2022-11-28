package LATIHAN;

public class Kucing {
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
        System.out.println("Menyukai Ikan");
    }

    public void Suara(){
        System.out.println("Meeow....meeow");
    }
}
