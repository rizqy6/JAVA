package TUGAS;

public class Main {
    public static void main(String[] args){
        Balok bb = new Balok();
        System.out.println("Volume Balok: " + bb.getVolume() + "cm");
        System.out.println("Luas Permukaan Balok: " + bb.getLuaspermukaan()+"cm");

        System.out.println("--------------------------------");

        Kubus kk = new Kubus();
        System.out.println("Volume Kubus: " + kk.getVolume() + "cm");
        System.out.println("Luas Permukaan Kubus: " + kk.getLuaspermukaan()+"cm");

        System.out.println("--------------------------------");

        Bola b = new Bola();
        System.out.println("Volume Bola: " + b.getVolume() + "cm");
        System.out.println("Luas Permukaan Bola: " + b.getLuaspermukaan()+"cm");

        System.out.println("--------------------------------");

        Kerucut k = new Kerucut();
        System.out.println("Volume Kerucut: " + k.getVolume() + "cm");
        System.out.println("Luas Permukaan Kerucut: " + k.getLuaspermukaan()+"cm");

        System.out.println("--------------------------------");

        PrismaSegitiga p = new PrismaSegitiga();
        System.out.println("Volume Prisma Segitiga: " + p.getVolume() + "cm");
        System.out.println("Luas Permukaan Prisma Segitiga: " + p.getLuaspermukaan()+"cm");
    }
}
