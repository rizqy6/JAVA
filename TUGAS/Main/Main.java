package Main;

import java.sql.Date;

class Mahasiswa{
    String nama;
    String NIM;
    String alamat;
    int semester;


    Mahasiswa(String inputNama, String inputNIM, String inputAlamat, int inputSemester ){ //yang ada didalan kurung bernama parameter
        nama = inputNama;
        NIM = inputNIM;
        alamat = inputAlamat;
        semester = inputSemester;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(alamat);
        System.out.println(semester);
    }
}

class Karyawan{
    String nama;
    String alamat;
    String jabatan;
    double gaji;

    Karyawan(String inputNama, String inputAlamat, String inputJabatan, double inputGaji){
        nama = inputNama;
        alamat = inputAlamat;
        jabatan = inputJabatan;
        gaji = inputGaji;

        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(jabatan);
        System.out.println(gaji + " Juta");
    }
}

class Dosen{
    String nama;
    String pendidikan;
    int NIK;
    Date lahir = new Date(103,8,10);

    Dosen(String inputNama, int inputNIK, String inputPendidikan){
        nama = inputNama;
        NIK = inputNIK;
        pendidikan = inputPendidikan;
        
        
        System.out.println(nama);
        System.out.println(NIK);
        System.out.println(pendidikan);
        System.out.println(lahir.toString());
    }
}
public class Main {
    
    public static void main(String[] args){
        Mahasiswa mahasiswa = new Mahasiswa("Rizqy", "L200210015", "Jepara", 3);

        Karyawan karyawan = new Karyawan("Rizqy", "Jepara", "CEO", 150);

        Dosen dosen = new Dosen("Rizqy", 33200011, "S1 Teknik Informatika");
    }
}
