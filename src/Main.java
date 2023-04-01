import java.util.Scanner;

public class Main {
    static Peternakan bebek = new Peternakan("Bebek", "Telur Biasa", 15, "Telur", 2, 2000, "butir");
    static Peternakan unta = new Peternakan("Unta", "Susu Putih", 3, "Susu", 5, 60000, "liter");
    static Peternakan domba = new Peternakan("Domba", "Bulu Hitam", 4, "Bulu", 4, 15000, "kg");
    static Scanner sc = new Scanner(System.in);
    final static double ppn = 0.1;

    public static void main(String[] args) {

        boolean active = true;
        while (active) {

            System.out.println("Menu:");
            System.out.println(
                    "1. Menampilkan Informasi Peternakan\n2. Menampilkan Total Pemasukan Harian\n3. Menampilkan Harga Setelah PPN\n4. Exit");
            System.out.print("\nMasukkan Menu Anda: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tampilInfo();
                    System.out.println("=".repeat(50));
                    break;
                case 2:
                    tampilPemasukkan();
                    break;
                case 3:
                    tampilPPN();
                    break;
                case 4:
                    active = false;
                    break;

                default:
                    System.out.println("=".repeat(50));
                    System.out.println("Pilihan tidak valid!");
                    System.out.println("=".repeat(50));
                    break;
            }
        }
    }

    static void tampilInfo() {
        Peternakan.cetakInfo();
    }

    static void tampilPemasukkan() {
        System.out.println("=".repeat(50));
        Peternakan.cetakPemasukkan();
        totalPemasukkan();
        System.out.println("=".repeat(50));
    }

    static void tampilPPN() {
        System.out.println("=".repeat(50));
        Peternakan.cetakPPN();
        totalPPN();
        System.out.println("=".repeat(50));

    }

    static void totalPemasukkan() {
        double total = bebek.hitungPemasukkan() + unta.hitungPemasukkan() + domba.hitungPemasukkan();
        System.out.printf("Total Pemasukkan : %.0f\n", total);
    }

    static void totalPPN() {
        double total = bebek.hitungPPN() + unta.hitungPPN() + domba.hitungPPN();
        System.out.printf("Total Pemasukkan : %.0f\n", total);
    }

}