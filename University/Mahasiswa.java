package University;

public class Mahasiswa {
    public String nama = "Student";
    String nim;
    String alamat;
    double ipk;
    static final double maxIPK = 4.00;

    public Mahasiswa(){
        System.out.println("a");
    }

    public Mahasiswa(String  masukan) {
        this.nama = masukan;
    }

    // public Mahasiswa(String nama){
    //     this();
    //     this.nama = masukan;
    // }

    // public Mahasiswa(String masukan){
    //     this(masukan);
    //     this.ipk= nilai;
    // }
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


//this () berarti memanggil constructor dalam class nya sendiri
