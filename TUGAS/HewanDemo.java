public class HewanDemo {
    public static void main(String[] args){


        //Object 1
        Hewan hewan = new Hewan();
        hewan.setNama("Harimau");
        hewan.setKaki(4);
        hewan.setMakanan("Daging");
        hewan.setType("Karnivora");
        hewan.infoHewan();

        System.out.println("\n----------------------------------------------------------------");

        //Object 1
        Hewan hewan2 = new Hewan();
        hewan2.setNama("Kerbau");
        hewan2.setKaki(4);
        hewan2.setMakanan("Rumput");
        hewan2.setType("Herbivora");
        hewan2.infoHewan();
    }
}
