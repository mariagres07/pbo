package Modul;

import Modul2.Pegawai;

public class Perusahaan {
     private String namaPerusahaan;
     private String alamat;
     private String pemilik;
     private String NPWP;
     private Pegawai[] daftarPegawai;

    Perusahaan(String namaPerusahaan, String alamat, String pemilik, String NPWP, Pegawai[] daftarPegawai) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.NPWP = NPWP;
        this.daftarPegawai = daftarPegawai;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getNPWP() {
        return NPWP;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    public Pegawai[] getDaftarPegawai() {
        return daftarPegawai;
    }

    public void setDaftarPegawai(Pegawai[] daftarPegawai) {
        this.daftarPegawai = daftarPegawai;
    }
}

//    public void tampilkanDaftarPegawai() {
//        System.out.println("Daftar Pegawai di Perusahaan " + namaPerusahaan + ":");
//        for (Pegawai gaji: daftarPegawai) {
//            System.out.println("Nama: " + Pegawai.getNama() + ", Gaji Pokok: " + Pegawai.getGajiPokok());
//        }
//    }
//
//    public void tampilkanGajiTerbesarTerkecilRataRata() {
//        if (daftarPegawai.length == 0) {
//            System.out.println("Tidak ada pegawai");
//            return;
//        }
//        double gajiTerbesar = Double.MIN_VALUE;
//        double gajiTerkecil = Double.MAX_VALUE;
//        double totalGaji = 0;
//
//        for (Pegawai gajiPegawai : daftarPegawai) {
//            double gajiPokok = gajiPegawai.getGajiPokok();
//            totalGaji += gajiPokok;
//            if (gajiPokok > gajiTerbesar) {
//                gajiTerbesar = gajiPokok;
//            }
//            if (gajiPokok < gajiTerkecil) {
//                gajiTerkecil = gajiPokok;
//            }
//        }
//        double rataRataGaji = totalGaji / daftarPegawai.length;
//
//        System.out.println("Gaji Pokok Terbesar     : " + gajiTerbesar);
//        System.out.println("Gaji Pokok Terkecil     : " + gajiTerkecil);
//        System.out.println("Rata-rata Gaji Pokok    :" + rataRataGaji);
//    }
//
//
