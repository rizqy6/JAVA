package TUGAS;

public class PrismaSegitiga extends MethodAbstract {
    float alas = 4;
    float tinggi = 10;
    float tinggiPrisma = 8;

    @Override
    public float volume() {
        return ((alas * tinggi)/2)*tinggiPrisma;
    }
    @Override
    public float luaspermukaan() {
        return (3*alas*tinggiPrisma)+(2*(alas*tinggi));
    }

    
}
