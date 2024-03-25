package Modul_4;

import java.util.Scanner;

public class KelolaBuku {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan banyak buku baru = ");
        int bukuBaru = in.nextInt();

        int jumlahbuku = 0;
        int banyakPengarang = 0;

        Buku[] bukuJaemin = new Buku[bukuBaru];

        for (int i = 0; i < bukuBaru; i++) {
            System.out.println("");
            System.out.println("Masukkan data buku ke-" + (i + 1));
            System.out.print("Masukkan kode buku        = ");
            String kodeBuku = in.next();
            System.out.print("Masukkan judul            = ");
            String judul = in.next();
            System.out.print("Masukkan tahun terbit     = ");
            String tahunTerbit = in.next();
            System.out.print("Masukkan nama pengarang   = ");
            String namaPengarang = in.next();

            Buku databuku = new Buku(kodeBuku, judul, tahunTerbit, namaPengarang);
            bukuJaemin[i] = databuku;

        }
        System.out.println("");
        for (int i = 0; i < jumlahbuku; i++) {
            System.out.println("Data buku ke-" + (i + 1) + " ");
            System.out.println("Kode buku      = " + bukuJaemin[i].getKodeBuku());
            System.out.println("Judul buku     = " + bukuJaemin[i].getJudul());
            System.out.println("Tahun terbit   = " + bukuJaemin[i].gettahunTerbit());
            System.out.println("Nama pengarang = " + bukuJaemin[i].getnamaPengarang());

        }
        System.out.println("");
        System.out.println("Cari buku berdasarkan tahun");
        System.out.print("Masukkan tahun yang dicari = ");
        String tahun = in.next();

        int banyakTahun = 0;

        for (int i = 0; i < bukuBaru; i++) {
            if (bukuJaemin[i].gettahunTerbit().equals(tahun)) {
                banyakTahun++;
            }

        }
        System.out.println("Jumlah buku pada tahun " + tahun + " = " + banyakTahun);

        System.out.println("");
        System.out.println("Cari buku berdasarkan pengarang");
        System.out.print("Masukkan pengarang yang dicari = ");
        String pengarang = in.next();

        for (int i = 0; i < bukuBaru; i++) {
            if (bukuJaemin[i].getnamaPengarang().equals(pengarang)) {
                System.out.println("Judul buku     = " + bukuJaemin[i].getJudul());
                System.out.println("Kode buku      = " + bukuJaemin[i].getKodeBuku());
                System.out.println("Tahun terbit   = " + bukuJaemin[i].gettahunTerbit());
                System.out.println("Nama pengarang = " + bukuJaemin[i].getnamaPengarang());

            }

        }

    }
}
