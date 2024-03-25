package Modul_1;//deklarasi package Modul_1

import javax.swing.JOptionPane;

public class PersegiMain {//deklarasi class PersegiMain
    public static void main(String[] args) {//deklarasi metode main sebagai metode utama 
        Persegi objPersegi = new Persegi();
        
        objPersegi.panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang : "));
        objPersegi.lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar : "));
        
        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan "
                + "panjang = " + objPersegi.panjang 
                +" dan lebar = " + objPersegi.lebar 
                + " adalah " + objPersegi.luas());
    }
}
