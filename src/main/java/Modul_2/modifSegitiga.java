package Modul_2;//deklarasi package Modul_2

public class modifSegitiga {//deklarasi class modifsegitiga

    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    private final double x3;
    private final double y3;
    double keliling;
    double luas;

    modifSegitiga(double x1, double y1, double x2, double y2, double x3, double y3) {//constructor
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double hitungSisi(double xa, double ya, double xb, double yb) {//method yang berisi perhitungan sisi segitiga
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }

    public void sethitungKeliling() {//method yang digunakan untuk
        keliling = hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3)
                + hitungSisi(x3, y3, x1, y1);
    }

    public void sethitungLuas() {//method yang digunakan untuk me
        double s = gethitungKeliling();
        luas = Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3)
                + hitungSisi(x3, y3, x1, y1)));
    }

    public double gethitungKeliling() {//method yang digunakan untuk mengembalikan hasil keliling
        return keliling;
    }

    public double gethitungLuas() {//method yang digunakan untuk mengembalikan hasil luas
        return luas;
    }

    public static void main(String[] args) {//deklarasi class sebagai method utama
        modifSegitiga segitiga1 = new modifSegitiga(1, 2, 7, 2, 7, 9);

        segitiga1.sethitungKeliling();
        segitiga1.sethitungLuas();

        System.out.println("Luas segitiga dengan ttik (1, 2), (7, 2), (7, 9) adalah = " + segitiga1.gethitungLuas());
    }
}