package prakt;

import java.util.Scanner;

public class mainModul5 {
    public static final double PPN = 0.1;

    public static void main(String[] args) {
        modul5[] ternak = new modul5[3];
        ternak[0] = new modul5("Bebek", "Telur Biasa", 15, 2, 2000);
        ternak[1] = new modul5("Domba", "Bulu Hitam", 4, 4, 15000);
        ternak[2] = new modul5("Unta", "Susu Putih", 3, 5, 60000);
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Inforasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Keluar program");
            System.out.print("Masukkan Menu Anda: ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("=".repeat(50));
                    for (modul5 hewan : ternak) {
                        System.out.println("Jenis\t\t\t : " + hewan.getJenis());
                        System.out.println("Ras\t\t\t : " + hewan.getRas());
                        System.out.println("Jumlah\t\t\t : " + hewan.getJumlah());
                        System.out.println("Telur/ekor\t\t : " + hewan.getJumlahHasil());
                        System.out.println("Total Telur/ekor\t : " + hewan.getTotalHasilTernak());
                        System.out.println("Harga Telur/butir\t : " + hewan.getHargaEkor());
                        System.out.println("=".repeat(50));
                    }
                    break;
                case 2:
                    System.out.println("=".repeat(50));
                    int totalPemasukan = 0;
                    for (modul5 hewan : ternak) {
                        System.out.println("Jenis\t\t : " + hewan.getJenis() + " | " + hewan.getRas());
                        System.out.println("Pemasukan\t : " + hewan.getHargaTernak());
                        System.out.println("-".repeat(50));
                        totalPemasukan += hewan.getHargaTernak();
                    }
                    System.out.println("Total Pemasukan  : " + totalPemasukan);
                    System.out.println("=".repeat(50));
                    break;
                case 3:
                    System.out.println("=".repeat(50));
                    int totalPemasukanSetelahPPN = 0;
                    for (modul5 hewan : ternak) {
                        System.out.println("Jenis\t\t : " + hewan.getJenis() + " | " + hewan.getRas());
                        System.out.println("Pemasukan\t : " + hewan.getHargaTernakSetelahPPN());
                        System.out.println("-".repeat(50));
                        totalPemasukanSetelahPPN += hewan.getHargaTernakSetelahPPN();
                    }
                    System.out.println("Total Pemasukan  : " + totalPemasukanSetelahPPN);
                    System.out.println("=".repeat(50));
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        } while (pilihan != 4);
    }
}

