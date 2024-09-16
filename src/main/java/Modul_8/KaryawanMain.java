package Modul_8;

import Modul_7.Karyawan;
import Modul_7.KaryawanKontrak;
import Modul_7.KaryawanTetap;

public class KaryawanMain {

    public static void main(String[] args) {
        Karyawan[] pekerja = new Karyawan[4];
        pekerja[0] = new KaryawanKontrak("Jaemin", 247132, 0, 40000, 9);
        pekerja[1] = new KaryawanKontrak("Jeno", 245524, 0, 300000, 19);
        pekerja[2] = new KaryawanTetap("Jaehyun", 234325, 0, 2000000);
        pekerja[3] = new KaryawanTetap("Jisung", 235353, 0, 3000000);

        for (int i = 0; i < pekerja.length; i++) {
            if (pekerja[i] instanceof KaryawanKontrak kontrak) {
                System.out.println();
                System.out.println("Nama           = " + pekerja[i].getNama());
                System.out.println("Jenis karyawan = Kontrak");
                System.out.println("Upah total     = " + kontrak.upahTotal());

            } else if (pekerja[i] instanceof KaryawanTetap tetap) {
                System.out.println();
                System.out.println("Nama           = " + pekerja[i].getNama());
                System.out.println("Jenis karyawan = Tetap");
                System.out.println("Gaji total     = " + tetap.gajiTotal());
            }
        }
        System.out.println();
        System.out.println("Karyawan Kontrak dengan upah tinggi: ");
        for (int i = 0; i < pekerja.length; i++) {
            if (pekerja[i] instanceof KaryawanKontrak kontrak2) {
                System.out.println();
                double upahPembanding = kontrak2.upahTotal();
                if (upahPembanding <= 1000000) {
                    System.out.println("Nama           = " + pekerja[i].getNama());
                    System.out.println("Jenis karyawan = Kontrak");
                    System.out.println("upah total     = " + kontrak2.upahTotal());
                }
            }
        }
    }
}
