package MODUL_5;

import java.util.Scanner;

import MODUL_5.Animal.Bebek;
import MODUL_5.Animal.Domba;
import MODUL_5.Animal.Unta;

class Main {
    static final double PPN = 0.1; // ppn sebesar 10%
    static Bebek bebek;
    static Unta unta;
    static Domba domba;

    public static void main(String[] args) {
        Scanner hewan = new Scanner(System.in);
        bebek = new Bebek("Bebek", "Telur Biasa", 15, 2, 2000);
        domba = new Domba("Domba", "Bulu Hitam", 4, 4, 15000);
        unta = new Unta("Unta", "Susu Putih", 3, 5, 60000);

        int menu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");

            System.out.print("Masukkan Menu Anda: ");
            menu = hewan.nextInt();
            switch (menu) {
                case 1:
                    tampilkanDataHewan();
                    break;
                case 2:
                    tampilkanPemasukanHarian();
                    break;
                case 3:
                    tampilkanPemasukanHarianSetelahPPN();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Menu yang anda pilih tidak tersedia.");
                    break;
            }
            System.out.println();
        } while (menu != 4);
    }

    private static void tampilkanDataHewan() {
        bebek.showData1();
        System.out.println("Total Telur/Hari \t: " + bebek.getTotalOutput() + " Butir");
        System.out.println("Harga Telur/Butir\t: " + bebek.getHargaPerUnit());
        domba.showData2();
        System.out.println("Total hasil domba\t: " + domba.getTotalOutput() + " Kg");
        System.out.println("Harga susu/liter\t: " + domba.getHargaPerUnit());
        unta.showData3();
        System.out.println("Total bulu/hari \t: " + unta.getTotalOutput() + " liter");
        System.out.println("Harga Bulu/Kg\t\t: " + unta.getHargaPerUnit());
        System.out.println("=".repeat(50));

    }

    private static void tampilkanPemasukanHarian() {
        System.out.println("=".repeat(50));
        System.out.println("Jenis Hewan\t\t: " + bebek.getName() + "\t| " + bebek.getJenis());
        int totalPemasukanHarian = bebek.getPendapatanHarian() + unta.getPendapatanHarian()
                + domba.getPendapatanHarian();
        System.out.println("Pemasukan\t\t: " + bebek.getPendapatanHarian());
        System.out.println("-".repeat(50));
        System.out.println("Jenis Hewan\t\t: " + domba.getName() + "\t| " + domba.getJenis());
        System.out.println("Pemasukan\t\t: " + domba.getPendapatanHarian());
        System.out.println("-".repeat(50));
        System.out.println("Jenis Hewan\t\t: " + unta.getName() + "\t| " + unta.getJenis());
        System.out.println("Pemasukan\t\t: " + unta.getPendapatanHarian());
        System.out.println("-".repeat(50));
        System.out.println("Total Pemasukan\t\t: " + totalPemasukanHarian);
        System.out.println("=".repeat(50));
    }

    private static void tampilkanPemasukanHarianSetelahPPN() {
        int totalPemasukanSetelahPPN = bebek.getPendapatansetelahpajak(PPN) + unta.getPendapatansetelahpajak(PPN)
                + domba.getPendapatansetelahpajak(PPN);
        System.out.println("=".repeat(50));
        System.out.println("Jenis Hewan\t\t: Bebek | Telur Biasa");
        System.out.println("Pemasukan\t\t: " + bebek.getPendapatansetelahpajak(PPN));
        System.out.println("-".repeat(50));
        System.out.println("Jenis Hewan\t\t: Domba | Bulu Hitam");
        System.out.println("Pemasukan\t\t: " + domba.getPendapatansetelahpajak(PPN));
        System.out.println("-".repeat(50));
        System.out.println("Jenis Hewan\t\t: Unta | Susu Putih");
        System.out.println("Pemasukan\t\t: " + unta.getPendapatansetelahpajak(PPN));
        System.out.println("-".repeat(50));
        System.out.println("Total Pemasukan\t\t: " + totalPemasukanSetelahPPN);
        System.out.println("=".repeat(50));
    }
}
