package Modul_7;

public class mahasiswaMain {

    public static void main(String[] args) {
        
        //membuat objek baru pada class Mahasiswa1, lalu mengisi data dari parameternya
        //mencetak data dari mahasiswa tersebut dengan memanggil method getter dan konversiNilai() pada objek yang dituju
        Mahasiswa1 orang1 = new Mahasiswa1("42437669", "mark", "08/09/1999", 89, 90, 91);
        System.out.println("--Data mahasiswa s1--");
        System.out.println("Nim           = " + orang1.getNim());
        System.out.println("Nama          = " + orang1.getNama());
        System.out.println("Tanggal lahir = " + orang1.gettanggalLahir());
        System.out.println("Uts 1         = " + orang1.getuts1());
        System.out.println("Uts 2         = " + orang1.getuts2());
        System.out.println("Uas           = " + orang1.getuas());
        System.out.println("Nilai final   = " + orang1.konversiNilai());

        
        //membuat objek baru pada class Mahasiswa1, lalu mengisi data dari parameternya
        //mencetak data dari mahasiswa tersebut dengan memanggil method getter dan konversiNilai() pada objek yang dituju
        Mahasiswa2 orang2 = new Mahasiswa2("455212331", "jaemin", "29/07/2000", 99, 98, 87);
        System.out.println();
        System.out.println("--Data mahasiswa s2--");
        System.out.println("Nim           = " + orang2.getNim());
        System.out.println("Nama          = " + orang2.getNama());
        System.out.println("Tanggal lahir = " + orang2.gettanggalLahir());
        System.out.println("Uts 1         = " + orang2.getuts1());
        System.out.println("Uts 2         = " + orang2.getuts2());
        System.out.println("Uas           = " + orang2.getuas());
        System.out.println("Nilai final   = " + orang2.konversiNilai());
    }
}
