// package Project_JasaGambar;

// import javax.swing.*;
// import java.util.ArrayList;
// import java.util.Random;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<DataPembeli> pembeliList = new ArrayList<>();
//         Random random = new Random();

//         int jumlahPembeli = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pembeli:"));

//         for (int i = 0; i < jumlahPembeli; i++) {
//             String nama, email, nomorTelepon;

//             do {
//                 nama = JOptionPane.showInputDialog("Masukkan Nama Pembeli ke " + (i + 1) + ":");
//                 if (nama.isEmpty()) {
//                     JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong!");
//                 }
//             } while (nama.isEmpty());

//             do {
//                 email = JOptionPane.showInputDialog("Masukkan Email Pembeli ke " + (i + 1) + ":");
//                 if (email.isEmpty()) {
//                     JOptionPane.showMessageDialog(null, "Email tidak boleh kosong!");
//                 }
//             } while (email.isEmpty());

//             do {
//                 nomorTelepon = JOptionPane.showInputDialog("Masukkan Nomor Telepon Pembeli ke " + (i + 1) + ":");
//                 if (nomorTelepon.isEmpty()) {
//                     JOptionPane.showMessageDialog(null, "Nomor Telepon tidak boleh kosong!");
//                 }
//             } while (nomorTelepon.isEmpty());

//             DataPembeli pembeli = new DataPembeli(nama, email, nomorTelepon);

//             int jumlahKomisi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah komisi untuk pembeli ini:"));

//             for (int j = 0; j < jumlahKomisi; j++) {
//                 int nomorKode = TransaksiComission.generateNomorKode(random);
//                 String tenggatWaktu, karakter, noteTambahan;
//                 double harga;

//                 do {
//                     tenggatWaktu = JOptionPane.showInputDialog("Masukkan Tenggat Waktu (yyyy-mm-dd) Komisi ke " + (j + 1) + ":");
//                     if (tenggatWaktu.isEmpty()) {
//                         JOptionPane.showMessageDialog(null, "Tenggat Waktu tidak boleh kosong!");
//                     }
//                 } while (tenggatWaktu.isEmpty());

//                 do {
//                     karakter = JOptionPane.showInputDialog("Masukkan Karakter Komisi ke " + (j + 1) + ":");
//                     if (karakter.isEmpty()) {
//                         JOptionPane.showMessageDialog(null, "Karakter tidak boleh kosong!");
//                     }
//                 } while (karakter.isEmpty());

//                 String[] options = {"Full Body", "Half Body", "Chibi"};
//                 int jenis = JOptionPane.showOptionDialog(null, "Pilih Jenis Komisi:",
//                         "Jenis Komisi", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

//                 TransaksiComission komisi = null;

//                 switch (jenis) {
//                     // ini Full Body
//                     case 0: 
//                         harga = 100000;
//                         noteTambahan = JOptionPane.showInputDialog("Masukkan Note Tambahan:");
//                         komisi = new FullBody(nomorKode, tenggatWaktu, karakter, harga, noteTambahan);
//                         break;
//                     //ini Half Body
//                     case 1: 
//                         harga = 55000;
//                         noteTambahan = JOptionPane.showInputDialog("Masukkan Note Tambahan:");
//                         komisi = new HalfBody(nomorKode, tenggatWaktu, karakter, harga, noteTambahan);
//                         break;
//                     //ini Chibi
//                     case 2: 
//                         harga = 30000;
//                         noteTambahan = JOptionPane.showInputDialog("Masukkan Note Tambahan:");
//                         komisi = new Chibi(nomorKode, tenggatWaktu, karakter, harga, noteTambahan);
//                         break;
//                     default:
//                         JOptionPane.showMessageDialog(null, "Jenis komisi tidak valid.");
//                         continue;
//                 }

//                 pembeli.tambahKomisi(komisi);
//                 pembeli.setTotalHarga(pembeli.getTotalHarga() + komisi.hitungHarga());
//             }

//             pembeliList.add(pembeli);
//         }

        
//         System.out.println("+-----------------------------+-----------------------------+------------------+-------------+");
//         System.out.println("| Nama Pembeli                | Email                       | Nomor Telepon    | Total Harga |");
//         System.out.println("+-----------------------------+-----------------------------+------------------+-------------+");

//         for (DataPembeli pembeli : pembeliList) {
//             System.out.printf("| %-27s | %-27s | %-16s | %-11.2f |\n",
//             pembeli.getNama(), pembeli.getEmail(), pembeli.getNomorTelepon(), pembeli.getTotalHarga());
//             System.out.println("+-----------------------------+-----------------------------+------------------+-------------+");
                    
//             System.out.println("+-----------------------------+-----------------------------+------------------+-------------+");
//             System.out.println("Jenis Komisi\t\tNomor Kode\tTenggat Waktu\tKarakter\t\tHarga\t\tNote Tambahan");
//             System.out.println("+-----------------------------+-----------+--------------+-----------------------------+-------------+------------------+");

//             for (TransaksiComission komisi : pembeli.getKomisiList()) {
//                 System.out.printf("| %-27s | %-9d | %-12s | %-27s | %-11.2f | %-16s |\n",
//                         komisi.getClass().getSimpleName(), komisi.getNomorKode(), komisi.getDeadLine(), komisi.getKarakter(), komisi.hitungHarga(), komisi.review());
//             }

//             System.out.println("+-----------------------------+-----------+--------------+-----------------------------+-------------+------------------+");
//             System.out.printf("Total Harga: %.2f\n\n", pembeli.getTotalHarga());
//         }
//         System.out.println();
//     }
// }