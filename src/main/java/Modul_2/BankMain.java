package Modul_2;//deklarasi package Modul_2

public class BankMain {//deklarasi class BankMain

    public static void main(String[] args) {//deklarasi class sebagai metode utama
        RekeningBank rekeningBudi;
        rekeningBudi = new RekeningBank("12345");

        System.out.println("Rekening Budi = " + rekeningBudi.cekSaldo());
        
        System.out.println("Menabung Rp50.000");
        rekeningBudi.tabung(50000);

        System.out.println("Rekening Budi sekarang = " + rekeningBudi.cekSaldo());

        System.out.println("Mengambil Rp20.000");
        rekeningBudi.ambil(20000);

        System.out.println("Rekening Budi sekarang = " + rekeningBudi.cekSaldo());
    }
}
