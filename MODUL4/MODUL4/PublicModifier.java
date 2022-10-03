package MODUL4;

public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;

    public void kali(){
        int d = a*b*c;
        System.out.println("Hasil Kali = " + d);
    }

    public void tambah(){
        int e= a+b+c;
        System.out.println("Hasil tambah = " + e);
    }

    public void kurang(){
        int f = a-b-c;
        System.out.println("Hasil Kurang = " + f);
    }

    public void rata_rata(){
        int g = (a+b+c)/3;
        System.out.println("Hasil Rata-rata = " + g);
    }
}
