package MODUL3;

import java.util.Scanner;

public class Rekening {
    int no_rekening;
    int saldo = 100000, tarik, nabung, kirim;
    Scanner sc = new Scanner(System.in);
    
    public void cek_saldo(){
        System.out.println("Sisa saldo anda adalah : " + saldo);
        System.out.println("");
    }
    public void menabung(){
        System.out.println("Masukan nominal saldo anda :");
        nabung = sc.nextInt();
        saldo = saldo + nabung;
        System.out.println("Anda sukses menabung!");
        System.out.println("");
    }
    public void menarik(){
        System.out.println("Masukan saldo anda : ");
        tarik = sc.nextInt();
        if(saldo >= tarik){
            saldo = saldo - tarik;
            System.out.println("Mohon ambil uang Anda!");
        }
        else{
            System.out.println("Saldo anda kurang!!");
        }
        System.out.println("");
    }
    public void transfer(){
        System.out.println("masukan rekening tujuan anda:");
        no_rekening = sc.nextInt();
        System.out.println("Masukan nominal transfer anda:");
        kirim = sc.nextInt();
        if(saldo >= kirim){
            saldo = saldo - kirim;
            System.out.println("Transfer anda sukses!!");
        }
        else{
            
            System.out.println("No rekening tujuan anda Invalid");
            System.out.println("Masukan No rekening tujuan anda kembali!!");
        }
        System.out.println("");
    }
    
}