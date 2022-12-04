package TUGASCUSTOMER;

public class CustomerData {
    public String nama, alamat, pekerjaan;
    public int tgllahir, gaji;

    public CustomerData(String nama, String alamat, String pekerjaan, int tgllahir, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.tgllahir = tgllahir;
        this.gaji = gaji;
    }
    
    public void print(){
        System.out.println("================================================================");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Tgllahir: " + tgllahir);
        System.out.println("Gaji: Rp. " + gaji);
    }
}
