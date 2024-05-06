/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

import Modul2.Pegawai;


public class Perusahaan {
  
    private String namaPerusahaan;
    private String alamat;
    private String pemilik;
    private String NPWP;
    private Pegawai[] daftarPegawai;
    private int jumlahPegawai;

    Perusahaan(String namaPerusahaan, String alamat, String pemilik, String NPWP, Pegawai[] daftarPegawai) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.NPWP = NPWP;
        this.daftarPegawai = daftarPegawai;
        this.jumlahPegawai = daftarPegawai.length;
    }

    public void tambahPegawai(Pegawai pegawaiBaru) {
        Pegawai[] newArray = new Pegawai[jumlahPegawai + 1];
        for (int i = 0; i < jumlahPegawai; i++) {
            newArray[i] = daftarPegawai[i];
        }
        newArray[jumlahPegawai] = pegawaiBaru;
        daftarPegawai = newArray;
        jumlahPegawai++;
    }

    public double hitungRataGaji() {
        double totalGaji = 0;
        for (Pegawai pegawai : daftarPegawai) {
            totalGaji += pegawai.getGajiPokok();
        }
        return totalGaji / jumlahPegawai;
    }

    public Pegawai pegawaiDenganGajiTerbesar() {
        Pegawai pegawaiTerbesar = daftarPegawai[0];
        for (int i = 1; i < jumlahPegawai; i++) {
            if (daftarPegawai[i].getGajiPokok() > pegawaiTerbesar.getGajiPokok()) {
                pegawaiTerbesar = daftarPegawai[i];
            }
        }
        return pegawaiTerbesar;
    }

}


