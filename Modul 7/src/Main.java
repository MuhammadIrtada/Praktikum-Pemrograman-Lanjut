import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static int bulan = 30;
    static ArrayList<Ternak> ternakList = new ArrayList<>();
    static ArrayList<Kebun> kebunList = new ArrayList<>();
    static NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean loopMenu = true;
        ternakList.add(new Bebek("Bebek", 15, 2, 2000, 3000));
        ternakList.add(new Unta("Unta", 3, 5, 60000, 200000));
        ternakList.add(new Domba("Domba", 4, 4, 15000, 45000));
        kebunList.add(new Apel("Apel", 5, 40, 25000, 900000));
        kebunList.add(new KelapaSawit("Kelapa Sawit", 6, 500, 18000, 8500000));
        do {
            System.out.println("Menu:");
            System.out.println("1. Peternakan\n2. Perkebunan\n3. Budgeting");
            System.out.print("Masukkan pilihan menu: ");
            int pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    peternakan();
                    break;
                case 2:
                    perkebunan();
                    break;
                case 3:
                    budgeting();
                    break;
                case 0:
                    loopMenu = false;
                    break;
            }
        } while (loopMenu);
    }

    public static void peternakan() {
        System.out.println("=".repeat(40));
        System.out.printf("%25s%n", "Pendapatan Penjualan Hasil Ternak");
        System.out.println("=".repeat(40));
        tampilkanPendapatanPenjualanTernak();
        System.out.println("=".repeat(40));
        System.out.printf("%27s%n", "Biaya Perawatan");
        System.out.println("=".repeat(40));
        tampilkanBiayaPerawatanTernak();
    }

    public static void perkebunan() {
        System.out.println("=".repeat(40));
        System.out.printf("%25s%n", "Pendapatan Penjualan Hasil Kebun");
        System.out.println("=".repeat(40));
        tampilkanPendapatanPenjualanKebun();
        System.out.println("=".repeat(40));
        System.out.printf("%27s%n", "Biaya Perawatan");
        System.out.println("=".repeat(40));
        tampilkanBiayaPerawatanKebun();
    }

    public static void budgeting() {
        System.out.println("=".repeat(40));
        System.out.printf("%30s%n", "Pendapatan per Bulan");
        System.out.println("=".repeat(40));
        pendapatanPerBulan();
        System.out.println("=".repeat(40));
        System.out.printf("%28s%n", "Perawatan per Bulan");
        System.out.println("=".repeat(40));
        perawatanPerBulan();
        System.out.println("=".repeat(40));
        System.out.printf("%27s%n", "Biaya sehari-hari");
        System.out.println("=".repeat(40));
        biayaHarian();
        System.out.println("=".repeat(40));
    }

    public static void tampilkanPendapatanPenjualanTernak() {
        float totalPendapatan = 0;
        for (Ternak ternak : ternakList) {
            float pendapatan = ternak.totalPenjualan();
            System.out.printf("%s:%16s %s%n", ternak.getJenis(), "", formatRupiah.format(pendapatan));
            totalPendapatan += pendapatan;
        }
        System.out.println("-".repeat(40));
        System.out.printf("TOTAL:%15s %s%n", "", formatRupiah.format(totalPendapatan));
    }

    public static void tampilkanBiayaPerawatanTernak() {
        float totalPerawatan = 0;
        for (Ternak ternak : ternakList) {
            float perawatan = ternak.totalPerawatan();
            System.out.printf("%s:%16s %s%n", ternak.getJenis(), "", formatRupiah.format(perawatan));
            totalPerawatan += perawatan;
        }
        System.out.println("-".repeat(40));
        System.out.printf("TOTAL:%15s %s%n", "", formatRupiah.format(totalPerawatan));
    }

    public static void tampilkanPendapatanPenjualanKebun() {
        float totalPendapatan = 0;
        for (Kebun kebun : kebunList) {
            float pendapatan = kebun.totalPenjualan();
            System.out.printf("%s:%5s %s%n", kebun.getJenis(), "", formatRupiah.format(pendapatan));
            totalPendapatan += pendapatan;
        }
        System.out.println("-".repeat(40));
        System.out.printf("TOTAL:%12s %s%n", "", formatRupiah.format(totalPendapatan));
    }

    public static void tampilkanBiayaPerawatanKebun() {
        float totalPerawatan = 0;
        for (Kebun kebun : kebunList) {
            float perawatan = kebun.totalPerawatan();
            System.out.printf("%s:%5s %s%n", kebun.getJenis(), "", formatRupiah.format(perawatan));
            totalPerawatan += perawatan;
        }
        System.out.println("-".repeat(40));
        System.out.printf("TOTAL:%12s %s%n", "", formatRupiah.format(totalPerawatan));
    }

    public static void pendapatanPerBulan() {
        float totalPendapatanTernak = 0;
        float totalPendapatanKebun = 0;
        for (Ternak ternak : ternakList) {
            float pendapatanT = ternak.totalPenjualan();
            totalPendapatanTernak += pendapatanT;
        }
        for (Kebun kebun : kebunList) {
            float pendapatanK = kebun.totalPenjualan();
            totalPendapatanKebun += pendapatanK;
        }
        System.out.printf("Ternak:%14s %s%n", "", formatRupiah.format(totalPendapatanTernak));
        System.out.printf("Kebun:%12s %s%n", "", formatRupiah.format(totalPendapatanKebun));
        System.out.println("-".repeat(40));
        float totalPendapatan = totalPendapatanKebun + totalPendapatanTernak;
        System.out.printf("TOTAL:%12s %s%n", "", formatRupiah.format(totalPendapatan));
    }

    public static float totalPendapatan() {
        float totalPendapatan = 0;
        for (Ternak ternak : ternakList) {
            totalPendapatan += ternak.totalPenjualan();
        }
        for (Kebun kebun : kebunList) {
            totalPendapatan += kebun.totalPenjualan();
        }
        return totalPendapatan;
    }

    public static void perawatanPerBulan() {
        float totalPerawatanTernak = 0;
        float totalPerawatanKebun = 0;
        for (Ternak ternak : ternakList) {
            float PerawatanT = ternak.totalPerawatan();
            totalPerawatanTernak += PerawatanT;
        }
        for (Kebun kebun : kebunList) {
            float PerawatanK = kebun.totalPerawatan();
            totalPerawatanKebun += PerawatanK;
        }
        System.out.printf("Ternak:%14s %s%n", "", formatRupiah.format(totalPerawatanTernak));
        System.out.printf("Kebun:%12s %s%n", "", formatRupiah.format(totalPerawatanKebun));
        System.out.println("-".repeat(40));
        float totalPerawatan = totalPerawatanKebun + totalPerawatanTernak;
        System.out.printf("TOTAL:%12s %s%n", "", formatRupiah.format(totalPerawatan));
    }

    public static float totalPerawatan() {
        float totalPerawatan = 0;
        for (Ternak ternak : ternakList) {
            totalPerawatan += ternak.totalPerawatan();
        }
        for (Kebun kebun : kebunList) {
            totalPerawatan += kebun.totalPerawatan();
        }
        return totalPerawatan;
    }

    public static void biayaHarian() {
        float totalBiayaTernak = 0;
        float totalBiayaKebun = 0;
        System.out.printf("Pendapatan:%7s %s%n", "", formatRupiah.format(totalPendapatan()));
        System.out.printf("Perawatan:%8s %s%n", "", formatRupiah.format(totalPerawatan()));
        System.out.println("-".repeat(40));
        System.out.printf("TOTAL:%14s %s%n", "", formatRupiah.format(totalPendapatan() - totalPerawatan()));
    }
}

