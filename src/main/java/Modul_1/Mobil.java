package Modul_1;//deklarasi package Modul_1

public class Mobil {//deklarasi class Mobil
    String warna;

    Mobil(String wrn) {//constructor
        warna = wrn;
    }
    
    void jalan_maju(){//metode yang berisi perintah cetak
        System.out.println("Mobilnya warna " + warna);
        System.out.println("Maju !");
    }
    
    public static void main(String[] args) {//deklarasi metode main sebagai metode utama
        Mobil sedan = new Mobil("Merah");
        sedan.jalan_maju();
    }
}
