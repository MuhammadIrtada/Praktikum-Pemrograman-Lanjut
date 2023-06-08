import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static int jumlahBebek = 15;
    private static int jumlahDomba = 4;
    private static int jumlahUnta = 3;
    private static int jumlahApel = 5;
    private static int jumlahKelapaSawit = 6;
    private static int totalBudget = 0;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int menu;
        do {
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    tampilkanInformasi();
                    break;
                case 2:
                    pembelianHewanTernak();
                    break;
                case 3:
                    pembelianTanamanPerkebunan();
                    break;
                case 4:
                    System.out.println("Terima kasih. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }

            System.out.println();
        } while (menu != 4);
    }

    private static void tampilkanInformasi() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("  Informasi Peternakan dan Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println("Bebek \t\t: " + jumlahBebek + " ekor");
        System.out.println("Domba \t\t: " + jumlahDomba + " ekor");
        System.out.println("Unta \t\t: " + jumlahUnta + " ekor");
        System.out.println("Apel \t\t: " + jumlahApel + " hektar");
        System.out.println("Kelapa Sawit \t: " + jumlahKelapaSawit + " hektar");
    }
    private static void pembelianHewanTernak() {
        Scanner scanner = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("  \tPembelian Hewan Ternak");
        System.out.println("=".repeat(40));
        System.out.println("Daftar Harga:");
        System.out.println("1. Bebek \t\t: " + numberFormat.format(new Bebek().getHarga()));
        System.out.println("2. Domba \t\t: " + numberFormat.format(new Domba().getHarga()));
        System.out.println("3. Unta \t\t: " + numberFormat.format(new Unta().getHarga()));

        System.out.print("Masukkan pilihan hewan (nomor): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan banyak hewan: ");
        int jumlah = scanner.nextInt();

        int harga = 0;
        String jenisHewan = "";
        switch (pilihan) {
            case 1:
                harga = new Bebek().getHarga();
                jenisHewan = "Bebek";
                jumlahBebek += jumlah;
                break;
            case 2:
                harga = new Domba().getHarga();
                jenisHewan = "Domba";
                jumlahDomba += jumlah;
                break;
            case 3:
                harga = new Unta().getHarga();
                jenisHewan = "Unta";
                jumlahUnta += jumlah;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        int totalBiaya = harga * jumlah;
        totalBudget -= totalBiaya;
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("      Nota Pembelian Hewan Ternak");
        System.out.println("=".repeat(40));
        System.out.println(jenisHewan + "\t\tx" + "("+jumlah+")" + " : "+ numberFormat.format(totalBiaya));
    
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("      Informasi Peternakan Sekarang");
        System.out.println("=".repeat(40));
        System.out.println("Jumlah " + jenisHewan + " setelah pembelian: " + getJumlahHewan(jenisHewan) + " ekor");
        
    }
    
    private static void pembelianTanamanPerkebunan() {
        Scanner scanner = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("  \tPembelian Tanah Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println("Daftar Harga:");
        System.out.println("1. Apel \t\t: " + numberFormat.format(new Apel().getHarga()));
        System.out.println("2. Kelapa Sawit \t: " + numberFormat.format(new KelapaSawit().getHarga()));

        System.out.print("Masukkan pilihan kebun (nomor): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan luas tanah: ");
        int jumlah = scanner.nextInt();

        int harga = 0;
        String jenisTanaman = "";
        switch (pilihan) {
            case 1:
                harga = new Apel().getHarga();
                jenisTanaman = "Apel";
                jumlahApel += jumlah;
                break;
            case 2:
                harga = new KelapaSawit().getHarga();
                jenisTanaman = "Kelapa Sawit";
                jumlahKelapaSawit += jumlah;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        int totalBiaya = harga * jumlah;
        totalBudget -= totalBiaya;
        System.out.println("=".repeat(40));
        System.out.println("      Nota Pembelian Tanah Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println(jenisTanaman + "\t\tx" + "("+jumlah+")" + " : "+ numberFormat.format(totalBiaya));
        
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("      Informasi Perkebunan Sekarang");
        System.out.println("=".repeat(40));
        System.out.println("Jumlah " + jenisTanaman + " setelah perkebunan: " + getLuasTanah(jenisTanaman) + " hektar");

    }
    
    private static int getJumlahHewan(String jenisHewan) {
        switch (jenisHewan) {
            case "Bebek":
                return jumlahBebek;
            case "Domba":
                return jumlahDomba;
            case "Unta":
                return jumlahUnta;
            default:
                return 0;
        }
    }
    
    private static int getLuasTanah(String jenisTanaman) {
        switch (jenisTanaman) {
            case "Apel":
                return jumlahApel;
            case "Kelapa Sawit":
                return jumlahKelapaSawit;
            default:
                return 0;
        }
    }
}
