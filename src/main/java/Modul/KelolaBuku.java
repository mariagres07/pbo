package Modul;

import java.util.Scanner;

public class KelolaBuku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku baru  : ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine();

        Buku[] daftarBuku = new Buku[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nBuku ke-" + (i + 1));

            System.out.print("Masukkan kode buku        : ");
            String kodeBuku = scanner.nextLine();

            System.out.print("Masukkan judul buku       : ");
            String judul = scanner.nextLine();

            System.out.print("Masukkan tahun terbit     : ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Masukkan jumlah pengarang : ");
            int jumlahPengarang = scanner.nextInt();
            scanner.nextLine();

            Pengarang[] daftarPengarang = new Pengarang[jumlahPengarang];
            for (int j = 0; j < jumlahPengarang; j++) {
                System.out.println("\nData Pengarang ke-" + (j + 1));
                System.out.print("Masukkan NIK              : ");
                int NIK = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Masukkan nama pengarang   : ");
                String namaPengarang = scanner.nextLine();

                System.out.print("Masukkan alamat pengarang : ");
                String alamatPengarang = scanner.nextLine();

                daftarPengarang[j] = new Pengarang(NIK, namaPengarang, alamatPengarang);
            }

            daftarBuku[i] = new Buku(kodeBuku, judul, tahunTerbit, daftarPengarang);
        }

        System.out.println("\nData Buku dan Pengarang:");
        for (Buku buku : daftarBuku) {
            System.out.println("Kode Buku: " + buku.getKodeBuku());
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
            System.out.println("Daftar Pengarang:");
            for (Pengarang pengarang : buku.getDaftarPengarang()) {
                System.out.println("- NIK    : " + pengarang.getNIK());
                System.out.println("  Nama   : " + pengarang.getNama());
                System.out.println("  Alamat : " + pengarang.getAlamat());
            }
            System.out.println();
        }

        System.out.print("Masukkan tahun yang ingin dicari : ");
        int tahunCari = scanner.nextInt();
        
        int jumlah = 0;
        for (Buku buku : daftarBuku) {
            if (buku.getTahunTerbit() == tahunCari) {
                jumlah++;
            }
        }
//        int jumlahBukuTahunCari = hitungBukuTahun(daftarBuku, tahunCari);
        System.out.println("Jumlah buku diterbitkan pada tahun " + tahunCari + " adalah : " + jumlah);

//        Buku bukuTerlama = cariBukuTerlama(daftarBuku);
        Buku bukuTerlama = daftarBuku[0];
        for (int i = 1; i < daftarBuku.length; i++) {
            if (daftarBuku[i].getTahunTerbit() < bukuTerlama.getTahunTerbit()) {
                bukuTerlama = daftarBuku[i];
            }
        }
        System.out.println("Buku terbitan paling lama:");
        System.out.println("Kode Buku    : " + bukuTerlama.getKodeBuku());
        System.out.println("Judul        : " + bukuTerlama.getJudul());
        System.out.println("Tahun Terbit : " + bukuTerlama.getTahunTerbit());

//        Buku bukuTerakhir = cariBukuTerakhir(daftarBuku);
        Buku bukuTerakhir = daftarBuku[0];
        for (int i = 1; i < daftarBuku.length; i++) {
            if (daftarBuku[i].getTahunTerbit() > bukuTerakhir.getTahunTerbit()) {
                bukuTerakhir = daftarBuku[i];
            }
        }
        System.out.println("\nBuku terbitan paling akhir:");
        System.out.println("Kode Buku    : " + bukuTerakhir.getKodeBuku());
        System.out.println("Judul        : " + bukuTerakhir.getJudul());
        System.out.println("Tahun Terbit : " + bukuTerakhir.getTahunTerbit());

    }
}
