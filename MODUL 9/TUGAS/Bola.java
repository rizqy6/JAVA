package TUGAS;

public class Bola extends MethodAbstract {

    float phi  = (float) 3.14;
    float jari = 7;
    float tinggi = 10;

    @Override
    public float volume() {
        return 4/3*phi*jari*jari*jari;
    }

    @Override
    public float luaspermukaan() {
        return 4*phi*jari*jari;
    }
    
}
