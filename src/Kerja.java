import java.util.*;
import java.text.NumberFormat;

public class Kerja {
    static Scanner iScanner = new Scanner(System.in);
    static float modal = 25000000;
    static Bebek bebek = new Bebek("Bebek", 15, 2, 2000, 110000, 3000);
    static Unta unta = new Unta("Unta", 3, 5, 60000, 12000000, 200000);
    static Domba domba = new Domba("Domba", 4, 4, 15000, 2450000, 45000);
    static Apel apel = new Apel("Apel", 5, 40, 25000, 7500000, 900000);
    static KelapaSawit kelapaSawit = new KelapaSawit("Kelapa Sawit", 6, 500, 18000, 18000000, 8500000);
    static NumberFormat lk = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    static void printInformasi() {
        String p = "=".repeat(40);
        System.out.println(bebek.show());
        System.out.println(domba.show());
        System.out.println(unta.show());
        System.out.println(apel.show());
        System.out.println(kelapaSawit.show());
        System.out.printf("Uang kas anda saat ini\t: Rp. %s\n%s\n\n", lk.format(modal), p);
    }

    static void printMenuInformasi() {
        System.out.printf(
                "Menu\n1. Menampilkan Informasi Peternakan dan Perkebunan\n2. Membeli Ternak atau Kebun\n3. History Transaksi\n0. Exit\nMasukkan Menu Anda : ");
    }

    static void printMenuPembelian() {
        String p = "=".repeat(40);
        System.out.printf(
                "%s\n1. Ternak Bebek (Rp. 110.000/ekor)\n2. Ternak Domba (Rp. 2.450.000/ekor)\n3. Ternak Unta (Rp. 12.000.000/ekor)\n4. Kebun Apel (Rp. 7.500.000/hektar)\n5. Kebun Kelapa Sawit (Rp. 18.000.000/hektar)\n0. Kembali Ke Menu Utama\nMasukkan Menu Anda : ",
                p);
    }
    static void kerjakan(){
        ArrayList<Transaksi> transaksiList = new ArrayList<Transaksi>();

        while (true) {
            printMenuInformasi();
            int pilihan = iScanner.nextInt();

            switch (pilihan) {
                case 1:
                    printInformasi();
                    break;

                case 2:
                   
                    break;

                case 3:

                    break;

                case 0:
                    break;

                default:
                    System.out.println("Masukkan yang benar");
                    break;

            }
        }
    }
    }