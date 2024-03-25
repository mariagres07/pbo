package Modul_3;//deklarasi package Modul_3

public class Buku {//deklarasi class Buku

    String kodeBuku;
    String judul;
    int tahunTerbit;
    String namaPengarang;
    Penerbit penerbit;

    public Buku(String kodeBuku, String judul, String namaPengarang, int tahunTerbit, Penerbit penerbit) {//constructor
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;

    }

    public void setkodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }
    
    public void setnamaPengarang(String namaPengarang){
        this.namaPengarang = namaPengarang;
    }
    
    public String getnamaPengarang(){
        return namaPengarang;
    }
    public void setjudul(String judul) {
        this.judul = judul;
    }

    public String getjudul() {
        return judul;
    }

    public void setPenerbit(Penerbit penerbit) {
        this.penerbit = penerbit;
    }

    public Penerbit getPenerbit() {
        return penerbit;
    }

    public void settahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int gettahunTerbit() {
        return tahunTerbit;
    }

    public void setcektahun() {
        if (gettahunTerbit() >= (2019 + 5)) {
            System.out.println("BUKU BARU");
        } else if ((2019 + 5) > gettahunTerbit()) {
            System.out.println("BUKU LAMA");
        }

    }
}
