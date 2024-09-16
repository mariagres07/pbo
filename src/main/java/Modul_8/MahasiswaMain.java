package Modul_8;

import Modul_4.Mahasiswa;
import Modul_7.Mahasiswa1;
import Modul_7.Mahasiswa2;

public class MahasiswaMain {

    public static void main(String[] args) {

        Mahasiswa[] siswa = new Mahasiswa[4];

        siswa[0] = new Mahasiswa1("21754123", "Jeno", "01/08/2000", 75, 85, 79);
        siswa[1] = new Mahasiswa1("18241381", "Jaemin", "04/07/2000", 75, 93, 76);
        siswa[2] = new Mahasiswa1("14124324", "Jisung", "09/12/2002", 78, 89, 88);
        siswa[3] = new Mahasiswa2("34234245", "Jaehyun", "14/02/1997", 43, 65, 56);

        for (int i = 0; i < siswa.length; i++) {
            if (siswa[i] instanceof Mahasiswa1 s1) {
                System.out.println();
                System.out.println("Nama    = " + siswa[i].getNama());
                System.out.println("Jenjang = S1");
                System.out.println("Nilai   = " + s1.konversiNilai());

            } else if (siswa[i] instanceof Mahasiswa2 s2) {
                System.out.println();
                System.out.println("Nama    = " + siswa[i].getNama());
                System.out.println("Jenjang = S2");
                System.out.println("Nilai   = " + s2.konversiNilai());
            }
        }
        System.out.println();
        System.out.println("Daftar mahasiswa lulus : ");
        for (int i = 0; i < siswa.length; i++) {
            if (siswa[i] instanceof Mahasiswa1 s1) {
                System.out.println();
                String lulus = s1.konversiNilai();
                if (lulus == "C") {
                    System.out.println("Nama  = " + siswa[i].getNama());
                    System.out.println("Nilai = " + s1.konversiNilai());
                } else if (lulus == "B") {
                    System.out.println("Nama  = " + siswa[i].getNama());
                    System.out.println("Nilai = " + s1.konversiNilai());
                } else if (lulus == "A") {
                    System.out.println("Nama  = " + siswa[i].getNama());
                    System.out.println("Nilai = " + s1.konversiNilai());
                }
            }
        }
    }
}
