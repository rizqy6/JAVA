package LATIHAN;

public class Segitiga extends methodAbstract{
    int alas = 6;
    int tinggi =10;
    int sisisegitiga = 5;

      
    @Override
    public int luas() {
        return (alas * tinggi) /2;
    }

    @Override
    public int keliling() {
        return  3*(sisisegitiga);
    }
}
