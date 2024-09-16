package Modul_9;

import java.util.Scanner;

public class AnugrahBangunDatarDariKostKrisna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrayBesaran;

        System.out.println();
        System.out.println("Selamat Datang!");
        System.out.print("Masukkan Banyaknya Bangun Datar Yang Ingin Anda Masukkan:");
        arrayBesaran = input.nextInt();
        BangunDatar[] gambarBocah = new BangunDatar[arrayBesaran];

        System.out.println();
        for (int i = 0; i < gambarBocah.length; i++) {
            System.out.println("""
                    Pilih bangun datar yang ingin anda masukkan datanya
                    1. Persegi
                    2. Segitiga
                    3. Lingkaran
                    4. Keluar""");
            System.out.print("Pilihan Anda : ");
            int pilih = input.nextInt();

            
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan panjang dan lebar persegi:");
                    System.out.print("Panjang: ");
                    double panjangPersegi = input.nextDouble();
                    System.out.print("Lebar: ");
                    double lebarPersegi = input.nextDouble();
                    gambarBocah[i] = new segiEmpat(panjangPersegi, lebarPersegi);
                    break;
                case 2:
                    System.out.println("Masukkan Besaran Sisi Segitiga:");
                    System.out.print("sisi 1: ");
                    double sisi1 = input.nextDouble();
                    System.out.print("sisi 2: ");
                    double sisi2 = input.nextDouble();
                    System.out.print("sisi 3: ");
                    double sisi3 = input.nextDouble();
                    gambarBocah[i] = new Segitiga(sisi1, sisi2, sisi3);
                    break;
                case 3:
                    System.out.println("Masukkan radius lingkaran:");
                    System.out.print("Radius: ");
                    double radius = input.nextDouble();
                    gambarBocah[i] = new Lingkaran(radius);
                    break;
                case 4:
                    i = gambarBocah.length;
                    break;
                default:
                    System.out.println("Pilihan salah, Coba lagi");
                    i--;
                    break;
            }
        }

        System.out.printf("%-15s %-15s %-15s\n", "Bangun Datar", "Keliling", "Luas");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < arrayBesaran; i++) {
            if (gambarBocah[i] != null) {
                BangunDatar bd = gambarBocah[i];
                if (bd instanceof segiEmpat) {
                    System.out.printf("%-15s %-15.2f %-15.2f\n", "Segi Empat", bd.keliling(), bd.luas());
                } else if (bd instanceof Lingkaran) {
                    System.out.printf("%-15s %-15.2f %-15.2f\n", "Lingkaran", bd.keliling(), bd.luas());
                } else if (bd instanceof Segitiga) {
                    System.out.printf("%-15s %-15.2f %-15.2f\n", "Segitiga", bd.keliling(), bd.luas());
                }
            }
        }
    }
}
