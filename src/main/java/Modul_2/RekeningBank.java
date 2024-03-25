package Modul_2;//deklarasi package Modul_2

public class RekeningBank {//deklarasi class RekeningBank
    private final String nomorRekening;
    private int saldo;
    
    
    public RekeningBank(String nomor){//constructor
        nomorRekening = nomor;
        saldo = 0;
    }
    public int cekSaldo(){//method yang digunakan untuk mengembalikan nilai saldo
        return saldo;
    }
    public void tabung(int jumlah) {//method yang digunakan untuk menjumlahkan nilai dari saldo 
        saldo = saldo + jumlah;
    }
    public void ambil(int jumlah){//method yang digunakan untuk mengurangi nilai dari saldo
        saldo = saldo - jumlah;
    }
}
