package LATIHAN;

public class MethodMain {
    public static void main(String[] args){
        Persegi psg = new Persegi();
        System.out.println("Keliling persegi: " + psg.getKell() + "cm");
        System.out.println("Luas Persegi: "+ psg.getLuas()+ "cm");

        System.out.println("--------------------------------");

        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("keliling persegi panjang: " + pp.getKell()+ "cm");
        System.out.println("Luas Persegi panjang: "+ pp.getLuas()+"cm");

        System.out.println("--------------------------------");

        JajarGenjang jj = new JajarGenjang();
        System.out.println("Keliling JajarGenjang: "+ jj.getKell()+"cm");
        System.out.println("Luas JajarGenjang: "+ jj.getLuas()+"cm");

        System.out.println("--------------------------------");

        Lingkaran ll = new Lingkaran();
        System.out.println("Keliling Lingkaran: "+ ll.getKell()+ "cm");
        System.out.println("Luas Lingkaran: "+ ll.getLuas()+"cm");

        System.out.println("--------------------------------");

        Segitiga ss = new Segitiga();
        System.out.println("Keliling Segitiga: "+ ss.getKell()+ "cm");
        System.out.println("Luas Segitiga: "+ ss.getLuas()+"cm");

    }
}
