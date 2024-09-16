package Project_JasaGambar;

import java.util.ArrayList;

public class DataPembeli {
    private String nama;
    private String email;
    private String nomorTelepon;
    private ArrayList<TransaksiComission> komisiList;
    private double totalHarga; // Menyimpan total harga pembelian

    public DataPembeli(String nama, String email, String nomorTelepon) {
        this.nama = nama;
        this.email = email;
        this.nomorTelepon = nomorTelepon;
        this.komisiList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public ArrayList<TransaksiComission> getKomisiList() {
        return komisiList;
    }

    public void tambahKomisi(TransaksiComission komisi) {
        komisiList.add(komisi);
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
}
