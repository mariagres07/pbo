package Modul_7;

public class Karyawan {

    int npp, jumlahAnak;//mendeklarasikan variabel npp dan jumlahAnak dengan tipe data integer
    String nama;//mendeklarasikan variabel nama dengan tipe data String
    static double subsidiPerAnak = 100000;//mendeklarasikan variabel subsidiPerAnak dengan tipe data static double, kemudian menginisialisasikannya dengan nilai 100000

    public Karyawan(String nama, int npp, int jumlahAnak) {
        this.nama = nama;
        this.npp = npp;
        this.jumlahAnak = jumlahAnak;
    }

    public int getNpp() {//method ini digunakan untuk mengembalikan nilai dari npp
        return npp;
    }

    public String getNama() {//method ini digunakan untuk mengembalikan data dari nama
        return nama;
    }

    public int getJumlahAnak() {//method ini digunakan untuk mengembalikan nilai dari jumlahAnak
        return jumlahAnak;
    }

    public static double getSubsidiPerAnak() {//method ini digunakan untuk mengembalikan nilai dari subsidiPerAnak
        return subsidiPerAnak;
    }

    double tunjanganAnak() {//method ini digunakan untuk mengembalikan hasil perhtitungan dari tunjanganAnak
        return jumlahAnak * subsidiPerAnak;
    }
}
