package Modul_5;

public class Buku {

    String kodeBuku;
    String judul;
    int tahunTerbit;
    String daftarPengarang;

    public Buku(String kodeBuku, String judul, int tahunTerbit, String daftarPengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.daftarPengarang = daftarPengarang;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // getTahunTerbit 9 usages sementara method setnya dan konstruktor no usages
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getDaftarPengarang() {
        return daftarPengarang;
    }

    public void setDaftarPengarang(String daftarPengarang) {
        this.daftarPengarang = daftarPengarang;
    }

}
