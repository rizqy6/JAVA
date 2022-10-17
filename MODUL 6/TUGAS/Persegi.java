package TUGAS;

public class Persegi extends BangunDatar{
    double sisi = 4;

    public double hitungLuas(){
        luas = sisi * sisi;
        return luas;
    }

    public double hitungKeliling(){
        keliling = sisi * 4;
        return keliling;
    }
}
