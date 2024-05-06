package Modul_7;

import java.util.Scanner;

public class karyawanMain {
    public static void main(String[] args) {
        //menyimpan data karyawan tetap pada objek yang telah dibuat dengan mengisi data sesuai dengan parameter yaitu nama, npp, jumlahAnak, dan gajiPokok. 
        //mencetak data karyawan tetap dengan memanggil method getNama(), getNpp(), getJumlahAnak(), getGajiPokok(). Kemudian, memanggil hasil 
        //perhitungan method tunjanganAnak() dan gajiTotal()
        KaryawanTetap tetap = new KaryawanTetap("jaemin", 2371, 2, 1000000);
        System.out.println("Nama            = " + tetap.getNama());
        System.out.println("NPP             = " + tetap.getNpp());
        System.out.println("Jumlah anak     = " + tetap.getJumlahAnak());
        System.out.println("Tunjangan anak  = " + tetap.tunjanganAnak());
        System.out.println("Gaji pokok      = " + tetap.getGajiPokok());
        System.out.println("Gaji total      = " + tetap.gajiTotal());

        //meminta masukan jumlah hari masuk karyawan kontrak per bulannya yang kemudian akan disimpan dalam variabel jumlahHariMasuk yang bertipe data integer
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah hari masuk per bulan = ");
        int jumlahHariMasuk = in.nextInt();

        //menyimpan data karyawan tetap pada objek yang telah dibuat dengan mengisi data sesuai dengan parameter yaitu nama, npp, jumlahAnak, 
        //upah harian, dan jumlah hari masuk mencetak data karyawan tetap dengan memanggil method getNama(), getNpp(), getJumlahAnak(), 
        //getUpahHarian(), dan getJumlahHariMasuk(). Kemudian, memanggil hasil perhitungan method upahTotal()
        KaryawanKontrak kontrak = new KaryawanKontrak("jeno", 1323, 1, 150000, jumlahHariMasuk);
        System.out.println();
        System.out.println("Nama              = " + kontrak.getNama());
        System.out.println("NPP               = " + kontrak.getNpp());
        System.out.println("Jumlah anak       = " + kontrak.getJumlahAnak());
        System.out.println("Upah harian       = " + kontrak.getUpahHarian());
        System.out.println("Jumlah hari masuk = " + kontrak.getJumlahHariMasuk());
        System.out.println("Upah total        = " + kontrak.upahTotal());
    }
}
