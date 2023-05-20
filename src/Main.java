import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int kasSaatIni = 25000000;
    private static int transactionCount = 0;
    private static final int MAX_TRANSACTIONS = 10;
    private static List<String> transactionHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayInformation();
                    break;
                case 2:
                    purchase(scanner);
                    break;
                case 3:
                    displayTransactionHistory();
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 4);
    }

    private static void displayMenu() {
        System.out.println("\n=== MENU UTAMA ===");
        System.out.println("1. Informasi Peternakan & Perkebunan");
        System.out.println("2. Pembelian Peternakan & Perkebunan");
        System.out.println("3. History Transaksi");
        System.out.println("4. Keluar Program");
        System.out.print("Pilihan: ");
    }

    private static void displayInformation() {
        System.out.println("\n=== INFORMASI PETERNAKAN & PERKEBUNAN ===");
        System.out.println("Jumlah Peternakan:");
        System.out.println("- Bebek: 15 ekor");
        System.out.println("- Unta: 3 ekor");
        System.out.println("- Domba: 4 ekor");

        System.out.println("\nJumlah Perkebunan:");
        System.out.println("- Apel: 5 hektar");
        System.out.println("- Kelapa Sawit: 6 hektar");

        System.out.println("\nHasil Produksi:");
        System.out.println("- Bebek: 2 butir telur/hari");
        System.out.println("- Unta: 5 liter susu/hari");
        System.out.println("- Domba: 4 kg bulu/hari");
        System.out.println("- Apel: 40 kg apel/hari");
        System.out.println("- Kelapa Sawit: 500 kg minyak/hari");

        System.out.println("\nHarga Jual:");
        System.out.println("- Telur Bebek: Rp 2.000/butir");
        System.out.println("- Susu Unta: Rp 60.000/liter");
        System.out.println("- Bulu Domba: Rp 15.000/kg");
        System.out.println("- Apel: Rp 25.000/kg");
        System.out.println("- Minyak Kelapa Sawit: Rp 18.000/kg");

        System.out.println("\nBiaya Perawatan:");
        System.out.println("- Bebek: Rp 3.000/ekor");
        System.out.println("- Unta: Rp 200.000/ekor");
        System.out.println("- Domba: Rp 45.000/ekor");
        System.out.println("- Apel: Rp 900.000/hektar");
        System.out.println("- Kelapa Sawit: Rp 8.500.000/hektar");

        System.out.println("\nProfit:");
        System.out.println("- Bebek: Harga jual telur - Biaya perawatan");
        System.out.println("- Unta: Harga jual susu - Biaya perawatan");
        System.out.println("- Domba: Harga jual bulu - Biaya perawatan");
        System.out.println("- Apel: Harga jual apel - Biaya perawatan");
        System.out.println("- Kelapa Sawit: Harga jual minyak - Biaya perawatan");

        System.out.println("\nKas saat ini: Rp " + kasSaatIni);
    }

    private static void purchase(Scanner scanner) {
        if (transactionCount >= MAX_TRANSACTIONS) {
            System.out.println("Transaksi gagal. Jumlah transaksi telah mencapai batas maksimal.");
            return;
        }

        System.out.println("\n=== PEMBELIAN PETERNAKAN & PERKEBUNAN ===");
        System.out.println("Jenis yang ingin dibeli:");
        System.out.println("1. Ternak Bebek");
        System.out.println("2. Ternak Domba");
        System.out.println("3. Ternak Unta");
        System.out.println("4. Kebun Apel");
        System.out.println("5. Kebun Kelapa Sawit");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();

        String type = "";
        int price = 0;
        int quantity = 0;
        int totalCost = 0;

        switch (choice) {
            case 1:
                type = "Ternak Bebek";
                price = 110000;
                System.out.print("Jumlah bebek yang ingin dibeli: ");
                quantity = scanner.nextInt();
                totalCost = price * quantity;
                break;
            case 2:
                type = "Ternak Domba";
                price = 2450000;
                System.out.print("Jumlah domba yang ingin dibeli: ");
                quantity = scanner.nextInt();
                totalCost = price * quantity;
                break;
            case 3:
                type = "Ternak Unta";
                price = 12000000;
                System.out.print("Jumlah unta yang ingin dibeli: ");
                quantity = scanner.nextInt();
                totalCost = price * quantity;
                break;
            case 4:
                type = "Kebun Apel";
                price = 7500000;
                System.out.print("Jumlah hektar kebun apel yang ingin dibeli: ");
                quantity = scanner.nextInt();
                totalCost = price * quantity;
                break;
            case 5:
                type = "Kebun Kelapa Sawit";
                price = 18000000;
                System.out.print("Jumlah hektar kebun kelapa sawit yang ingin dibeli: ");
                quantity = scanner.nextInt();
                totalCost = price * quantity;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        if (totalCost > kasSaatIni) {
            System.out.println("Transaksi gagal. Kas tidak mencukupi.");
            return;
        }

        kasSaatIni -= totalCost;
        transactionCount++;
        transactionHistory.add("Pembelian " + type + ": " + quantity);

        System.out.println("Berhasil membeli " + quantity + " " + type + ".");
        System.out.println("Kas saat ini: Rp " + kasSaatIni);
    }

    private static void displayTransactionHistory() {
        System.out.println("\n=== HISTORY TRANSAKSI ===");
        if (transactionHistory.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}
