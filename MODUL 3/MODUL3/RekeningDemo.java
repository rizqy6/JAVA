package MODUL3;

import java.util.Scanner;
public class RekeningDemo {
    public static void main(String[] args){
      try (Scanner sc = new Scanner(System.in)) {
        Rekening rek = new Rekening();
          while(true){
              System.out.println("Wellcome to ATM");
              System.out.println("pilih 1 untuk menarik");
              System.out.println("pilih 2 untuk menabung");
              System.out.println("pilih 3 untuk mengecek saldo");
              System.out.println("Pilih 4 untuk Transfer");
              System.out.println("Pilih 5 untuk exit");
              System.out.println("Pilih angka sesuai yang anda butuhkan :");
              
              int choice = sc.nextInt();
              switch(choice){
                  case 1:
                      rek.menarik();
                      break;
                  case 2:
                      rek.menabung();
                      break;
                  case 3:
                      rek.cek_saldo();
                      break;
                  case 4:
                      rek.transfer();
                      break;
                  case 5:
                      System.exit(0);
              }
          }
    }
    }
}