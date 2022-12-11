package LATIHAN;

public class JajarGenjang extends methodAbstract {
    int a = 5;
    int b = 3;
    int t = 10;

     
    @Override
    public int luas() {
        return a * t;
    }

    @Override
    public int keliling() {
        return  2*(a+b);
    }
}
