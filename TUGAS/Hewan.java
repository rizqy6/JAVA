public class Hewan{
    String nama;
    String makanan;
    String type;
    int kaki;

    void setNama(String namaHewan) {
        nama = namaHewan;
    }

    void setKaki(int jumlahKaki){
        kaki = jumlahKaki;
    }

    void setMakanan(String jenisMakanan){ 
        makanan = jenisMakanan;
    }

    void setType(String typeMakanan){
        type = typeMakanan;
    }

    void infoHewan(){
       System.out.println(
            "Nama Hewan: " + nama + "\n" +
            "Jumlah Kaki: " + kaki + "\n" +
            "Makanan: " + makanan + "\n" +
            "Type Hewan: " + type
       );
    }
}