package Modul_7;

public class KaryawanKontrak extends Karyawan {

    double upahHarian;//mendeklarasikan variabel upahHarian dengan tipe data double
    int jumlahHariMasuk;//mendeklarasikan variabel jumlahHariMasuk dengan tipe data integer

    //Keyword super bertujuan untuk menggunakan method yang terdapat pada Super Class atau class Karyawan
    public KaryawanKontrak(String nama, int npp, int jumlahAnak, double upahHarian, int jumlahHariMasuk) {
        super(nama, npp, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public int getJumlahHariMasuk() {//method ini digunakan untuk mengembalikan nilai dari jumlahHariMasuk
        return jumlahHariMasuk;
    }

    public double getUpahHarian() {//method ini digunakan untuk mengembalikan nilai dari upahHarian 
        return upahHarian;
    }

    public double upahTotal() {//method ini digunakan untuk mengembalikan hasil perhitungan dari method upahTotal()
        return (upahHarian * jumlahHariMasuk) + tunjanganAnak();
    }
}
