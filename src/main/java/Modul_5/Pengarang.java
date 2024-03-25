package Modul_5;

public class Pengarang {

    String NIK;
    String nama;
    String alamat;

    public Pengarang(String NIK, String nama, String alamat) {
        this.NIK = NIK;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
