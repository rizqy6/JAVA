package TUGAS;

public class Kerucut extends MethodAbstract{

    
    float phi = (float) 3.14;
    float jari = (float) 7;
    float tinggi = 10;
    float sisi = 10;

    @Override
    public float volume() {
        return  (phi*jari*jari*tinggi)/3;
    }

    @Override
    public float luaspermukaan() {  
        return (phi*jari*jari)+ (phi*jari*sisi);
    }

    
}
