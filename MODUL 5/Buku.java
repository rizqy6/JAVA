public class Buku {
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;

    public Buku(String namaPengarang, String judulBuku,int tahunTerbit) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
    }

    public Buku( int cetakanKe){
        this.cetakanKe = cetakanKe;
    }

    public Buku(double hargaJual){
        this.hargaJual = hargaJual;
    }
    
    public void 
    fCetak(){

    }

    public void info(){
        System.out.println("Nama Pengarang: " + namaPengarang + "\njudul Buku: " +judulBuku + "\nTahun Terbit: " + tahunTerbit + "\nCetakan Ke: " + cetakanKe + "\nHarga Jual: " + hargaJual);
    }
}
