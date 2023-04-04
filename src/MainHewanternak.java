package Hewanternak;
import java.util.Scanner;

public class MainHewanternak {
    static final double BR = 0.1; // Besaran PPN

    static Bebek bebek = new Bebek("Telur Biasa", 15, " Butir telur");
    static Unta unta = new Unta("Susu Putih", 3, " Liter susu");
    static Domba domba = new Domba("Bulu Hitam", 4, " Kg bulu");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");

            System.out.print("Masukkan Menu Anda: ");
            int menu = scanner.nextInt();
            System.out.println("=============================================================================================================");

            switch (menu) {
                case 1:
                    System.out.println("Jenis\t\tRas\t\tJumlah\t\tHasil/Ekor\t Total/Hari\t\tHarga");
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    bebek.tampilkanData();
                    unta.tampilkanData();
                    domba.tampilkanData();
                    break;

                case 2:
                    System.out.println("Jenis\t\t\t\t\tPemasukan");
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    bebek.tampilkanPemasukan();
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    unta.tampilkanPemasukan();
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    domba.tampilkanPemasukan();
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    System.out.println("Total Pemasukan: " + hitungTotalPemasukan()+"\n");
                    break;

                case 3:
                    System.out.println("Jenis\t\t\t\t\tPemasukan Setelah PPN");
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    bebek.tampilkanPemasukanSetelahPPN();
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    unta.tampilkanPemasukanSetelahPPN();
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    domba.tampilkanPemasukanSetelahPPN();
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    System.out.println("Total Pemasukan Setelah PPN: " + hitungTotalPemasukanSetelahPPN()+"\n");
                    break;

                case 4:
                     System.out.println("Keluar program\n");
                    break;

                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        }
    }

    public static int hitungTotalPemasukan() {
        int totalPemasukan = 0;
        totalPemasukan += bebek.hitungPemasukan();
        totalPemasukan += unta.hitungPemasukan();
        totalPemasukan += domba.hitungPemasukan();
        return totalPemasukan;
    }

    public static int hitungTotalPemasukanSetelahPPN() {
        int totalPemasukanSetelahPPN = 0;
        totalPemasukanSetelahPPN += bebek.hitungPemasukanSetelahPPN();
        totalPemasukanSetelahPPN += unta.hitungPemasukanSetelahPPN();
        totalPemasukanSetelahPPN += domba.hitungPemasukanSetelahPPN();
        return totalPemasukanSetelahPPN;
    }
}
