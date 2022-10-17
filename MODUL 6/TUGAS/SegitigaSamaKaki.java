package TUGAS;

public class SegitigaSamaKaki extends Segitiga {
    double sisiMiring = 12;

    public double hitungLuas(){
        double luas = 0.5*alas*tinggi;
        return luas;
    }

    public double hitungKeliling(){
        double keliling = alas + (2*sisiMiring);
        return keliling;
    }
}
