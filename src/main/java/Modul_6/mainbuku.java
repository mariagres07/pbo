package Modul_6;

import java.util.Scanner;
import Modul_5.Buku;

public class mainbuku {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku baru  = ");
        int banyakBuku = in.nextInt();
        Buku[] bk = new Buku[banyakBuku];
        modifBuku newBuku = new modifBuku(banyakBuku);
        
        newBuku.tambahPengarang(bk);
        newBuku.bukuBerdasarkanTahun(bk);
        newBuku.bukuTerbitanPalingBaru(bk);
        newBuku.bukuTerbitanPalingLama(bk);
    }
}
