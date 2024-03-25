package Modul_1;//deklarasi package Modul_1

public class Lingkaran {//deklarasi class Lingkaran

    double r;
    double luas;
    final double PHI = 3.14;

    Lingkaran() {//constructor
    }

    ;
    
     public void luas() {//method yang berisi perhitungan luas 
        r = 7;
        luas = PHI * r * r;

        System.out.println("Luas lingkaran dengan jari " + r + " adalah : " + luas);
    }

}
