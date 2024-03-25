package Modul_3;//deklarasi package Modul_3

public class Penerbit {//deklarasi class Penerbit

    String namaPenerbit;
    String alamat;
    int tahunberdiri;

    public Penerbit(String namaPenerbit, String alamat, int tahunberdiri) {
        this.namaPenerbit = namaPenerbit;
        this.alamat = alamat;
        this.tahunberdiri = tahunberdiri;
    }

    public void setnamaPenerbit(String namaPenerbit) {

    }

    public String getnamaPenerbit() {
        return namaPenerbit;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getalamat() {
        return alamat;
    }

    public void settahunBerdiri(int tahunberdiri) {
        this.tahunberdiri = tahunberdiri;
    }

    public int gettahunBerdiri() {
        return tahunberdiri;
    }

}
