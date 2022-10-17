package TUGAS;

public class SegitigaSamaSisi  extends Segitiga{

    double sisi = 8;

    public double hitungLuas(){
        double luas = 0.5 * sisi * tinggi;
        return luas;
    }

    public double hitungKeliling(){
        double keliling = sisi * 3;
        return keliling;
    }
}
