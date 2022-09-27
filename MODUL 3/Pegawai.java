public class Pegawai {
    String nama;
    int nip;
    double gaji;

    void setNama (String namaPegawai){
        nama = namaPegawai;
    }

    void setNip (int nipPegawai){
        nip = nipPegawai;
    }

    void setGaji(Double gajiPegawai){
        gaji = gajiPegawai;
    }

    public void info(){
        System.out.println(
            "Nama: " + nama + "\n" +
            "NIP: " + nip + "\n" +
            "Gaji: " + gaji 
        );
    }

    public static void main(String[] args){
        Pegawai staf1 = new Pegawai();
        staf1.setNama("Odin");
        staf1.setNip(111111);
        staf1.setGaji(120.000000);
        staf1.info();

        Pegawai staf2 = new Pegawai();
        staf2.setNama("wahyu");
        staf2.setNip(222222);
        staf2.setGaji(120.000000);
        staf2.info();

        Pegawai staf3 = new Pegawai();
        staf3.setNama("arip");
        staf3.setNip(333333);
        staf3.setGaji(120.000000);
        staf3.info();

        Pegawai staf4 = new Pegawai();
        staf4.setNama("ahmat");
        staf4.setNip(44444);
        staf4.setGaji(120.000000);
        staf4.info();

        Pegawai staf5 = new Pegawai();
        staf5.setNama("Thoi");
        staf5.setNip(55555);
        staf5.setGaji(120.000000);
        staf5.info();
    }
}
