package University;

//import java.util.Scanner;

public class UniversityDemo {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "budi";
        mhs1.nim = "L200";
        mhs1.alamat = "Solo";
        mhs1.ipk = 3.5;

        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.alamat);
        System.out.println(mhs1.ipk);
        System.out.println(Mahasiswa.maxIPK);

        mhs1.isiKRS();
        System.out.println(mhs1.ambilNilai());
        mhs1.revisiNilai(3.7);
        System.out.println(mhs1.ambilNilai());

        Staff a = new Staff();
        a.nama = "Hari";
        a.nip = "L2124343";
        a.alamat = "Jepara";
        a.jenisKelamin = "Laki -Laki";
        a.gaji= "10.000.000";

        System.out.println(a.nama);
        System.out.println(a.nip);
        System.out.println(a.alamat);
        System.out.println(a.jenisKelamin);

        a.hariCuti();
        System.out.println(Staff.maxHariCuti);

    }
}
