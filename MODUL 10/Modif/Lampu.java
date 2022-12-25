public class Lampu implements ActivityLampu{
    public int statuslampu;

    @Override
    public void matikanLampu() {
        if(statuslampu==0){
            System.out.println("Lampuu sudah dalam kondisi mati");
        }else if (statuslampu==1){
            statuslampu = -1;
            System.out.println("Lampu sudah dimatikan");
        }
    }

    @Override
    public void hidupkanLampu() {
        if(statuslampu==1){
            System.out.println("Lampu sudah dalam kondisi menyala\n***");
        }else{
            statuslampu = +1;
            System.out.println("Lampu sudah dinyalakan");
        }
    }

    @Override
    public void meredupkanLampu() {
        if(statuslampu==2){
            System.out.println("Lampu sudah  dalam kondisi redup");
        } else{
            statuslampu= +2;
            System.out.println("Lampu sudah diredupkan");
        }
    }

    public int setSaklar(int saklar){
        return statuslampu =saklar;
    }
}
