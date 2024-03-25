package Modul_4;

import java.util.Scanner;

public class MahasiswaMain {

    public static void main(String[] args) {

        String nim, nama, tgl;
        double uts1, uts2, uas;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan banyak mahasiswa = ");
        int siswa = in.nextInt();

        Mahasiswa[] mhs = new Mahasiswa[siswa];

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("");
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nim           = ");
            nim = in.next();
            System.out.print("Masukkan nama          = ");
            nama = in.next();

            System.out.print("Masukkan tanggal lahir = ");
            tgl = in.next();
            do {
                System.out.print("Masukkan nilai uts 1   = ");
                uts1 = in.nextDouble();
            } while (uts1 > 100 || uts1 < 0);

            do {
                System.out.print("Masukkan nilai uts 2   = ");
                uts2 = in.nextDouble();
            } while (uts2 > 100 || uts2 < 0);
            do {
                System.out.print("Masukkan nilai uas   = ");
                uas = in.nextDouble();
            } while (uas > 100 || uas < 0);

            mhs[i] = new Mahasiswa(nim, nama, tgl, uts1, uts2, uas);
        }

        System.out.println("");
        System.out.println("Daftar Mahasiswa Informatika Peserta PBO");
        System.out.println("=========================================================================================");
        System.out.printf("%-5s%-12s%-20s%-15s%-8s%-8s%-8s%-8s%-7s\n", "No.", "NIM", "Nama", 
                "Tgl Lahir", "Uts1", "Uts2", "Uas", "Final", "Nilai");
        System.out.println("=========================================================================================");

        for (int i = 0; i < mhs.length; i++) {
            System.out.printf("%-5s%-12s%-20s%-15s%-8.2f%-8.2f%-8.2f%-8.2f%-7s\n", (i + 1), mhs[i].getNim(), mhs[i].getNama(),
                    mhs[i].gettanggalLahir(), mhs[i].getuts1(), mhs[i].getuts2(), mhs[i].getuas(), mhs[i].hitungFinal(),
                    mhs[i].konversiNilai());

        }

        double rataratauts1 = 0;
        for (int i = 0; i < mhs.length; i++) {
            rataratauts1 += mhs[i].getuts1();
        }
        double ratauts1 = rataratauts1 / mhs.length;

        double rataratauts2 = 0;
        for (int a = 0; a < mhs.length; a++) {
            rataratauts2 += mhs[a].getuts2();
        }
        double ratauts2 = rataratauts2 / mhs.length;

        double rataratauas = 0;
        for (int b = 0; b < mhs.length; b++) {
            rataratauas += mhs[b].getuas();
        }
        double ratauas = rataratauas / mhs.length;

        double rataratanilaitotal = 0;
        for (int c = 0; c < mhs.length; c++) {
            rataratanilaitotal += mhs[c].hitungFinal();
        }

        double ratanilaitotal = rataratanilaitotal / mhs.length;

        System.out.println("");
        System.out.println("Rata-rata nilai");
        System.out.printf("Uts1   : %.2f\n", ratauts1);
        System.out.printf("Uts2   : %.2f\n", ratauts2);
        System.out.printf("Uas    : %.2f\n", ratauas);
        System.out.printf("Total  : %.2f\n", rataratanilaitotal);

        int max = 0;
        double maximum = mhs[0].hitungFinal();
        for (int d = 1; d < mhs.length; d++) {
            if (mhs[d].hitungFinal() > maximum) {
                maximum = mhs[d].hitungFinal();
                max = d;
            }

            System.out.println("");

            System.out.println("Nilai tertinggi");
            System.out.println("Nim           : " + mhs[max].getNim());
            System.out.println("Nama          : " + mhs[max].getNama());
            System.out.println("Tanggal Lahir : " + mhs[max].gettanggalLahir());
            System.out.println("Final         : " + mhs[max].hitungFinal());
            System.out.println("Nilai         : " + mhs[max].konversiNilai());
        }
    }
}
