import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static int kas = 25000000;
    private static int transaksiCount = 0;
    private static List<String> historyTransaksi = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Peternakan dan Perkebunan");
            System.out.println("3. History Transaksi");
            System.out.println("4. Exit");

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    tampilkanInformasiPeternakanPerkebunan();
                    tampilkanInformasiKas();
                    break;
                case 2:
                    if (transaksiCount >= 10) {
                        System.out.println("Transaksi gagal! Jumlah transaksi telah mencapai batas maksimal (10).");
                    } else {
                        beliPeternakanPerkebunan(scanner);
                    }
                    break;
                case 3:
                    tampilkanHistoryTransaksi();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1-4.");
                    break;
            }

            System.out.println();
        }
    }

    private static void tampilkanInformasiPeternakanPerkebunan() {
        System.out.println("=== Informasi Peternakan dan Perkebunan ===");

        Bebek bebek = new Bebek(15);
        Unta unta = new Unta(3);
        Domba domba = new Domba(4);
        Apel apel = new Apel(5);
        KelapaSawit kelapaSawit = new KelapaSawit(6);

        System.out.println("Jenis Peternakan:");
        System.out.println("- Bebek: " + bebek.getJumlah() + " ekor");
        System.out.println("- Unta: " + unta.getJumlah() + " ekor");
        System.out.println("- Domba: " + domba.getJumlah() + " ekor");
        System.out.println();

        System.out.println("Jenis Perkebunan:");
        System.out.println("- Apel: " + apel.getJumlahHektar() + " hektar");
        System.out.println("- Kelapa Sawit: " + kelapaSawit.getJumlahHektar() + " hektar");
        System.out.println();

        System.out.println("Hasil Ternak:");
        System.out.println("- Bebek: " + bebek.getHasil() + " butir telur/hari");
        System.out.println("- Unta: " + unta.getHasil() + " liter susu/hari");
        System.out.println("- Domba: " + domba.getHasil() + " kg bulu/hari");
        System.out.println();

        System.out.println("Hasil Perkebunan:");
        System.out.println("- Apel: " + apel.getHasil() + " kg apel/hari");
        System.out.println("- Kelapa Sawit: " + kelapaSawit.getHasil() + " kg minyak/hari");
        System.out.println();

        System.out.println("Harga Jual:");
        System.out.println("- Telur Bebek: Rp " + bebek.getHargaJual() + "/butir");
        System.out.println("- Susu Unta: Rp " + unta.getHargaJual() + "/liter");
        System.out.println("- Bulu Domba: Rp " + domba.getHargaJual() + "/kg");
        System.out.println("- Apel: Rp " + apel.getHargaJual() + "/kg");
        System.out.println("- Minyak Kelapa Sawit: Rp " + kelapaSawit.getHargaJual() + "/kg");
        System.out.println();

        System.out.println("Profit:");
        System.out.println("- Bebek: Rp " + (bebek.getHasil() * bebek.getHargaJual()) + "/hari");
        System.out.println("- Unta: Rp " + (unta.getHasil() * unta.getHargaJual()) + "/hari");
        System.out.println("- Domba: Rp " + (domba.getHasil() * domba.getHargaJual()) + "/hari");
        System.out.println("- Apel: Rp " + (apel.getHasil() * apel.getHargaJual()) + "/hari");
        System.out.println("- Kelapa Sawit: Rp " + (kelapaSawit.getHasil() * kelapaSawit.getHargaJual()) + "/hari");
    }

    private static void tampilkanInformasiKas() {
        System.out.println("Kas saat ini: Rp " + kas);
    }

    private static void beliPeternakanPerkebunan(Scanner scanner) {
        System.out.println("=== Pembelian Peternakan dan Perkebunan ===");
        System.out.println("Harga Peternakan/Perkebunan:");
        System.out.println("1. Ternak Bebek: Rp 110,000/ekor");
        System.out.println("2. Ternak Domba: Rp 2,450,000/ekor");
        System.out.println("3. Ternak Unta: Rp 12,000,000/ekor");
        System.out.println("4. Kebun Apel: Rp 7,500,000/hektar");
        System.out.println("5. Kebun Kelapa Sawit: Rp 18,000,000/hektar");

        System.out.print("Pilih item yang akan dibeli (1-5): ");
        int item = scanner.nextInt();
        scanner.nextLine();

        int harga = 0;
        String namaItem = "";

        switch (item) {
            case 1:
                harga = 110000;
                namaItem = "Ternak Bebek";
                break;
            case 2:
                harga = 2450000;
                namaItem = "Ternak Domba";
                break;
            case 3:
                harga = 12000000;
                namaItem = "Ternak Unta";
                break;
            case 4:
                harga = 7500000;
                namaItem = "Kebun Apel";
                break; 
            case 5:
                harga = 18000000;
                namaItem = "Kebun Kelapa Sawit";
                break;
            default:
                System.out.println("Item tidak valid. Pembelian gagal.");
                return;
        }

        if (kas < harga) {
            System.out.println("Kas tidak mencukupi. Pembelian gagal.");
        } else {
            kas -= harga;
            transaksiCount++;
            historyTransaksi.add(namaItem);
            System.out.println("Pembelian " + namaItem + " berhasil.");
            System.out.println("Kas saat ini: Rp " + kas);
        }
    }

    private static void tampilkanHistoryTransaksi() {
        System.out.println("=== History Transaksi ===");

        if (historyTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (String transaksi : historyTransaksi) {
                System.out.println(transaksi);
            }
        }
    }
}
