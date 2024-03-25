package Modul_1;//deklarasi package Modul_1

public class Persegi {//deklarasi class Persegi
    int panjang;
    int lebar;
    double luas;

    public Persegi() {//constructor
    }
    
    public double luas(){//method yang berisi perhitungan luas
        luas = panjang*lebar;
        return luas;
    }
}
