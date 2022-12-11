package LATIHAN;

public class Persegi extends methodAbstract {

    int sisi = 5;
    
    @Override
    public int luas() {
        return sisi * sisi;
    }

    @Override
    public int keliling() {
        return  4*sisi;
    }
    
}
