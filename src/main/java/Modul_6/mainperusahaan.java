package Modul_6;

import Modul_5.Perusahaan;
import Modul_2.Pegawai;
import java.util.Scanner;

public class mainPerusahaan {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nama Perusahaan    = ");
        String namaPerusahaan = in.nextLine();
        System.out.print("Alamat Perusahaan  = ");
        String alamatPerusahaan = in.nextLine();
        System.out.print("Pemilik            = ");
        String pemilik = in.nextLine();
        System.out.print("NPWP               = ");
        String npwp = in.nextLine();
        System.out.print("Jumlah Pegawai     = ");
        int jumlahPegawai = in.nextInt();
        
        Perusahaan kantor = new Perusahaan(namaPerusahaan, alamatPerusahaan, pemilik, npwp);

        kantor.getalamat();
        kantor.getnamaPerusahaan();
        kantor.getDaftarPegawai();
        kantor.getpemilik();
        kantor.getnpwp();
        
        Pegawai[] pgw  = new Pegawai[jumlahPegawai];
        
        modifPerusahaan mp = new modifPerusahaan(jumlahPegawai);
        mp.pegawaiData(pgw);
        mp.dataPegawai(pgw);
        mp.gajiMaks(pgw);
        mp.rataRataGaji(pgw);
    }
}
