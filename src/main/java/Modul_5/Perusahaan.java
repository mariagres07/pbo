package Modul_5;

import Modul_2.Pegawai;

public class Perusahaan {

    String namaPerusahaan, alamat, pemilik, NPWP, daftarPegawai;
    Pegawai[] Pegawai;

    public Perusahaan(String namaPerusahaan, String alamat, String pemilik, String NPWP) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.NPWP = NPWP;

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

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    public String getNPWP() {
        return NPWP;
    }

    public void setdaftarPegawai(Pegawai[] Pegawai) {
        this.Pegawai = Pegawai;
    }

    public Pegawai[] getdaftarPegawai() {
        return Pegawai;
    }
}
