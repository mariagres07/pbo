//package Modul_6;
//
//import Modul_2.Pegawai;
//import Modul_5.Perusahaan;
//import java.util.Scanner;
//
//public class tes {
//
//    public static void main(String[] args) {
//        
//    }public static int statusPegawai() {
//        Scanner in = new Scanner(System.in);
//        int status;
//        do {
//            System.out.println("Status : ");
//            System.out.println("0.Tidak menikah ");
//            System.out.println("1. Menikah");
//            System.out.print("Masukkan status                     = ");
//            status = in.nextInt();
//        } while (status != 1 && status != 0);
//
//        System.out.print("Masukkan jumlah anak                = ");
//        int jumlahAnak = in.nextInt();
//
////        kerja[i] = new Pegawai(npp, nama, golongan, status, jumlahAnak);
//        return status;
//    
//    } public static void dataPerusahaan() {
//        Perusahaan kantor = new Perusahaan("Gramedia", "Jakarta", "Pemerintah", "128213518");
//
//        kantor.getalamat();
//        kantor.getnamaPerusahaan();
//        kantor.getdaftarPegawai();
//        kantor.getpemilik();
//        kantor.getnpwp();
//    }
//
//    public static void dataPegawai(Pegawai[] Pegawai) {
//        for (int i = 0; i < Pegawai.length; i++) {
//            System.out.println();
//            System.out.println("Data pegawai ke-" + (i + 1) + " ");
//            System.out.println("Nama            = " + Pegawai[i].getnama());
//            System.out.println("Gaji pokok      = " + Pegawai[i].hitungGajiPokok());
//        }
//
//    }
//
//    public static void gajiMaks(Pegawai[] Pegawai) {
//        int max = 0;
//        double maxi = Pegawai[0].hitungGajiPokok();
//        for (int i = 0; i < Pegawai.length; i++) {
//            if (Pegawai[i].hitungGajiPokok() > maxi) {
//                maxi = Pegawai[i].hitungGajiPokok();
//                max = i;
//            }
//        }
//        System.out.println();
//        System.out.println("Gaji pokok terbesar = " + Pegawai[max].getnama());
//    }
//
//    public static void gajiMinimal(Pegawai[] Pegawai) {
//        int min = 0;
//        double mini = Pegawai[0].hitungGajiPokok();
//        for (int i = 0; i < Pegawai.length; i++) {
//            if (Pegawai[i].hitungGajiPokok() < mini) {
//                mini = Pegawai[i].hitungGajiPokok();
//                min = i;
//            }
//        }
//        System.out.println();
//        System.out.println("Gaji pokok terkecil = " + Pegawai[min].getnama());
//    }
//
//    public static void rataRataGaji(Pegawai[] Pegawai) {
//        double gaji = 0;
//        for (int i = 0; i < Pegawai.length; i++) {
//            gaji += Pegawai[i].hitungGajiPokok();
//        }
//        double rataRata = gaji / Pegawai.length;
//        System.out.println();
//        System.out.println("Rata-rata gaji pokok = " + (int) rataRata);
//    }
//}
