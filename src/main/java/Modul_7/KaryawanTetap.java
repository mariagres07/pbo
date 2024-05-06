package Modul_7;

public class KaryawanTetap extends Karyawan {

    double gajiPokok;//mendeklarasikan variabel gajiPokok dengan tipe data double

    public KaryawanTetap(String nama, int npp, int jumlahAnak, double gajiPokok){
        super(nama, npp, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {//method ini digunakan untuk mengembalikan nilai dari gajiPokok
        return gajiPokok;
    }
    
    //method ini digunakan untuk mengembalikan hasil perhitungan dari gajiTotal ditambah dengan nilai dari tunjanganAnak()
    double gajiTotal() {
        return gajiPokok + tunjanganAnak();
    }
}
