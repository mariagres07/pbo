package Modul_2;//deklarasi package Modul_2

public class Pegawai {//deklarasi class Pegawai

    String npp;
    String nama;
    int golongan;
    int status;
    int jumlahAnak;

    public Pegawai(String npp, String nama, int golongan, int status, int jumlahAnak) {//constructor
        this.npp = npp;
        this.nama = nama;
        this.golongan = golongan;
        this.status = status;
        this.jumlahAnak = jumlahAnak;
    }

    public void setNpp(String npp) {
        this.npp = npp;
    }

    public String getNpp() {
        return npp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public int hitungGajiPokok() {//method yang berisi penggolongan gaji pokok 
        int gajiPokok = 0;

        if (golongan == 1) {
            gajiPokok = 1300000;
        } else if (golongan == 2) {
            gajiPokok = 1750000;
        } else if (golongan == 3) {
            gajiPokok = 2000000;
        }
        return gajiPokok;
    }

    public int hitungTunjanganKeluarga() {//method yang berisi perhitungan tunjangan keluarga
        int tunjangan = 0;

        if (status == 1) {
            tunjangan = 300000 + (jumlahAnak * 100000);
            return tunjangan;
        } else {
            return 0;
        }
    }

    public int hitungGajiTotal() {//method yang berisi perhitungan gaji total dan mengembalikan hasil gajiTotal
        int gajiTotal = hitungGajiPokok() + hitungTunjanganKeluarga();
        return gajiTotal;
    }

    public static void main(String[] args) {//deklarasi class sebagai method utama
        Pegawai orang = new Pegawai("23785", "Jisung", 1, 0, 0);
        
        Pegawai orang1 = new Pegawai("23785", "jaemin", 2, 1, 1);
        
        System.out.println("NPP         = " + orang.getNpp());
        System.out.println("Nama        = " + orang.getNama());
        System.out.println("Gaji pokok  = " + orang.hitungGajiPokok());
        System.out.println("Tunjangan   = " + orang.hitungTunjanganKeluarga());
        System.out.println("Gaji total  = " + orang.hitungGajiTotal());

        System.out.println("");
        System.out.println("NPP         = " + orang1.getNpp());
        System.out.println("Nama        = " + orang1.getNama());
        System.out.println("Gaji pokok  = " + orang1.hitungGajiPokok());
        System.out.println("Tunjangan   = " + orang1.hitungTunjanganKeluarga());
        System.out.println("Gaji total  = " + orang1.hitungGajiTotal());
    }
}
