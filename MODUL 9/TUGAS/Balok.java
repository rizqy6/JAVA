package TUGAS;

public class Balok extends MethodAbstract {
    float p = 12;
    float l = 6;
    float t = 9;

    @Override
    public float volume() {
        return p*l*t;
    }

    @Override
    public float luaspermukaan() {
        return 2*(p*l + p*t + l*t);
    }
}
