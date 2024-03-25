package Modul_3;//deklarasi package Modul_3

public class Segitiga {//deklarasi class Segitiga

    private final Titik titikA;
    private final Titik titikB;
    private final Titik titikC;
    private double sisiA, sisiB, sisiC;
    
    public Segitiga (Titik satu, Titik dua, Titik tiga){//constructor
        titikA = satu;
        titikB = dua;
        titikC = tiga;
    }
    public double hitungSisi(Titik A, Titik B){//method yang digunakan untuk menghitung sisi
        int x1, y1, x2, y2;
        
        x1 = A.getX(); y1 = A.getY();
        x2 = B.getX(); y2 = B.getY();
        
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2,2));
    }
    public double hitungKeliling(){//method yang digunakan untuk menghitung keliling
        sisiA = hitungSisi(titikA, titikB);
        sisiB = hitungSisi(titikA, titikC);
        sisiC = hitungSisi(titikB, titikC);
        
        return (sisiA + sisiB + sisiC);
    }
    public double hitungLuas(){//method yang digunakan untuk menghitung luas
        double s = hitungKeliling()/2;
        
        return Math.sqrt(s* (s - sisiA)* (s -sisiB) * (s - sisiC));
    }
}
