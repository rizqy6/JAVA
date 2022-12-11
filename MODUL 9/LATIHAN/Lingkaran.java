package LATIHAN;

public class Lingkaran extends methodAbstract{
    int phi = 22/7;
    int jari= 7;

      
    @Override
    public int luas() {
        return phi * jari * jari;
    }

    @Override
    public int keliling() {
        return  phi*(2*jari);
    }
}
