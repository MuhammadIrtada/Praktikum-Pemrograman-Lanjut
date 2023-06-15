import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Bebek bebek = new Bebek("Bebek", 15, 3000, 110000, 2, 2000);
    static Unta unta = new Unta("Unta", 3, 200000, 12000000, 5, 60000);
    static Domba domba = new Domba("Domba", 4, 45000, 2450000, 4, 15000);
    static Apel apel = new Apel("Apel", 5, 900000, 7500000, 40, 25000);
    static KelapaSawit kelapasawit = new KelapaSawit("Kelapa Sawit", 6, 8500000, 18000000, 500, 18000);

    public static void main(String[] args) {
        Peternakan[] ternak = { bebek, unta, domba };
        Perkebunan[] kebun = { apel, kelapasawit };

        System.out.println("1. Peternakan");
        System.out.println("2. Perkebunan");
        System.out.println("3. Budgeting");
        System.out.print("Masukkan Pilihan Menu: ");
        int pilih = sc.nextInt();

        // TERNAK//
        if (pilih == 1) {
            System.out.println("=".repeat(50));
            System.out.println("\tPendapatan Penjualan Hasil Ternak");
            System.out.println("=".repeat(50));
            for (int i = 0; i < ternak.length; i++) {
                ternak[i].display1();
            }
            System.out.println("-".repeat(50));
            System.out.println("TOTAL:\t\t\t Rp. " + totalPendapatanTernak());
            System.out.println();
            System.out.println("=".repeat(50));
            System.out.println("\t\tBiaya Perawatan");
            System.out.println("=".repeat(50));
            for (int i = 0; i < ternak.length; i++) {
                ternak[i].display2();
            }
            System.out.println("-".repeat(50));
            System.out.println("TOTAL:\t\t\t Rp. " + biayaPerawatanTernak());
        }

        // KEBUN//
        else if (pilih == 2) {
            System.out.println("=".repeat(50));
            System.out.println("\tPendapatan Penjualan Hasil Kebun");
            System.out.println("=".repeat(50));
            for (int i = 0; i < kebun.length; i++) {
                kebun[i].display1();
            }
            System.out.println("-".repeat(50));
            System.out.println("TOTAL:\t\t\t Rp. " + totalPendapatanKebun());

            System.out.println();
            System.out.println("=".repeat(50));
            System.out.println("\t\tBiaya Perawatan");
            System.out.println("=".repeat(50));
            for (int i = 0; i < kebun.length; i++) {
                kebun[i].display2();
            }
            System.out.println("-".repeat(50));
            System.out.println("TOTAL:\t\t\t Rp. " + biayaPerawatanKebun());
        }

        // BUDGETING//
        else if (pilih == 3) {
            System.out.println("=".repeat(50));
            System.out.println("\t\tPendapatan Per Bulan");
            System.out.println("=".repeat(50));
            System.out.println("Ternak:\t\t\t Rp. " + totalPendapatanTernak());
            System.out.println("Kebun:\t\t\t Rp. " + totalPendapatanKebun());
            System.out.println("-".repeat(50));
            System.out.println("Total:\t\t\t Rp. " + totalPendapatan());

            System.out.println();
            System.out.println("=".repeat(50));
            System.out.println("\t\tPerawatan Per Bulan");
            System.out.println("=".repeat(50));
            System.out.println("Ternak:\t\t\t Rp. " + biayaPerawatanTernak());
            System.out.println("Kebun:\t\t\t Rp. " + biayaPerawatanKebun());
            System.out.println("-".repeat(50));
            System.out.println("Total:\t\t\t Rp. " + biayaPerawatan());

            System.out.println();
            System.out.println("=".repeat(50));
            System.out.println("\t\tBiaya Sehari-Hari");
            System.out.println("=".repeat(50));
            System.out.println("Pendapatan:\t\t Rp. " + totalPendapatan());
            System.out.println("Perawatan:\t\t Rp. " + biayaPerawatan());
            System.out.println("-".repeat(50));
            System.out.println("TOTAL:\t\t\t Rp. " + biayaSehari());
        } else {
            System.out.println("Pilihan Tidak Valid");
        }
    }

    public static double totalPendapatanTernak() {
        return bebek.pendapatan() + unta.pendapatan() + domba.pendapatan();
    }

    public static double totalPendapatanKebun() {
        return apel.pendapatan() + kelapasawit.pendapatan();
    }

    public static double totalPendapatan() {
        return totalPendapatanTernak() + totalPendapatanKebun();
    }

    public static double biayaPerawatanTernak() {
        return bebek.perawatan() + unta.perawatan() + domba.perawatan();
    }

    public static double biayaPerawatanKebun() {
        return apel.perawatan() + kelapasawit.perawatan();
    }

    public static double biayaPerawatan() {
        return biayaPerawatanTernak() + biayaPerawatanKebun();
    }

    public static double biayaSehari() {
        return totalPendapatan() - biayaPerawatan();
    }
}