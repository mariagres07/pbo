package Modul_3;//deklarasi package Modul_3

public class PenerbitMain {//deklarasi class PenerbitMain

    public static void main(String[] args) {//deklarasi class sebagai method utama
        Penerbit penerbit1 = new Penerbit("Jakarta", "Gramedia", 2005);
        Penerbit penerbit2 = new Penerbit("Jakarta", "Grasindo", 1990);

        Buku buku1 = new Buku("12351", "matahari", "Tere  Liye", 2016, penerbit1);
        Buku buku2 = new Buku("25221", "lighter", "Yung Puebblo", 2024, penerbit2);
        
        System.out.println("Nama buku               = " + buku1.getjudul());
        System.out.println("Kode buku               = " + buku1.getKodeBuku());
        System.out.println("Nama Pengarang          = " + buku1.getnamaPengarang());
        System.out.println("Penerbit                = " + buku1.getPenerbit().getnamaPenerbit());
        System.out.println("Tahun terbit            = " + buku1.gettahunTerbit());
        System.out.println("Alamat penerbit         = " + buku1.getPenerbit().getalamat());
        System.out.println("Tahun Berdiri Penerbit  = " + buku1.getPenerbit().gettahunBerdiri());
        buku1.setcektahun();
        
        System.out.println("");
        System.out.println("Nama buku               = " + buku2.getjudul());
        System.out.println("Kode buku               = " + buku2.getKodeBuku());
        System.out.println("Nama Pengarang          = " + buku2.getnamaPengarang());
        System.out.println("Penerbit                = " + buku2.getPenerbit().getnamaPenerbit());
        System.out.println("Tahun terbit            = " + buku2.gettahunTerbit());
        System.out.println("Alamat penerbit         = " + buku2.getPenerbit().getalamat());
        System.out.println("Tahun Berdiri Penerbit  = " + buku2.getPenerbit().gettahunBerdiri());
        buku2.setcektahun();
    }
}
