package Modul_2;//deklarasi package Modul_2

public class Segitiga {//deklarasi class Segitiga
    public double x1, y1, x2, y2, x3, y3;
    
    public double hitungSisi(double xa, double ya, double xb, double yb){//method yang berisi perhitungan sisi segitiga
        return Math.sqrt(Math.pow(xa-xb, 2)+Math.pow(ya-yb,2));
    }
    public double hitungKeliling(){//method yang berisi perhitungan keliling segitiga
        return hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3)
                + hitungSisi(x3, y3, x1, y1);
    }
    public double hitungLuas(){//method yang berisi perhitungan luas segitiga
        double s = hitungKeliling();
        return Math.sqrt(s * (s-hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3) 
                + hitungSisi(x3, y3, x1, y1)) );
    }
}
