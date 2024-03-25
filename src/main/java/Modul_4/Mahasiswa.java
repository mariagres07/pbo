package Modul_4;

public class Mahasiswa {

    String nim, nama, tanggalLahir;
    double uts1, uts2, uas;

    public Mahasiswa(String nim, String nama, String tanggalLahir, double uts1, double uts2, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas = uas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void settanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String gettanggalLahir() {
        return tanggalLahir;
    }

    public void setuts1(double uts1) {
        this.uts1 = uts1;
    }

    public double getuts1() {
        return uts1;
    }

    public void setuts2(double uts2) {
        this.uts2 = uts2;
    }

    public double getuts2() {
        return uts2;
    }

    public void setuas(double uas) {
        this.uas = uas;
    }

    public double getuas() {
        return uas;
    }

    public double hitungFinal() {
        double nilaiFinal = (((30.0 / 100) * getuts1()) + ((30.0 / 100) * getuts2()) + ((40.0 / 100) * getuas()));
        return nilaiFinal;
    }

    public String konversiNilai() {
        double nilaiAkhir = hitungFinal();
        String nilaiHuruf = null;
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
           nilaiHuruf =  "A";
        } else if (nilaiAkhir >= 65 &&  nilaiAkhir< 80) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 55 && nilaiAkhir < 65) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 55) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir < 45) {
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }
}
