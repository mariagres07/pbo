package Modul_6;

import java.util.Scanner;

public class mainSegitiga {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah segitiga = ");
        int jumlahSegitiga = in.nextInt();
        
        KumpulanSegitiga[] daftarSegitiga = new KumpulanSegitiga[jumlahSegitiga];
        
        for (int i = 0; i < jumlahSegitiga; i++) {
            System.out.println();
            System.out.println("Segitiga ke-" + (i + 1) + " = ");
            System.out.print("x1 = ");
            double x1 = in.nextDouble();
            System.out.print("y1 = ");
            double y1 = in.nextDouble();
            System.out.print("x2 = ");
            double x2 = in.nextDouble();
            System.out.print("y2 = ");
            double y2 = in.nextDouble();
            System.out.print("x3 = ");
            double x3 = in.nextDouble();
            System.out.print("y3 = ");
            double y3 = in.nextDouble();
            
            daftarSegitiga[i] = new KumpulanSegitiga(x1, y1, x2, y2, x3, y3);
        }

        KumpulanSegitiga.rataRata(daftarSegitiga);
        KumpulanSegitiga.terkecil(daftarSegitiga);
        KumpulanSegitiga.terluas(daftarSegitiga);
    }
}
