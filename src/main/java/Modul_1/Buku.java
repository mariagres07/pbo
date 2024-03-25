package Modul_1;//deklarasi package Modul_1

public class Buku {//deklarasi class Buku

    private String judul;
    private String pengarang;
    private String ISBN;
    private String kategori;

    public Buku(String jdl, String isbn) {//constructor
        judul = jdl;
        ISBN = isbn;
    }

    public void pinjam() {//metode yang berisi perintah pinjam
        System.out.println("Sedang dipinjam");
    }

    public void kembali() {//metode yang berisi perintah kembali
        System.out.println("Sudah dikembalikan");
    }

    public static void main(String[] args) {//deklarasi metode main sebagai metode utama 
        Buku book1 = new Buku("Struktur Data", "1304595");
        book1.pinjam();

        Buku book2 = new Buku("Java Fundamental", "1304300");
        book2.kembali();
    }
}
