package LATIHAN;

class NestedClass{
    String nama = "Maghfur RIza";
    String nim = "L200210078";

    public void printNama(){
        System.out.println("Nama: " + nama + "\nNIM: " + nim);
    }

    static class StaticNestedClass{
        static String jurusan = "Teknik Informatika";
        public void aksesNama(){
            NestedClass nested = new NestedClass();
            nested.printNama();
        }
    }

    class InnerClass{
        public void aksesJurusan(){
            System.out.println("Jurusan: " +StaticNestedClass.jurusan);
        }
    }
}