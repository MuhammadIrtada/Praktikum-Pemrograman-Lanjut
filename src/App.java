import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        List<Hewan> hewanList = new ArrayList<>();
        hewanList.add(new Bebek(15));
        hewanList.add(new Unta(3));
        hewanList.add(new Domba(4));

        List<Tanaman> tanamanList = new ArrayList<>();
        tanamanList.add(new Apel(5));
        tanamanList.add(new KelapaSawit(6));

        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        while (true) {
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Peternakan");
            System.out.println("2. Perkebunan");
            System.out.println("3. Budgeting");
            System.out.print("Masukkan pilihan menu: ");

            int menu = scanner.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.println("=".repeat(40));
                    System.out.println("    Pendapatan Penjualan Hasil Ternak");
                    System.out.println("=".repeat(40));
                    for (Hewan hewan : hewanList) {
                        System.out.println(hewan.getClass().getSimpleName() + "\t: Rp " + formatter.format(hewan.hitungPendapatan()));
                    }
                    System.out.println("-".repeat(40));
                    System.out.println("Total \t\t: Rp " + formatter.format(totPendapatanTernak(hewanList)));

                    System.out.println();

                    System.out.println("=".repeat(40));
                    System.out.println("            Biaya Perawatan");
                    System.out.println("=".repeat(40));
                    for (Hewan hewan : hewanList) {
                        System.out.println(hewan.getClass().getSimpleName() + "\t: Rp " + formatter.format(hewan.hitungBiayaPerawatan()));
                    }
                    System.out.println("-".repeat(40));
                    System.out.println("Total \t\t: Rp " + formatter.format(totBiayaPerawatanTernak(hewanList)));
                    break;

                case 2:
                    System.out.println();
                    System.out.println("=".repeat(40));
                    System.out.println("    Pendapatan Penjualan Hasil Kebun");
                    System.out.println("=".repeat(40));
                    for (Tanaman tanaman : tanamanList) {
                        System.out.println(tanaman.getClass().getSimpleName() + "\t: Rp " + formatter.format(tanaman.hitungPendapatan()));
                    }
                    System.out.println("-".repeat(40));
                    System.out.println("Total \t\t: Rp " + formatter.format(totPendapatanKebun(tanamanList)));

                    System.out.println();

                    System.out.println("=".repeat(40));
                    System.out.println("            Biaya Perawatan");
                    System.out.println("=".repeat(40));
                    for (Tanaman tanaman : tanamanList) {
                        System.out.println(tanaman.getClass().getSimpleName() + "\t: Rp " + formatter.format(tanaman.hitungBiayaPerawatan()));
                    }
                    System.out.println("-".repeat(40));
                    System.out.println("Total \t\t: Rp " + formatter.format(totBiayaPerawatanKebun(tanamanList)));
                    break;

                case 3:
                    System.out.println();
                    System.out.println("=".repeat(40));
                    System.out.println("    \tPendapatan per Bulan");
                    System.out.println("=".repeat(40));
                    System.out.println("Ternak \t\t: Rp " + formatter.format(totPendapatanTernak(hewanList)));
                    System.out.println("Kebun \t\t: Rp " + formatter.format(totPendapatanKebun(tanamanList)));
                    System.out.println("-".repeat(40));
                    System.out.println("Total \t\t: Rp " + formatter.format(totPendapatan(hewanList, tanamanList)));

                    System.out.println();

                    System.out.println("=".repeat(40));
                    System.out.println("     \tPerawatan per Bulan");
                    System.out.println("=".repeat(40));
                    System.out.println("Ternak \t\t: Rp " + formatter.format(totBiayaPerawatanTernak(hewanList)));
                    System.out.println("Kebun \t\t: Rp " + formatter.format(totBiayaPerawatanKebun(tanamanList)));
                    System.out.println("-".repeat(40));
                    System.out.println("Total \t\t: Rp " + formatter.format(totBiayaPerawatan(hewanList, tanamanList)));

                    System.out.println();

                    System.out.println("=".repeat(40));
                    System.out.println("     \tBiaya sehari-hari");
                    System.out.println("=".repeat(40));
                    System.out.println("Pendapatan \t: Rp " + formatter.format(totPendapatan(hewanList, tanamanList)));
                    System.out.println("Perawatan \t: Rp " + formatter.format(totBiayaPerawatan(hewanList, tanamanList)));
                    System.out.println("-".repeat(40));
                    System.out.println("Total \t\t: Rp " + formatter.format(totBiayaSeharihari(hewanList, tanamanList)));
                    break;

                default:
                    System.out.println("Mohon Maaf, Silakan Masukkan menu yang tersedia");
            }
        }
    }
    

    public static double totPendapatanTernak(List<Hewan> hewanList) {
        double total = 0;
        for (Hewan hewan : hewanList) {
            total += hewan.hitungPendapatan();
        }
        return total;
    }

    public static double totBiayaPerawatanTernak(List<Hewan> hewanList) {
        double total = 0;
        for (Hewan hewan : hewanList) {
            total += hewan.hitungBiayaPerawatan();
        }
        return total;
    }

    public static double totPendapatanKebun(List<Tanaman> tanamanList) {
        double total = 0;
        for (Tanaman tanaman : tanamanList) {
            total += tanaman.hitungPendapatan();
        }
        return total;
    }

    public static double totBiayaPerawatanKebun(List<Tanaman> tanamanList) {
        double total = 0;
        for (Tanaman tanaman : tanamanList) {
            total += tanaman.hitungBiayaPerawatan();
        }
        return total;
    }

    public static double totPendapatan(List<Hewan> hewanList, List<Tanaman> tanamanList) {
        return totPendapatanTernak(hewanList) + totPendapatanKebun(tanamanList);
    }

    public static double totBiayaPerawatan(List<Hewan> hewanList, List<Tanaman> tanamanList) {
        return totBiayaPerawatanTernak(hewanList) + totBiayaPerawatanKebun(tanamanList);
    }

    public static double totBiayaSeharihari(List<Hewan> hewanList, List<Tanaman> tanamanList) {
        return totPendapatan(hewanList, tanamanList) - totBiayaPerawatan(hewanList, tanamanList);
    }
}
