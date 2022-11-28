public class KaryawanDemo {
    public static void main(String[] args){
        // Karyawan k1 = new Karyawan();
        // k1.setNama("RIzqy");
        // k1.setGaji(25000000);
        // k1.setUsia(19);

        // System.out.println(k1.getNama());
        // System.out.println(k1.getGaji());
        // System.out.println(k1.getUsia());

        Manager k2 = new Manager();

        k2.setNama("Rizqy");
        k2.setGaji(2500000);
        k2.setUsia(19);


        k2.setNamaManager("Rizqy");
        k2.setAlamat("Jepara");

        System.out.println("Nama Karyawan: " + k2.getNama());
        System.out.println("Gaji Karyawan: " + k2.getGaji());
        System.out.println("Usia Karyawan: " + k2.getUsia());

        System.out.println("Nama Manager: " + k2.getNamaManager());
        System.out.println("Usia Manager: " + k2.getUsiaManager());
        System.out.println("Alamat Manager: " + k2.getAlamat()); 
        System.out.println("Jam Kerja Manager: " + k2.GetJamKerja());
        System.out.println("Gaji Manager: " + k2.getGajiManager());
    }
}
