package MODUL_7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("1. Peternakan");
            System.out.println("2. Perkebunan");
            System.out.println("3. Budgeting");
            System.out.print("Masukkan pilihan menu: ");
            int menu = scanner.nextInt();
            System.out.println("=".repeat(50));

            switch (menu) {
                case 1:
                    menuPendapatanTernak();
                    break;
                case 2:
                    menuPendapatanPerkebunan();
                    break;
                case 3:
                    menuBudgeting();
                    break;
                case 4:
                    run = false;
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void menuPendapatanTernak() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        Bebek bebek = new Bebek(15);
        Unta unta = new Unta(3);
        Domba domba = new Domba(4);

        int pendapatanBebek = bebek.hitungPendapatan();
        int pendapatanUnta = unta.hitungPendapatan();
        int pendapatanDomba = domba.hitungPendapatan();
        int totalPendapatan = pendapatanBebek + pendapatanUnta + pendapatanDomba;

        System.out.println("\tPendapatan Penjualan Hasil Ternak\t:");
        System.out.println("=".repeat(50));
        System.out.println("Bebek\t\t\t: Rp " + decimalFormat.format(pendapatanBebek));
        System.out.println("Unta\t\t\t: Rp " + decimalFormat.format(pendapatanUnta));
        System.out.println("Domba\t\t\t: Rp " + decimalFormat.format(pendapatanDomba));
        System.out.println("-".repeat(50));
        System.out.println("Total\t\t\t: Rp " + decimalFormat.format(totalPendapatan));

        int biayaPerawatanBebek = bebek.hitungBiayaPerawatan();
        int biayaPerawatanUnta = unta.hitungBiayaPerawatan();
        int biayaPerawatanDomba = domba.hitungBiayaPerawatan();
        int totalBiayaPerawatan = biayaPerawatanBebek + biayaPerawatanUnta + biayaPerawatanDomba;

        System.out.println("=".repeat(50));
        System.out.println("\t\tBiaya perawatan\t\t");
        System.out.println("=".repeat(50));
        System.out.println("Bebek\t\t\t: Rp " + decimalFormat.format(biayaPerawatanBebek));
        System.out.println("Unta\t\t\t: Rp " + decimalFormat.format(biayaPerawatanUnta));
        System.out.println("Domba\t\t\t: Rp " + decimalFormat.format(biayaPerawatanDomba));
        System.out.println("-".repeat(50));
        System.out.println("Total Biaya Perawatan\t: Rp " + decimalFormat.format(totalBiayaPerawatan));
    }

    public static void menuPendapatanPerkebunan() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        Apel apel = new Apel(5);
        KelapaSawit kelapaSawit = new KelapaSawit(6);

        int pendapatanApel = apel.hitungPendapatan();
        int pendapatanKelapaSawit = kelapaSawit.hitungPendapatan();
        int totalPendapatan = pendapatanApel + pendapatanKelapaSawit;

        System.out.println("\tPendapatan Penjualan Hasil Perkebunan\t");
        System.out.println("=".repeat(50));
        System.out.println("Apel\t\t\t: Rp " + decimalFormat.format(pendapatanApel));
        System.out.println("Kelapa Sawit\t\t: Rp " + decimalFormat.format(pendapatanKelapaSawit));
        System.out.println("-".repeat(50));
        System.out.println("Total\t\t\t: Rp " + decimalFormat.format(totalPendapatan));

        int biayaPerawatanApel = apel.hitungBiayaPerawatan();
        int biayaPerawatanKelapaSawit = kelapaSawit.hitungBiayaPerawatan();
        int totalBiayaPerawatan = biayaPerawatanApel + biayaPerawatanKelapaSawit;

        System.out.println("=".repeat(50));
        System.out.println("\t\tBiaya perawatan\t\t");
        System.out.println("=".repeat(50));
        System.out.println("Apel\t\t\t: Rp " + decimalFormat.format(biayaPerawatanApel));
        System.out.println("Kelapa Sawit\t\t: Rp " + decimalFormat.format(biayaPerawatanKelapaSawit));
        System.out.println("-".repeat(50));
        System.out.println("Total Biaya Perawatan\t: Rp " + decimalFormat.format(totalBiayaPerawatan));
    }

    public static void menuBudgeting() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        Bebek bebek = new Bebek(15);
        Unta unta = new Unta(3);
        Domba domba = new Domba(4);
        Apel apel = new Apel(5);
        KelapaSawit kelapaSawit = new KelapaSawit(6);

        int pendapatanTernak = bebek.hitungPendapatan() + unta.hitungPendapatan() + domba.hitungPendapatan();
        int biayaPerawatanTernak = bebek.hitungBiayaPerawatan() + unta.hitungBiayaPerawatan()
                + domba.hitungBiayaPerawatan();
        int pendapatanPerkebunan = apel.hitungPendapatan() + kelapaSawit.hitungPendapatan();
        int biayaPerawatanPerkebunan = apel.hitungBiayaPerawatan() + kelapaSawit.hitungBiayaPerawatan();
        int totalPendapatan = pendapatanTernak + pendapatanPerkebunan;
        int totalBiayaPerawatan = biayaPerawatanTernak + biayaPerawatanPerkebunan;
        int biayaKehidupan = totalPendapatan - totalBiayaPerawatan;

        System.out.println("\t\tPendapatan per Bulan\t\t");
        System.out.println("=".repeat(50));
        System.out.println("Ternak\t\t: Rp " + decimalFormat.format(pendapatanTernak));
        System.out.println("Kebun\t\t: Rp " + decimalFormat.format(pendapatanPerkebunan));
        System.out.println("-".repeat(50));
        System.out.println("TOTAL\t\t: Rp " + decimalFormat.format(totalPendapatan));
        System.out.println("=".repeat(50));

        System.out.println("\t\tPerawatan per Bulan \t\t");
        System.out.println("=".repeat(50));
        System.out.println("Ternak\t\t: Rp " + decimalFormat.format(biayaPerawatanTernak));
        System.out.println("Kebun\t\t: Rp " + decimalFormat.format(biayaPerawatanPerkebunan));
        System.out.println("-".repeat(50));
        System.out.println("TOTAL\t\t: Rp " + decimalFormat.format(totalBiayaPerawatan));
        System.out.println("=".repeat(50));

        System.out.println("\t\tBiaya sehari-hari \t\t");
        System.out.println("=".repeat(50));
        System.out.println("Pendapatan\t: Rp " + decimalFormat.format(totalPendapatan));
        System.out.println("Perawatan\t: Rp " + decimalFormat.format(totalBiayaPerawatan));
        System.out.println("-".repeat(50));
        System.out.println("Total Biaya Sehari-hari\t: Rp " + decimalFormat.format(biayaKehidupan));
    }
}
