package Project_JasaGambar;

import javax.swing.JOptionPane;

public class HalfBody extends TransaksiComission {
    protected double harga;
    protected String noteTambahan;
    private double hargaAsesoriKepala;
    private double hargaAsesoriBaju;

    public HalfBody(int nomorKode, String deadLine, String karakter, double harga, String noteTambahan) {
        super(nomorKode, deadLine, karakter);
        this.harga = harga;
        this.noteTambahan = noteTambahan;
        this.hargaAsesoriKepala = asesoriKepala();
        this.hargaAsesoriBaju = asesoriBaju();
    }

    private double asesoriKepala() {
        String input = JOptionPane.showInputDialog(null, "Pilih asesori kepala:\n1. Topi\n2. Pita\n3. Bando\n4. Tidak ada");
        int pilihan = Integer.parseInt(input);
        switch (pilihan) {
            case 1: return 5000;
            case 2: return 6000;
            case 3: return 7000;
            case 4: return 0;
            default: return 0;
        }
    }

    private double asesoriBaju() {
        String input = JOptionPane.showInputDialog(null, "Pilih asesori baju:\n1. Kalung\n2. Bros\n3. Jam tangan\n4. Tidak ada");
        int pilihan = Integer.parseInt(input);
        switch (pilihan) {
            case 1: return 50000;
            case 2: return 60000;
            case 3: return 70000;
            case 4: return 0;
            default: return 0;
        }
    }

    @Override
    public double hitungHarga() {
        return harga + hargaAsesoriKepala + hargaAsesoriBaju;
    }

    @Override
    public String review() {
        return noteTambahan;
    }
}
