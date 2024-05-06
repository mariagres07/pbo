package Modul_8;

import Modul_7.Karyawan;
import Modul_7.KaryawanKontrak;
import Modul_7.KaryawanTetap;

public class KaryawanMain {

    public static void main(String[] args) {
        Karyawan[] orang = new Karyawan[10];

        orang[0] = new KaryawanKontrak("Maria", 235314, 2, 200000, 2);
        orang[1] = new KaryawanTetap("dia", 235314, 2, 200000);

        for (int i = 0; i < orang.length; i++) {
            System.out.println("Nama = " + orang[i].getNama());
            System.out.println("Jenis karyawan = " + orang[i]);

        }

    }
}
