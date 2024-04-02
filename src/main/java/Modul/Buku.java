package Modul;

public class Buku {
    
    private final String kodeBuku;
    private final String judul;
    private final int tahunTerbit;
    private Pengarang[] daftarPengarang;
    
    Buku (String kodeBuku, String judul, int tahunTerbit, Pengarang[] daftarPengarang){
        this.kodeBuku =kodeBuku;
        this.judul =judul;
        this.tahunTerbit= tahunTerbit;
        this.daftarPengarang=daftarPengarang;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public Pengarang[] getDaftarPengarang() {
        return daftarPengarang;
    }
    
    public void setDaftarPengarang(Pengarang[] daftarPengarang){
        this.daftarPengarang = daftarPengarang;
    }
}

