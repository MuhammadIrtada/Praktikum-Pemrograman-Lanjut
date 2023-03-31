package Modul5;

import java.util.*;;

public class Main {
    static Animal bebek;
    static Animal domba;
    static Animal unta;
    static Animal animal;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inisialisasi();
        System.out.println();
        while (true) {
            printMenu();
            int pilihan = input.nextInt();
            System.out.println();
            if (pilihan == 4) {
                break;
            }
            animals(pilihan);
            if (pilihan == 2) {
                animal.pertambahan(30, 16, 15);
            } else if (pilihan == 3) {
                animals(pilihan);
                animal.pertambahanPPN(30, 16, 15, 0.1);
            }
        }
        input.close();
    }

    static void printMenu() {
        String A = "1. Menampilkan Informasi Peternakan";
        String B = "2. Menampilkan Total Pemasukan Harian";
        String C = "3. Menampilkan Harga Setelah PPN";
        String D = "4. Exit";
        System.out.printf("\nMenu\n%s\n%s\n%s\n%s\nMasukkan Menu Anda: ", A, B, C, D);
    }

    static void inisialisasi() {
        bebek = new Animal(new String[][] { { "Telur biasa", "2", "Butir", "2000", "Telur" } });
        domba = new Animal(new String[][] { { "Bulu hitam", "4", "Kg", "15000", "Bulu" } });
        unta = new Animal(new String[][] { { "Susu putih", "5", "liter", "60000", "Susu" } });
        animal = new Animal(new int[] { 2000, 15000, 60000 });
    }

    static void animals(int pilihan) {
        bebek.printInfo("Bebek", 15, pilihan);
        domba.printInfo("Domba", 4, pilihan);
        unta.printInfo("Unta", 3, pilihan);
    }
}
