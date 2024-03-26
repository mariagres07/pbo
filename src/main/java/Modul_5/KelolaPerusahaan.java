package Modul_5;

import java.util.Scanner;
import Modul_2.Pegawai;

/*
Sudah lumayan bagus akan tapi akan lebih bagus lagi jika
membuat statement if-else agar tidak ada data yang kosong dan
integer yang melebihi atau kurang dari menu dan persyaratan menu.

Km gak pakai class Perusahaan.java
pakaiii
 */
public class KelolaPerusahaan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan data jumlah pegawai = ");
        int jumlahPegawai = in.nextInt();

        Pegawai[] kerja = new Pegawai[jumlahPegawai];

        for (int i = 0; i < kerja.length; i++) {
            System.out.println("");
            System.out.print("Masukkan npp                     = ");
            String npp = in.next();
            System.out.print("Masukkan nama                    = ");
            String nama = in.next();
            System.out.print("Masukkan golongan ( 1 hingga 3)  = ");
            int golongan = in.nextInt();
            System.out.println("Status : ");
            System.out.println("0.Tidak menikah ");
            System.out.println("1. Menikah");
            System.out.print("Masukkan status                  = ");
            int status = in.nextInt();
            System.out.print("Masukkan jumlah anak             = ");
            int jumlahAnak = in.nextInt();

            kerja[i] = new Pegawai(npp, nama, golongan, status, jumlahAnak);

        }

        Perusahaan kantor = new Perusahaan("Gramedia", "Jakarta", "Pemerintah", "128213518");

        kantor.getalamat();
        kantor.getnamaPerusahaan();
        kantor.getdaftarPegawai();
        kantor.getpemilik();
        kantor.getNPWP();

        for (int i = 0; i < kerja.length; i++) {
            System.out.println("");
            System.out.println("Data pegawai ke-" + (i + 1) + " ");
            System.out.println("Nama            = " + kerja[i].getnama());
            System.out.println("Gaji pokok      = " + kerja[i].hitungGajiPokok());
        }

        int max = 0;
        double maxi = kerja[0].hitungGajiPokok();
        for (int i = 0; i < kerja.length; i++) {
            if (kerja[i].hitungGajiPokok() > maxi) {
                maxi = kerja[i].hitungGajiPokok();
                max = i;
            }

        }
        System.out.println("");
        System.out.println("Gaji pokok terbesar = " + kerja[max].getnama());

        int min = 0;
        double mini = kerja[0].hitungGajiPokok();
        for (int i = 0; i < kerja.length; i++) {
            if (kerja[i].hitungGajiPokok() < mini) {
                mini = kerja[i].hitungGajiPokok();
                min = i;
            }

        }
        System.out.println("");
        System.out.println("Gaji pokok terkecil = " + kerja[min].getnama());

        double gaji = 0;
        for (int i = 0; i < kerja.length; i++) {
            gaji += kerja[i].hitungGajiPokok();
        }
        double rataRata = gaji / jumlahPegawai;
        System.out.println("");
        System.out.println("Rata-rata gaji pokok = " + (int) rataRata);
    }

}
