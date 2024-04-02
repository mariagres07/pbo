package Modul_6;

import Modul_2.Pegawai;

import java.util.Scanner;

public class modifPerusahaan {

    int jumlahPegawai;
    Pegawai[] kerja;

    public modifPerusahaan(int jumlahPegawai) {
        this.jumlahPegawai = jumlahPegawai;
    }

    public  void pegawaiData(Pegawai[] pgw) {
        Scanner in = new Scanner(System.in);
        int golongan = 0;
        for (int i = 0; i < pgw.length; i++) {
            System.out.println();
            System.out.print("Masukkan npp                        = ");
            String npp = in.next();
            System.out.print("Masukkan nama                       = ");
            String nama = in.next();

            do {
                System.out.print("Masukkan golongan ( 1 hingga 3)     = ");
                golongan = in.nextInt();
            } while (golongan != 1 && golongan != 2 && golongan != 3);
            int status;
            do {
                System.out.println("Status : ");
                System.out.println("0.Tidak menikah ");
                System.out.println("1. Menikah");
                System.out.print("Masukkan status                     = ");
                status = in.nextInt();
            } while (status != 1 && status != 0);

            System.out.print("Masukkan jumlah anak                = ");
            int jumlahAnak = in.nextInt();
            pgw[i] = new Pegawai(npp, nama, golongan, status, jumlahAnak);
        }
    }

    public void dataPegawai(Pegawai[] kerja) {
        for (int i = 0; i < kerja.length; i++) {
            System.out.println();
            System.out.println("Data pegawai ke-" + (i + 1) + " ");
            System.out.println("Nama            = " + kerja[i].getnama());
            System.out.println("Gaji pokok      = " + kerja[i].hitungGajiPokok());
        }
    }

    public void gajiMaks(Pegawai[] kerja) {
        int max = 0;
        double maxi = kerja[0].hitungGajiPokok();
        for (int i = 0; i < kerja.length; i++) {
            if (kerja[i].hitungGajiPokok() > maxi) {
                maxi = kerja[i].hitungGajiPokok();
                max = i;
            }
        }
        System.out.println();
        System.out.println("Gaji pokok terbesar = " + kerja[max].getnama());
    }

    public void rataRataGaji(Pegawai[] kerja) {
        double gaji = 0;
        for(int i = 0; i < kerja.length; i++) {
            gaji += kerja[i].hitungGajiPokok();
        }
        double rataRata = gaji / kerja.length;
        System.out.println();
        System.out.println("Rata-rata gaji pokok = " + (int) rataRata);
    }
}
