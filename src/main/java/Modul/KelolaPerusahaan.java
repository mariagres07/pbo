package Modul;

import Modul2.Pegawai;
import java.util.Scanner;

public class KelolaPerusahaan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama perusahaan   : ");
        String namaPerusahaan = scanner.nextLine();
        System.out.print("Masukkan alamat perusahaan : ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan nama pemilik      : ");
        String pemilik = scanner.nextLine();
        System.out.print("Masukkan NPWP perusahaan   : ");
        String NPWP = scanner.nextLine();
        System.out.println();
        System.out.print("Masukkan jumlah pegawai    : ");
        int jumlahPegawai = scanner.nextInt();
        scanner.nextLine();

        Pegawai[] orang = new Pegawai[jumlahPegawai];

        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.print("Masukkan nama pegawai ke-" + (i + 1) + "  : ");
            String namaPegawai = scanner.nextLine();
            System.out.print("Masukkan gaji pokok pegawai : ");
            int gol = scanner.nextInt();
            scanner.nextLine();

            orang[i] = new Pegawai(NPWP, namaPegawai,gol, true, jumlahPegawai);
        }

        Perusahaan perusahaan = new Perusahaan(namaPerusahaan, alamat, pemilik, NPWP, orang);

        System.out.println("\nDaftar Pegawai :");
        System.out.println("Daftar Pegawai di Perusahaan " + namaPerusahaan + ": ");
        for (int i = 0; i < orang.length; i++) {
            System.out.println("Nama : " + orang[i].getNama() + ", Gaji Pokok : " + orang[i].hitungGajiPokok());
        }
        if (orang.length == 0) {
            System.out.println("Tidak ada pegawai");
            return;
        }
        double gajiTerbesar = Double.MIN_VALUE;
        double gajiTerkecil = Double.MAX_VALUE;
        double totalGaji = 0;

        for (Pegawai gajiPegawai : orang) {
            double gajiPokok = gajiPegawai.hitungGajiPokok();
            totalGaji += gajiPokok;
            if (gajiPokok > gajiTerbesar) {
                gajiTerbesar = gajiPokok;
            }
            if (gajiPokok < gajiTerkecil) {
                gajiTerkecil = gajiPokok;
            }
        }
        double rataRataGaji = totalGaji / orang.length;
        System.out.println();
        System.out.println("Gaji Pokok Terbesar     : " + gajiTerbesar);
        System.out.println("Gaji Pokok Terkecil     : " + gajiTerkecil);
        System.out.println("Rata-rata Gaji Pokok    : " + rataRataGaji);
    }
}
