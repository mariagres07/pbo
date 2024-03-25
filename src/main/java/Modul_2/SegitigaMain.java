package Modul_2;//deklarasi package Modul_2

public class SegitigaMain {//deklarasi class SegitigaMain

    public static void main(String[] args) {//deklarasi class sebagai metode utama
        Segitiga segitiga1 = new Segitiga(); 
        segitiga1.x1 = 1;
        segitiga1.y1 = 2;
        segitiga1.x2 = 7;
        segitiga1.y2 = 2;
        segitiga1.x3 = 7;
        segitiga1.y3 = 9;
        System.out.println("Luas segitiga dengan ttik (1, 2), (7, 2), (7, 9) adalah = " + segitiga1.hitungLuas());
        
        Segitiga segitiga2 = new Segitiga();
        segitiga2.x1 = 0;
        segitiga2.y1 = 0;
        segitiga2.x2 = 5;
        segitiga2.y2 = 4;
        segitiga2.x3 = 8;
        segitiga2.y3 = 2;
        System.out.println("Luas segitiga dengan titik (0, 0), (5, 4), (8, 2) adalah = " + segitiga2.hitungLuas()); 
    }
}
