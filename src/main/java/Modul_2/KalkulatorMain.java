package Modul_2;//deklarasi package Modul_2

import java.util.Scanner;

public class KalkulatorMain {//deklarasi class KalkulatorMain
    public static void main(String[] args) {//deklarasi class sebagai metode utama
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka 1 = ");
        int angka1 = in.nextInt();
        
         System.out.print("Masukkan angka 2 = ");
        int angka2 = in.nextInt();
        
        Kalkulator kalku1 = new Kalkulator(angka1, angka2);//menyimpan data ke dalam objek kalku1
        System.out.println("Penjumlahan = " + kalku1.jumlah());//mencetak penjumlahan 
        System.out.println("Pengurangan = " + kalku1.kurang());//mencetak pengurangan
        System.out.println("Perkalian = " + kalku1.kali());//mencetak perkalian
        System.out.println("Pembagian = " + kalku1.bagi());//mencetak pembagian

    }
}
