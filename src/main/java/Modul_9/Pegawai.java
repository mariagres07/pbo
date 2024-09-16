package Modul_9;

import Modul_10.Email;

public abstract class Pegawai implements Email{

    private int npp;
    private String nama;
    private double gajiPokok;

    public int getNpp() {
        return npp;
    }

    public String getNama() {
        return nama;
    }

    public double getGapok() {
        return gajiPokok;
    }

    public void setNpp(int nopeg) {
        npp = nopeg;
    }

    public void setNama(String nampeg) {
        nama = nampeg;
    }

    public void setGapok(double upah) {
        gajiPokok = upah;
    }

    public abstract String getStatus();

    public abstract double getTunjangan();

    public abstract double hitungGaTot();
}
