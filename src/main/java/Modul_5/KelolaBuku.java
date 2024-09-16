package Modul_5;

import java.util.Scanner;

public class KelolaBuku {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku baru  = ");
        int banyakBuku = in.nextInt();

        Buku[] bukuBaru = new Buku[banyakBuku];

        for (int i = 0; i < bukuBaru.length; i++) {
            System.out.println("\nBuku ke- " + (i + 1));
            System.out.print("Masukkan kode buku      = ");
            String kodeBuku = in.next();
            System.out.print("Masukkan judul          = ");
            String judul = in.next();
            System.out.print("Masukkan tahun terbit   = ");
            int tahunTerbit = in.nextInt();
            System.out.print("Masukkan nama Pengarang = ");
            int daftarpengarang = in.nextInt();

            bukuBaru[i] = new Buku(kodeBuku, judul, tahunTerbit, daftarpengarang);
        }

        System.out.print("\nMasukkan jumlah pengarang = ");
        int banyakPengarang = in.nextInt();

        for (int i = 0; i < banyakPengarang; i++) {
            Pengarang[] penulis = new Pengarang[banyakBuku];
            System.out.print("\nMasukkan NIK         = ");
            String NIK = in.next();
            System.out.print("Masukkan nama          = ");
            String nama = in.next();
            System.out.print("Masukkan alamat        = ");
            String alamat = in.next();

            penulis[i] = new Pengarang(NIK, nama, alamat);
        }

        int max = 0;
        double maxi = bukuBaru[0].getTahunTerbit();
        for (int i = 0; i < bukuBaru.length; i++) {
            if (bukuBaru[i].getTahunTerbit() > maxi) {
                maxi = bukuBaru[i].getTahunTerbit();
                max = i;
            }
        }
        System.out.println("\nBuku terbitan paling akhir = " + bukuBaru[max].getTahunTerbit());

        int min = 0;
        double mini = bukuBaru[0].getTahunTerbit();
        for (int i = 0; i < bukuBaru.length; i++) {
            if (bukuBaru[i].getTahunTerbit() < mini) {
                mini = bukuBaru[i].getTahunTerbit();
                min = i;
            }
        }
        System.out.println("\nBuku terbitan paling awal = " + bukuBaru[min].getTahunTerbit());
        System.out.println("\nJumlah buku berdasarkan tahun");
        System.out.print("Masukkan tahun yang dicari = ");
        int tahun = in.nextInt();
        
        int banyakTahun = 0;
        for (int j = 0; j < banyakBuku; j++) {
            if (bukuBaru[j].getTahunTerbit() == tahun) {
                banyakTahun++;
            }
        }
        System.out.println("\nJumlah buku = " + banyakTahun);
    }
}
