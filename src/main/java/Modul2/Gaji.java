package Modul2;

public class Gaji {

    private String NPP;
    private String nama;
    private int golongan;
    private boolean menikah;
    private int jumlahAnak;

    public Gaji(String NPP, String nama, int golongan, boolean menikah, int jumlahAnak) {
        this.NPP = NPP;
        this.nama = nama;
        this.golongan = golongan;
        this.menikah = menikah;
        this.jumlahAnak = jumlahAnak;
    }

    public double hitungGajiPokok() {
        double gajiPokok = 0;
        switch (golongan) {
            case 1:
                gajiPokok = 1300000;
                break;
            case 2:
                gajiPokok = 1750000;
                break;
            case 3:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Golongan tidak valid.");
        }
        return gajiPokok;
    }

    public double hitungTunjanganKeluarga() {
        double tunjanganKeluarga = 0;
        if (menikah) {
            tunjanganKeluarga = 30000 + (jumlahAnak * 100000);
        }
        return tunjanganKeluarga;
    }

    public double hitungGajiTotal() {
        return hitungGajiPokok() + hitungTunjanganKeluarga();
    }

    public double getGajiPokok() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
