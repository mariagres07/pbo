package Modul;

public class Pengarang {

    private final int NIK;
    private final String nama;
    private final String alamat;

    public Pengarang(int NIK, String nama, String alamat) {
        this.NIK = NIK;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getNIK() {
        return NIK;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
