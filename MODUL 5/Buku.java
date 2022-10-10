public class Buku {
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;

    public Buku(String namaPengarang, String judulBuku,int tahunTerbit, int cetakanKe, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }

    public Buku(int tahunTerbit, int cetakanKe){
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
    }

    public Buku(double hargaJual){
        this.hargaJual = hargaJual;
    }

    
    public void info(){
        System.out.println("Nama Pengarang: " + namaPengarang + "\njudul Buku: " +judulBuku + "\nTahun Terbit: " + tahunTerbit + "\nCetakan Ke: " + cetakanKe + "\nHarga Jual: " + hargaJual);
    }
}
