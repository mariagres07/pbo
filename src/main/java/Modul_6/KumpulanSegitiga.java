package Modul_6;

public class KumpulanSegitiga {
    int jumlahSegitiga;
    int daftarSegitiga;
    public double x1, y1, x2, y2, x3, y3;

    public KumpulanSegitiga(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public double hitungSisi(double xa, double ya, double xb, double yb) {//method yang berisi perhitungan sisi daftarSegitigatiga
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }

    public double hitungKeliling() {//method yang berisi perhitungan keliling daftarSegitigatiga
        return hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3)
                + hitungSisi(x3, y3, x1, y1);
    }

    public double hitungLuas() {//method yang berisi perhitungan luas daftarSegitigatiga
        double s = hitungKeliling();
        return Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3)
                + hitungSisi(x3, y3, x1, y1)));
    }

    public static void rataRata(KumpulanSegitiga[] daftarSegitiga) {
        double luas = 0;
        for (int i = 0; i < daftarSegitiga.length; i++) {
            luas += daftarSegitiga[i].hitungLuas();
        }
        double rataRata = luas / daftarSegitiga.length;
        System.out.println();
        System.out.println("Rata-rata segitiga = " + rataRata);
    }

    public static void terluas(KumpulanSegitiga[] daftarSegitiga) {
        int max = 0;
        double maxi = daftarSegitiga[0].hitungLuas();
        for (int i = 0; i < daftarSegitiga.length; i++) {
            if (daftarSegitiga[i].hitungLuas() > maxi) {
                maxi = daftarSegitiga[i].hitungLuas();
                max = i;
            }
        }
        System.out.println();
        System.out.println("Paling luas = " + daftarSegitiga[max].hitungLuas());
    }

    public static void terkecil(KumpulanSegitiga[] daftarSegitiga) {
        int max = 0;
        double maxi = daftarSegitiga[0].hitungLuas();
        for (int i = 0; i < daftarSegitiga.length; i++) {
            if (daftarSegitiga[i].hitungLuas() < maxi) {
                maxi = daftarSegitiga[i].hitungLuas();
                max = i;
            }
        }
        System.out.println();
        System.out.println("Paling kecil = " + daftarSegitiga[max].hitungLuas());
    }
}
