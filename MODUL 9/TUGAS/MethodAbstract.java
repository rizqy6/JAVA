package TUGAS;

public abstract class MethodAbstract {
    public abstract float volume();
    public abstract float luaspermukaan();

    public float getVolume(){
        return volume();
    }

    public float getLuaspermukaan(){
        return luaspermukaan();
    }

}
