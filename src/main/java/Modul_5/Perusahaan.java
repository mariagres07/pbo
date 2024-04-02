package Modul_5;

import Modul_2.Pegawai;

import java.util.Scanner;

public class Perusahaan {

    Scanner in = new Scanner(System.in);
    String namaPerusahaan;
    String alamat;
    String pemilik;
    String npwp;
    Pegawai[] pegawai;

    public Perusahaan(String namaPerusahaan, String alamat, String pemilik, String npwp) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.npwp = npwp;
    }

    public void setnamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getnamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getalamat() {
        return alamat;
    }

    public void setpemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getpemilik() {
        return pemilik;
    }

    public void setnpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getnpwp() {
        return npwp;
    }

    public void setDaftarPegawai(Pegawai[] pegawai) {
        this.pegawai = pegawai;
    }

    public Pegawai[] getDaftarPegawai() {
        return this.pegawai;
    }

    public void tambahPegawai() {
        int status;
        int golongan;
    }
}
