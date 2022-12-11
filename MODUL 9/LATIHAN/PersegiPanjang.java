package LATIHAN;

public class PersegiPanjang  extends methodAbstract{
    int panjang =10;
    int lebar = 5;

     
    @Override
    public int luas() {
        return panjang * lebar;
    }

    @Override
    public int keliling() {
        return  2*panjang + 2*lebar;
    }

}
