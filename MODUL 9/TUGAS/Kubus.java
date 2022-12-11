package TUGAS;

public class Kubus  extends MethodAbstract{
    float sisi = 5;



    @Override
    public float volume() {
        return sisi*sisi*sisi;
    }

    @Override
    public float luaspermukaan() {
        return 6* sisi *sisi;
    }
    
}
