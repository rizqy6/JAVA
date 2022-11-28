public class Manager extends Karyawan {
    private String namaManager;
    private String alamat;
    private float jamKerja = 7.5f;

    public String getNamaManager() {
        return namaManager;
    }

    public void setNamaManager(String namaManager) {
        this.namaManager = namaManager;
    }

    public int getUsiaManager() {
        return getUsia()+ 8;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public float GetJamKerja(){
        return jamKerja;
    }

    public void  setJamKerja(float jamKerja) {
        this.jamKerja = jamKerja;
    }

    public float getGajiManager() {
        return getGaji() * 2;
    }

    
}
