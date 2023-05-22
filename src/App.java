import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static DecimalFormat formatter = new DecimalFormat("#,###.##");
    static Scanner baru = new Scanner(System.in);
    static Bebek bebek = new Bebek(15, 2, 2000, 3000);
    static Unta unta = new Unta(3, 5, 60000, 200000);
    static Domba domba = new Domba(4, 4, 15000, 45000);
    static Hewan[] allHewan = { bebek, unta, domba };
    static Apel apel = new Apel(5, 40, 25000, 900000);
    static KelapaSawit kelapa = new KelapaSawit(6, 500, 18000, 8500000);
    static Tanaman[] allTanamans = { apel, kelapa };

    public static void main(String[] args) throws Exception {
        boolean loop = true;
        do {
            System.out.println("Menu :");
            System.out.println("1. Peternakan\n2. Perkebunan\n3. Budgeting");
            System.out.print("Masukkan pilihan menu: ");
            int pilih = baru.nextInt();
            switch (pilih) {
                case 1:
                    bebek.getDetail(allHewan);
                    break;
                case 2:
                    apel.getDetail(allTanamans);
                    break;
                case 3:
                    getAll();
                    break;
                default:
                    loop = false;
                    break;
            }
        } while (loop);
    }

    private static void getAll() {
        // pendapatan
        System.out.println("=".repeat(40));
        System.out.println("\t   Pendapatan per Bulan");
        System.out.println("=".repeat(40));
        System.out.printf("%-15s %20s\n", "Ternak" + ":", "Rp " + formatter.format(domba.getTotalPendapatan()));
        System.out.printf("%-15s %20s\n", "Kebun" + ":", "Rp " + formatter.format(apel.getTotalPendapatan()));
        System.out.println("-".repeat(40));
        System.out.printf("%-15s %20s\n\n", "Total: ",
                "Rp " + formatter.format(domba.getTotalPendapatan() + apel.getTotalPendapatan()));
        System.out.println("=".repeat(40));

        // perawatan
        System.out.println("\t   Perawatan per Bulan");
        System.out.println("=".repeat(40));
        System.out.printf("%-15s %20s\n", "Ternak" + ":", "Rp " + formatter.format(domba.getTotalPerawatan()));
        System.out.printf("%-15s %20s\n", "Kebun" + ":", "Rp " + formatter.format(apel.getTotalPerawatan()));
        System.out.println("-".repeat(40));
        System.out.printf("%-15s %20s\n\n", "Total: ",
                "Rp " + formatter.format(domba.getTotalPerawatan() + apel.getTotalPerawatan()));

        // biaya
        System.out.println("=".repeat(40));
        System.out.println("\t   Biaya Sehari-hari");
        System.out.println("=".repeat(40));
        System.out.printf("%-15s %20s\n", "Pendapatan" + ":",
                "Rp " + formatter.format(domba.getTotalPendapatan() + apel.getTotalPendapatan()));
        System.out.printf("%-15s %20s\n", "Perawatan" + ":",
                "Rp " + formatter.format(domba.getTotalPerawatan() + apel.getTotalPerawatan()));
        System.out.println("-".repeat(40));
        System.out.printf("%-15s %20s\n\n", "Total: ",
                "Rp " + formatter.format((domba.getTotalPerawatan() + apel.getTotalPerawatan() + domba.getTotalPendapatan() + apel.getTotalPendapatan())/30));

    }
}
