
public class LocalVariable {
    int usia = 10;

    public void hitungUsia(){
        int usia;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

       System.out.println("Usia saya "+ usia);
    }

    public void beratBadan(){
        double beratBadan;
        double beratLahir = 8;

        beratBadan = (double) (beratLahir + (usia/2)); //tidak bisa dipanggil karena usia merupakan localvariable dari metodh hitung usia
        System.out.println("Berat saya " + beratBadan);
    }

    public static void main(String[] args){
        LocalVariable baru = new LocalVariable();
        baru.hitungUsia();
        baru.beratBadan();
    }
}
