package Modul_9;

public abstract class BangunDatar {

    double keliling() {
        return 0;
    }

    double luas() {
        return 0;
    }
}

class Lingkaran extends BangunDatar {

    double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double keliling() {
        return 3.14 * r * r;
    }

    @Override
    double luas() {
        return 2 * 3.14 * r;
    }
}

class Segitiga extends BangunDatar {

    double sisiA, sisiB, sisiC;

    public Segitiga(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    double keliling() {
        return sisiA + sisiB + sisiC;
    }

    @Override
    double luas() {
        return Math.sqrt(sisiB - Math.pow((0.5 * sisiA), 2));
    }
}

class segiEmpat extends BangunDatar {

    double panjang, lebar;

    public segiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double keliling() {
        return (panjang * 2) + (lebar * 2);
    }

    @Override
    double luas() {
        return panjang * lebar;
    }
}
