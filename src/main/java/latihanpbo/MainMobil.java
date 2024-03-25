package latihanpbo;

import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah mobil = ");
        int a = in.nextInt();

        Mobil[] haechan = new Mobil[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan merk mobil ke-" + (i+1) + "  = ");
            String merk = in.next();
            
            System.out.print("Masukkan warna mobil ke-" + (i+1) + " = ");
            String warna = in.next();
            
            haechan[i] = new Mobil(merk, warna);

        }
        for(Mobil mark : haechan){
        System.out.println("Merk = " + mark.getMerk());
        System.out.println("Warna = " + mark.getWarna());
        }
    }
}
