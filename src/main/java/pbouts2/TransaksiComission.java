package Project_JasaGambar;

import java.util.Random;

public abstract class TransaksiComission implements Comission {
    protected int nomorKode;
    protected String deadLine;
    protected String karakter;
    protected String pesan;

    public TransaksiComission(int nomorKode, String deadLine, String karakter) {
        this.nomorKode = nomorKode;
        this.deadLine = deadLine;
        this.karakter = karakter;
    }

    public int getNomorKode() {
        return nomorKode;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public String getKarakter() {
        return karakter;
    }

    public static int generateNomorKode(Random random) {
        return 100 + random.nextInt(900);
    }

    public abstract double hitungHarga();

    public abstract String review();

}