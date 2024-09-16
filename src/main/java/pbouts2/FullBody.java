package Project_JasaGambar;

import javax.swing.JOptionPane;

public class FullBody extends TransaksiComission {
    private double harga;
    private String noteTambahan;
    private double hargaAsesoriKepala;
    private double hargaAsesoriBaju;
    private double hargaAsesoriKaki;

    public FullBody(int nomorKode, String deadLine, String karakter, double harga, String noteTambahan) {
        super(nomorKode, deadLine, karakter);
        this.harga = harga;
        this.noteTambahan = noteTambahan;
        this.hargaAsesoriKepala = asesoriKepala();
        this.hargaAsesoriBaju = asesoriBaju();
        this.hargaAsesoriKaki = asesoriKaki();
    }

    private double asesoriKepala() {
        String input = JOptionPane.showInputDialog(null,
                "Pilih asesori kepala:\n1. Topi\n2. Pita\n3. Bando\n4. Tidak ada");
        int pilihan = Integer.parseInt(input);
        switch (pilihan) {
            case 1:
                return 20000;
            case 2:
                return 6000;
            case 3:
                return 7000;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    private double asesoriBaju() {
        String input = JOptionPane.showInputDialog(null,
                "Pilih asesori sekitar badan:\n1. Kalung\n2. Bros\n3. Jam tangan\n4. Tidak ada");
        int pilihan = Integer.parseInt(input);
        switch (pilihan) {
            case 1:
                return 20000;
            case 2:
                return 15000;
            case 3:
                return 10000;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    private double asesoriKaki() {
        String input = JOptionPane.showInputDialog(null,
                "Pilih asesori kaki:\n1. Kaos kaki\n2. Gelang kaki\n3. Sepatu\n4.Tidak ada");
        int pilihan = Integer.parseInt(input);
        switch (pilihan) {
            case 1:
                return 20000;
            case 2:
                return 10000;
            case 3:
                return 15000;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public double hitungHarga() {
        return harga + hargaAsesoriKepala + hargaAsesoriBaju + hargaAsesoriKaki;
    }

    @Override
    public String review() {
        return noteTambahan;
    }
}
