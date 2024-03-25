package Modul_2;

public class GajiMain {

    public static void main(String[] args) {
        Gaji pegawai1 = new Gaji("123456", "John Doe", 2, true, 2);

        System.out.println("Informasi Pegawai:");
        System.out.println("NPP: " + pegawai1.NPP);
        System.out.println("Nama: " + pegawai1.nama);
        System.out.println("Golongan: " + pegawai1.golongan);
        System.out.println("Menikah: " + (pegawai1.menikah));
        System.out.println("Jumlah Anak: " + pegawai1.jumlahAnak);

        System.out.println("\nGaji Total: Rp " + pegawai1.hitungGajiTotal());
    }
}
