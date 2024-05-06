package Modul_7;

import Modul_4.Mahasiswa;

public class Mahasiswa2 extends Mahasiswa{

    public Mahasiswa2(String nim, String nama, String tanggalLahir, double uts1, double uts2, double uas) {
        super(nim, nama, tanggalLahir, uts1, uts2, uas);
    }

    //digunakan untuk menentukan nilai huruf dengan mendeklarasikan variabel nilaiAkhir dengan tipe data double 
    //dan nilainya sama dengan nilai dari method hitungFinal() dari class Mahasiswa. kemudian, mendeklarasikan variabel nilaiHuruf
    //dengan tipe data String yang bernilai null. terdapat penggunaan if-else untuk menggolongkan suatu nilai termasuk 
    //ke dalam nilai huruf A, B, C, D, atau E. lalu, mengembalikan data dari nilaiHuruf
    public String konversiNilai() {
        double nilaiAkhir = hitungFinal();
        String nilaiHuruf = null;
        if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 85) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 56 && nilaiAkhir < 70) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 56) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir < 45) {
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }
}
