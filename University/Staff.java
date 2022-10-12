package University;

public class Staff {
    String nama = "Pekerja";
    String nip;
    String alamat;
    String jenisKelamin;
    String gaji;
    double haricuti;
    static final double maxHariCuti = 12;

    void hariCuti(){
        System.out.println("Maksimal Hari Cuti: ");
    }

    double ambilCuti(){
        return haricuti;
    }
}
