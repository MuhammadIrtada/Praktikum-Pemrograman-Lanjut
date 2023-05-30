import java.util.Scanner;

public class Main {
    private static Hewan[] hewanPeternakan = {
            new Bebek(15, 2, 2000, 3000),
            new Unta(3, 5, 60000, 200000),
            new Domba(4, 4, 15000, 45000)
    };

    private static Tanaman[] tanamanPerkebunan = {
            new Apel(5, 40, 25000, 900000),
            new KelapaSawit(6, 500, 18000, 8500000)
    };

    private static int pendapatanPeternakan = 0;
    private static int biayaPerawatanPeternakan = 0;
    private static int pendapatanPerkebunan = 0;
    private static int biayaPerawatanPerkebunan = 0;

    private static int pendapatanTotal = 0;
    private static int biayaPerawatanTotal = 0;
    private static int biayaKehidupan = 0;

    public static void main(String[] args) {
        hitungPendapatanBiaya();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Peternakan");
            System.out.println("2. Perkebunan");
            System.out.println("3. Budgeting");
            System.out.println("4. Exit");

            System.out.print("Masukkan pilihan menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    tampilkanInformasiPeternakan();
                    break;
                case 2:
                    tampilkanInformasiPerkebunan();
                    break;
                case 3:
                    tampilkanBudgeting();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }

            System.out.println();
        }
        scanner.close();
    }

    private static void hitungPendapatanBiaya() {
        for (Hewan hewan : hewanPeternakan) {
            pendapatanPeternakan += hewan.hitungPendapatan();
            biayaPerawatanPeternakan += hewan.hitungBiayaPerawatan();
        }

        for (Tanaman tanaman : tanamanPerkebunan) {
            pendapatanPerkebunan += tanaman.hitungPendapatan();
            biayaPerawatanPerkebunan += tanaman.hitungBiayaPerawatan();
        }

        pendapatanTotal = pendapatanPeternakan + pendapatanPerkebunan;
        biayaPerawatanTotal = biayaPerawatanPeternakan + biayaPerawatanPerkebunan;
        biayaKehidupan = pendapatanTotal - biayaPerawatanTotal;
    }

    private static void tampilkanInformasiPeternakan() {
        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("        Pendapatan Penjualan Hasil Ternak");
        System.out.println("=".repeat(50));
        for (Hewan hewan : hewanPeternakan) {
            System.out.println(hewan.getJenisHewan() + ":                             Rp. " + hewan.hitungPendapatan());
        }
        System.out.println("-".repeat(50));
        System.out.println("Total:                              Rp " + pendapatanPeternakan);
        System.out.println();

        System.out.println("=".repeat(50));
        System.out.println("            Biaya Perawatan Peternakan");
        System.out.println("=".repeat(50));
        for (Hewan hewan : hewanPeternakan) {
            System.out.println(
                    hewan.getJenisHewan() + ":                             Rp. " + hewan.hitungBiayaPerawatan());
        }
        System.out.println("-".repeat(50));
        System.out.println("Total:                             Rp. " + biayaPerawatanPeternakan);
    }

    private static void tampilkanInformasiPerkebunan() {
        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("        Pendapatan Penjualan Hasil Kebun");
        System.out.println("=".repeat(50));
        for (Tanaman tanaman : tanamanPerkebunan) {
            System.out.println(
                    tanaman.getJenisTanaman() + ":                             Rp. " + tanaman.hitungPendapatan());
        }
        System.out.println("-".repeat(50));
        System.out.println("Total:                             Rp " + pendapatanPerkebunan);
        System.out.println();

        System.out.println("=".repeat(50));
        System.out.println("            Biaya Perawatan Perkebunan");
        System.out.println("=".repeat(50));
        for (Tanaman tanaman : tanamanPerkebunan) {
            System.out.println(
                    tanaman.getJenisTanaman() + "                             Rp. " + tanaman.hitungBiayaPerawatan());
        }
        System.out.println("-".repeat(50));
        System.out.println("Total:                            Rp. " + biayaPerawatanPerkebunan);
    }

    private static void tampilkanBudgeting() {
        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("            Pendapatan per Bulan");
        System.out.println("=".repeat(50));
        System.out.println("Ternak:                         Rp " + pendapatanPeternakan);
        System.out.println("Kebun:                          Rp " + pendapatanPerkebunan);
        System.out.println("-".repeat(50));
        System.out.println("Total:                          Rp " + pendapatanTotal);

        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("            Perawatan per Bulan");
        System.out.println("=".repeat(50));
        System.out.println("Ternak:                         Rp. " + biayaPerawatanPeternakan);
        System.out.println("Kebun:                          Rp. " + biayaPerawatanPerkebunan);
        System.out.println("-".repeat(50));
        System.out.println("Total:                          Rp " + biayaPerawatanTotal);

        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("            Biaya Sehari-hari");
        System.out.println("=".repeat(50));
        System.out.println("Ternak:                         Rp " + (pendapatanPeternakan - biayaPerawatanPeternakan));
        System.out.println("Kebun:                          Rp " + (pendapatanPerkebunan - biayaPerawatanPerkebunan));
        System.out.println("-".repeat(50));
        System.out.println("Total:                          Rp " + biayaKehidupan);

    }
}
