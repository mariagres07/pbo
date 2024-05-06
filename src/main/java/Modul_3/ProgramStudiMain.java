package Modul_3;//deklarasi package Modul_3

import Modul_2.Pegawai;//mengimpor kelas Pegawai dari package Modul_2

public class ProgramStudiMain {//deklarasi class ProgramStudiMain

    public static void main(String[] args) {//deklarasi class sebagai method utama
        ProgramStudi pertama = new ProgramStudi(5314, "Informatika");

        Pegawai orang = new Pegawai("23785", "Jisung", 1, 0, 0);
        
        System.out.println("Nama program studi  = " + pertama.nama_prodi);
        System.out.println("Ketua program studi = " + orang.getNama());
        System.out.println("NPP                 = " + orang.getNpp());

    }
}
