package Modul_2;//deklarasi package Modul_2

public class Kalkulator {//deklarasi class Kalkulator

    int angka1, angka2;
    int kurang;

    Kalkulator(int angka1, int angka2) {//constructor
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public int jumlah() {//method yang berisi rumus penjumlahan dan mengembalikan hasil jumlah
        return this.angka1 + this.angka2;
    }

    public int kurang() {//method yang berisi rumus pengurangan dan mengembalikan hasil kurang
        if (angka1 > angka2) {
            kurang = this.angka1 - this.angka2;
        } else if (angka2 > angka1) {
            kurang = this.angka1 - this.angka2;
        }
        return kurang;
    }

    public double kali() {//method yang berisi rumus perkalian dan mengembalikan hasil kali
        return this.angka1 * this.angka2;
    }

    public double bagi() {//method yang berisi rumus pembagian  dan mengembalikan hasil bagi
        return this.angka1 / this.angka2;
        
    }
}
