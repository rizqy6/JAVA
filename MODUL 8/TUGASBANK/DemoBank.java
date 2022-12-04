package TUGASBANK;

public class DemoBank {
    public static void main(String[] args) throws Exception {
       Bank bank = new Bank();
       BankPribadi bpribadi = new BankPribadi();
       BankUmum bumum = new BankUmum();
       BankPasar bpasar = new BankPasar();
       BankSyariah bsyariah = new BankSyariah();


       System.out.println("Bank: " + bank.rasioBunga(10));
       System.out.println("Bank Pribadi: " + bpribadi.rasioBunga(30));
       System.out.println("Bank Umum: " + bumum.rasioBunga(40));
       System.out.println("Bank Pasar: " + bpasar.rasioBunga(20));
       System.out.println("Bank Syariah: " + bsyariah.rasioBunga(2));
    }
}