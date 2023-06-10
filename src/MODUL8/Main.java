package MODUL8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TernakKebun pakKiw = new TernakKebun(15, 4, 3, 5, 6);
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Program Peternakan dan Perkebunan Pak Kiw");
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan menu: ");
            menu = scanner.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    pakKiw.showMenu();
                    break;
                case 2:
                    pakKiw.processMenu();
                    break;
                case 3:
                    pakKiw.processMenu();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println("=".repeat(50));
        } while (menu != 0);

        scanner.close();
    }
}
