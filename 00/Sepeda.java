public class Sepeda {
    public String nama;
    public int cc;
    public double harga;


    public Sepeda(String nama){
        this.nama=nama;
    }
    public Sepeda(int cc){
        this.cc = cc;
    }
    public Sepeda(double harga){
        this.harga= harga;
    }

    public void print(){
        System.out.println("Merk Sepeda: "+ nama);
    }
    public void print2(){
        System.out.println("Kapastitas Mesin: "+ cc);
    }
    public void print3(){
        System.out.println("Harga Sepeda: "+ harga+"juta"); 
    }
    
}
