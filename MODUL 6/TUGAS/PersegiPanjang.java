package TUGAS;

public class PersegiPanjang {
    double panjang = 3;
    double lebar = 10;

    public double hitungLuas(){
        double luas = panjang * lebar;
        return luas;
    }

    public double hitungKeliling(){
        double keliling = 2*(panjang + lebar);
        return keliling;
    }
}
