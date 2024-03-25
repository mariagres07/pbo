package Modul_5;

import java.util.Scanner;

public class KelolaBuku {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan jumlah buku baru = ");
        int banyakBuku = in.nextInt();

        Buku[] bukuBaru = new Buku[banyakBuku];

        for (int i = 0; i < bukuBaru.length; i++) {
            System.out.println("");
            System.out.println("Masukkan kode buku = ");
            String kodeBuku = in.next();
            System.out.println("Masukkan judul buku = ");
            System.out.print("Masukkan judul            = ");
            String judul = in.next();
            System.out.print("Masukkan nama pengarang   = ");
            String namaPengarang = in.next();
            System.out.print("Masukkan tahun terbit     = ");
            String tahunTerbit = in.next();
        }

        System.out.println("Masukkan jumlah pengarang = ");
        int banyakPengarang = in.nextInt();

        for (int i = 0; i < banyakPengarang; i++) {
            System.out.println("");
            System.out.println("Masukkan NIK  = ");
            int nik = in.nextInt();
            System.out.println("Masukkan nama = ");
            String nama = in.next();
            System.out.println("Masukkan alamat = ");
            String alamat = in.next();
        }

        int max = 0;
        double maxi = bukuBaru[0].getTahunTerbit();
        for (int i = 0; i < bukuBaru.length; i++) {
            if (bukuBaru[i].getTahunTerbit() > maxi) {
                maxi = bukuBaru[i].getTahunTerbit();
                max = i;
            }

        }
        System.out.println("");
        System.out.println("Gaji pokok terbesar = " + bukuBaru[max].getTahunTerbit());

        int min = 0;
        double mini = bukuBaru[0].getTahunTerbit();
        for (int i = 0; i < bukuBaru.length; i++) {
            if (bukuBaru[i].getTahunTerbit() < mini) {
                mini = bukuBaru[i].getTahunTerbit();
                min = i;
            }
            System.out.println("Jumlah buku berdasarkan tahun");
            System.out.print("Masukkan tahun yang dicari = ");
            int tahun = in.nextInt();

            int banyakTahun = 0;

            for (int a = 0; a < banyakBuku; a++) {
                if (bukuBaru[a].getTahunTerbit() == tahun) {
                    banyakTahun++;
                }
            }
            System.out.println("");
            System.out.println("Gaji pokok terkecil = " + bukuBaru[min].getTahunTerbit());

        }
    }
}
