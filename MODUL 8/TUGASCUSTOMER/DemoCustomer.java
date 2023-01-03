package TUGASCUSTOMER;

public class DemoCustomer {
    public static void main(String[] args){
        CustomerData p1 = new CustomerData("Riza", "Magetan", "UI Profesional", 13, 300000);
        CustomerData p2 = new CustomerData("Aji", "Semarang", "Pengangguran", 12, 400000);
        CustomerData p3 = new CustomerData("Abda", "SemarangKota", "Buruh", 13, 500000);
        CustomerData p4 = new CustomerData("abde", "Jepara", "Pilot", 14, 600000);
        CustomerData p5 = new CustomerData("abdi", "Jepara", "Pramugari", 15, 700000);
        CustomerData p6 = new CustomerData("abdu", "Jepara", "Youtuber", 16, 800000);
        CustomerData p7 = new CustomerData("dani", "Jepara", "Desainer", 17, 900000);
        CustomerData p8 = new CustomerData("danis", "Jepara", "Penjait", 18, 1000000);
        CustomerData p9 = new CustomerData("danu", "Jepara", "Penjahat", 19, 1100000);
        CustomerData p10 = new CustomerData("ahmat", "Jepara", "Penghusaha", 20, 1200000);
        
        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();
        p6.print();
        p7.print();
        p8.print();
        p9.print();
        p10.print();
    }
}
