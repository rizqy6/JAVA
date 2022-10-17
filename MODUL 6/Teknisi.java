public class Teknisi extends Pegawai{
    public static void main(String[] args) {
        double lemburPerjam = 40000;
        double gajiPerBulan;

        Pegawai pegawai = new Pegawai();
        gajiPerBulan = pegawai.gajiPokok + lemburPerjam;
        System.out.println(gajiPerBulan);
    }
}
