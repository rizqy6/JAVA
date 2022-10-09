public class Campuran {
    String nama;


    //Constructor Dengan Parameter
    public Campuran(String nama) {
        this.nama = nama;
    }

    public void info(){
        System.out.println("nama: " + nama);
    }

    //Constructor tanpa Parameter
    public Campuran(){
        System.out.println("Default tanpa parameter");
    }
}
