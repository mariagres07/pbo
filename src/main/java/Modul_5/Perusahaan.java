package Modul_5;

import Modul_2.Pegawai;

public class Perusahaan {

    String namaPerusahaan;
    String alamat;
    String pemilik;
    String npwp;
    Pegawai[] Pegawai;

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

    public void npwp(String npwp) {
        this.npwp = npwp;
    }

    public String npwp() {
        return npwp;
    }

    public void setdaftarPegawai(Pegawai[] Pegawai) {
        this.Pegawai = Pegawai;
    }

    public Pegawai[] getdaftarPegawai() {
        return Pegawai;
    }
}
