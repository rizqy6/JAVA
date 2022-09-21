package University;

public class Mahasiswa {
    String nama = "Student";
    String nim;
    String alamat;
    double ipk;
    static final double maxIPK = 4.00;

    void isiKRS() {
        System.out.println("Mahasiswa Telah Mengisi KRS");
    }

    double ambilNilai() {
        return ipk;
    }

    void revisiNilai(double ipk) {
        this.ipk = ipk;
    }
}
