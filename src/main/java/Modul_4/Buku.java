package Modul_4;

public class Buku {
    String kodeBuku, judul, tahunTerbit, namaPengarang;

    public Buku(String kodeBuku, String judul, String tahunTerbit, String namaPengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.namaPengarang = namaPengarang;
    }
    
    public void setKodeBuku(String kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    public String getKodeBuku(){
        return kodeBuku;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }
    public void settahunTerbit(String tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    public String gettahunTerbit(){
        return tahunTerbit;
    }
    public void setnamaPengarang(String namaPengarang){
        this.namaPengarang = namaPengarang;
    }
    public String getnamaPengarang(){
        return namaPengarang;
    }
}
