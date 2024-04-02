package Modul_6;

import Modul_5.Buku;
import Modul_5.Pengarang;
import java.util.Scanner;

public class modifBuku {
//    Buku[] bukuBaru;
    int banyakBuku;

    public modifBuku(int banyakBuku) {
        this.banyakBuku = banyakBuku;
    }

    public void tambahPengarang(Buku[] bukuBaru) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < bukuBaru.length; i++) {
            System.out.println("\nBuku ke- " + (i + 1));
            System.out.print("Masukkan kode buku      = ");
            String kodeBuku = in.next();
            System.out.print("Masukkan judul          = ");
            String judul = in.next();
            in.nextLine();
            System.out.print("Masukkan tahun terbit   = ");
            int tahunTerbit = in.nextInt();
            System.out.print("Masukkan banyak pengarang = ");
            int banyakPengarang = in.nextInt();

            bukuBaru[i] = new Buku(kodeBuku, judul, tahunTerbit, banyakPengarang);
            for (int j = 0; j < banyakPengarang; j++) {
                Pengarang[] penulis = new Pengarang[banyakBuku];
                System.out.print("\nMasukkan NIK         = ");
                String nik = in.next();
                System.out.print("Masukkan nama          = ");
                String nama = in.next();
                System.out.print("Masukkan alamat        = ");
                String alamat = in.next();
            }
        }
    }

    public void bukuBerdasarkanTahun(Buku[] bukuBaru) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nJumlah buku berdasarkan tahun");
        System.out.print("Masukkan tahun yang dicari = ");
        int tahun = in.nextInt();

        int banyakTahun = 0;
        for(int i = 0; i < bukuBaru.length; i++) {
            if (bukuBaru[i].getTahunTerbit() == tahun) {
                banyakTahun++;
            }
        }
        System.out.println("\njumlah buku = " + banyakTahun);
    }

    public void bukuTerbitanPalingBaru(Buku[] bukuBaru) {
//        Buku[] bukuBaru = new Buku[banyakBuku];
        Scanner in = new Scanner(System.in);
        int max = 0;
        double maxi = bukuBaru[0].getTahunTerbit();
        for (int i = 0; i < bukuBaru.length; i++) {
            if (bukuBaru[i].getTahunTerbit() > maxi) {
                maxi = bukuBaru[i].getTahunTerbit();
                max = i;
            }
        }
        System.out.println("\nBuku terbitan paling akhir = " + bukuBaru[max].getTahunTerbit());
    }

    public void bukuTerbitanPalingLama(Buku[] bukuBaru) {
//        Buku[] bukuBaru = new Buku[banyakBuku];
        Scanner in = new Scanner(System.in);
        int min = 0;
        double mini = bukuBaru[0].getTahunTerbit();
        for (int i = 0; i < bukuBaru.length; i++) {
            if (bukuBaru[i].getTahunTerbit() < mini) {
                mini = bukuBaru[i].getTahunTerbit();
                min = i;
            }
        }
        
        System.out.println("\nBuku terbitan paling awal = " + bukuBaru[min].getTahunTerbit());
    }
}
