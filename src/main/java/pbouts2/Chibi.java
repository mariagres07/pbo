package Project_JasaGambar;

import javax.swing.JOptionPane;

public class Chibi extends TransaksiComission {
    protected double harga;
    protected String noteTambahan;
    private double hargaAsesoriTambahan;

    public Chibi(int nomorKode, String deadLine, String karakter, double harga, String noteTambahan) {
        super(nomorKode, deadLine, karakter);
        this.harga = harga;
        this.noteTambahan = noteTambahan;
        this.hargaAsesoriTambahan = asesoriTambahan();
    }

    private double asesoriTambahan() {
        String input = JOptionPane.showInputDialog(null, "Pilih asesori tambahan:\n1. Topi\n2. Kacamata\n3. Kalung\n4. Tidak ada");
        int pilihan = Integer.parseInt(input);
        switch (pilihan) {
            case 1: return 10000;
            case 2: return 15000;
            case 3: return 20000;
            case 4: return 0;
            default: return 0;
        }
    }

    @Override
    public double hitungHarga() {
        return harga + hargaAsesoriTambahan;
    }

    @Override
    public String review() {
        return noteTambahan;
    }
}
