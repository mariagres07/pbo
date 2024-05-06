package Modul2;

public class Pegawai {

    private String NPP;
    private String nama;
    private int golongan;
    private boolean menikah;
    private int jumlahAnak;
    private int gajiPokok;
    
    public Pegawai(String NPP, String nama, int golongan, boolean menikah, int jumlahAnak) {
        this.NPP = NPP;
        this.nama = nama;
        this.golongan = golongan;
        this.menikah = menikah;
        this.jumlahAnak = jumlahAnak;
        this.gajiPokok = gajiPokok;
    }

    public String getNPP() {
        return NPP;
    }

    public void setNPP(String NPP) {
        this.NPP = NPP;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
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
//            default:
//                System.out.println("Golongan tidak valid.");
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
}
