public class Kucing {
    int umur;
    String bulu;
    String sifat;
    String meong;
    double tinggi;

    void umurKucing(int umurthoi){
        umur = umurthoi;
    }

    void warnaBulu(String buluthoi){
        bulu = buluthoi;
    }

    void sifatKucing(String sifatthoi){
        sifat = sifatthoi;
    }

    void tinggiKucing(double tinggithoi){
        tinggi = tinggithoi;
    }

    void meongKucing(String meongthoi){
        meong = meongthoi;
    }

    void infoKucing(){
        System.out.println(
            "Umur Kucing: " + umur + "Th" + "\n" +
            "Warna Bulu Kucing: " + bulu + "\n" +
            "Sifat Kucing: " + sifat + "\n" +
            "Tinggi Kucing: " + tinggi + "cm" + "\n" +
            "Suara Kucing: " + meong 
        );
    }
    
}
