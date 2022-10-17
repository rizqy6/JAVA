package LATIHAN;
//metodee overaiding pada metode void
public class Main extends Kendaraan {
    public static void main(String[] args){
        Pesawat a = new Pesawat();
        a.infoSpeed();
        a.infoBerat();
        a.infokapasitasMesin();
        a.infoKetinggian();

        System.out.println("\n--------------------------------");

        Mobil b = new Mobil();
        b.infoSpeed();
        b.infoBerat();
        b.infokapasitasMesin();
        b.infoisiTangki();
    }
}
