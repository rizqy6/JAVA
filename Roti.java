public class Roti {
    String warna;
    String rasa;
    int berat;
    double harga;
    static Roti roti2;
    static Roti roti3;

    void beriWarna(String warnaRoti) {
        warna = warnaRoti;
    }

    void beriRasa(String rasaRoti) {
        rasa = rasaRoti;
    }

    void timbangBerat(int beratRoti) {
        berat = beratRoti;
    }

    void hargaJual(double hargaRoti) {
        harga = hargaRoti;
    }

    void infoRoti() {
        System.out.println(
                "Warna Roti : " + warna + "\n" + "Rasa Roti: " + rasa + "\n" + "Berat Roti: " + berat + "\n" + "gr"
                        + "Harga Roti: " + harga);
    }
}
