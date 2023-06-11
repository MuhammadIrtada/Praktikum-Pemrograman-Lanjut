import java.util.Scanner;

public class Perkebunan implements Kebun, Harga {
    private int luasApel = 5;
    private int luasKelapaSawit = 6;
    String[] kebun = {"Apel", "Kelapa Sawit"};

    public void informasiPerkebunan() {
        System.out.println("Apel\t\t: " + luasApel + " hektar");
        System.out.println("Kelapa Sawit\t: " + luasKelapaSawit + " hektar");
    }

    public void beliTanaman() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.printf("%15s%n","Pembelian Tanah Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println("1. Apel");
        System.out.println("2. Kelapa Sawit");
        System.out.print("Masukkan pilihan kebun (nomor): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan luas tanah: ");
        int luas = scanner.nextInt();
        System.out.println();

        int biaya = 0;
        String jenis;
        switch (pilihan) {
            case 1:
                jenis = kebun[0];
                luasApel += luas;
                biaya = luas * hargaApel;
                break;
            case 2:
                jenis = kebun[1];
                luasKelapaSawit += luas;
                biaya = luas * hargaKelapaSawit;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("=".repeat(40));
        System.out.printf("%15s%n", "Nota Pembelian Tanah Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println(jenis + "\tx(" + luas + ")   : Rp " + biaya);
        System.out.println();

        System.out.println("=".repeat(40));
        System.out.printf("%15s%n", "Informasi Perkebunan Sekarang");
        System.out.println("=".repeat(40));
        System.out.println("Apel\t\t: " + luasApel + " hektar");
        System.out.println("Kelapa Sawit\t: " + luasKelapaSawit + " hektar");
        System.out.println();
    }
}
