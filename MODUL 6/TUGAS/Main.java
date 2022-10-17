package TUGAS;

public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        System.out.println("Luas Persegi: "+ persegi1.hitungLuas());
        System.out.println("Keliling persegi: "+ persegi1.hitungKeliling()+ "\n");

        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang: "+ pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: "+ pp.hitungKeliling()+ "\n");

        SegitigaSamaKaki sk = new SegitigaSamaKaki();
        System.out.println("Luas Segitiga Sama Kaki: "+ sk.hitungLuas());
        System.out.println("Keliling Segitiga Sama Kaki: "+ sk.hitungKeliling()+ "\n");

        SegitigaSamaSisi ss= new SegitigaSamaSisi();
        System.out.println("Luas Segitiga Sama Sisi:"+ ss.hitungLuas());
        System.out.println("Keliling Segitiga Sama Sisi: "+ ss.hitungKeliling()+ "\n");
    }
}
