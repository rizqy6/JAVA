import java.util.Scanner;

public class AplikasiLampu {
    public static void main(String[] args){
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statuslampu = lampu.setSaklar(0);
        System.out.println("Status Lampu = " + lampu.statuslampu + "\nketikan");
        System.out.println(" 0 untuk mematikan lampu\n"+
                            "1 untuk menyalakan lampu\n" +
                            "2 untuk meredupkan lampu"
        );
        

        // int x = sc.nextInt();
        if(lampu.setSaklar(sc.nextInt())==0){
            lampu.matikanLampu();
        }else if(lampu.setSaklar(sc.nextInt())==1){
            lampu.hidupkanLampu();
        }else{
            lampu.meredupkanLampu();;
        }      
    }
}
