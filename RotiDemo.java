public class RotiDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Object 1
        Roti roti = new Roti();
        roti.beriWarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();

        System.out.println('\n');

        // object 2
        Roti roti2 = new Roti();
        roti2.beriWarna("Biru");
        roti2.beriRasa("Bluberty");
        roti2.timbangBerat(40);
        roti2.hargaJual(7000);
        roti2.infoRoti();

        System.out.println('\n');

        // object 3
        Roti roti3 = new Roti();
        roti3.beriWarna("Merah");
        roti3.beriRasa("Strobery");
        roti3.timbangBerat(50);
        roti3.hargaJual(8000);
        roti3.infoRoti();

        System.out.println('\n');

        // object 3
        Roti roti4 = new Roti();
        roti4.beriWarna("Hitam");
        roti4.beriRasa("Nangka");
        roti4.timbangBerat(20);
        roti4.hargaJual(1000);
        roti4.infoRoti();
    }
}