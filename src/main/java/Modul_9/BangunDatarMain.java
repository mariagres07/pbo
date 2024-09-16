package Modul_9;

import java.util.Scanner;

public class BangunDatarMain {

    public static void main(String[] args) {
        int pilih;
        Scanner in = new Scanner(System.in);
        
        //meminta masukan banyak bangun datar yang akan diproses
        System.out.print("Masukkan banyak bangun datar = ");
        int banyak = in.nextInt();
        
        //mendeklarasikan array bernama "lala" bertipe class BangunDatar[] yang memiliki panjang data "bangunDatar"
        BangunDatar[] lala = new BangunDatar[banyak];

        //perulangan ini dijalankan selama nilai dari i kurang dari panjang array lala 
        //lalu, meminta inputan pilihan dari user dan terdapat if staement untuk meminta inputan data 
        for (int i = 0; i < lala.length; i++) {
            System.out.println();
            System.out.println("Pilih : ");
            System.out.println("1. Segiempat");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.println("4. Keluar");
            System.out.print("masukkan pilihan : ");
            pilih = in.nextInt();
            
            //terdapat if statement yang jika terpenuhi, maka akan meminta inputan user berdasarkan pilihan yang 
            //dipilih oleh user kemudian, data tersebut akan dipakai untuk menghitung nilai luas dan keliling 
            //dari setiap bangun datar yang telah dipilih. kemudian, data tersebut akan disimpan dalam array lala
            //indeks ke-1 pada setiap class yang dipanggil
            if (pilih == 1) {
                System.out.println();
                System.out.print("panjang = ");
                double panjang = in.nextDouble();
                System.out.print("lebar   = ");
                double lebar = in.nextDouble();
                lala[i] = new segiEmpat(panjang, lebar);

            } else if (pilih == 2) {
                System.out.println();
                System.out.print("radius = ");
                double radius = in.nextDouble();
                lala[i] = new Lingkaran(radius);

            } else if (pilih == 3) {
                System.out.println();
                System.out.print("sisi A = ");
                double sisiA = in.nextDouble();
                System.out.print("sisi B = ");
                double sisiB = in.nextDouble();
                System.out.print("sisi C = ");
                double sisiC = in.nextDouble();
                lala[i] = new Segitiga(sisiA, sisiB, sisiC);

            } else if (pilih == 4) {
                break;
            }
        }

        //terdapat perulangan for yang akan mencetak nama bangun datar, luas dan keliling dari bangun datar. dalam perulangan for,
        //terdapat if statement yang menggunakan instanceof untuk membandingkan objek dengan class yang sesuai
        System.out.println();
        System.out.printf("%-15s %-15s %-15s\n", "Bangun Datar", "Luas", "Keliling");
        System.out.println("========================================================");
        for (int i = 0; i < banyak; i++) {
            BangunDatar objek = lala[i];
            System.out.println();
            if (objek instanceof segiEmpat) {
                System.out.printf("%-15s %-15.2f %-15.2f\n", "segiempat", objek.luas(), objek.keliling());
            } else if (objek instanceof Lingkaran) {
                System.out.printf("%-15s %-15.2f %-15.2f\n", "Lingkaran", objek.luas(), objek.keliling());
            } else if (objek instanceof Segitiga) {
                System.out.printf("%-15s %-15.2f %-15.2f\n", "segitiga", objek.luas(), objek.keliling());
            }
        }
    }
}
