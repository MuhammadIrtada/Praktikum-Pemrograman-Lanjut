import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner ra = new Scanner(System.in);
    // objek hewan
    static DecimalFormat formatter = new DecimalFormat("#,###.##");
    static Domba domba = new Domba(4, 4, 15000, 45000);
    static Bebek bebek = new Bebek(15, 2, 2000, 3000);
    static Unta unta = new Unta(3, 5, 60000, 200000);
    static Apel apel = new Apel(5, 40, 25000, 900000);
    static KelapaSawit kelapa = new KelapaSawit(6, 500, 18000, 8500000);
    static Hewan[] hewans = { domba, bebek, unta };
    static Tanaman[] tanamans = { apel, kelapa };

    public static void main(String[] args) {
        boolean benar = true;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Peternakan");
            System.out.println("1. Perkebunan");
            System.out.println("3. Budgeting");
            System.out.print("Masukkan pilihan menu:");
            int memilih = ra.nextInt();
            if (memilih == 1) {
                Hewan.penghasilan(hewans);
                Hewan.Perawatans(hewans);
            } else if (memilih == 2) {
                Tanaman.penghasilan(tanamans);
                Tanaman.Perawatans(tanamans);
            } else if (memilih == 3) {
                Pengaturan();
            } else {
                benar = false;
            }

        } while (benar);
    }

    public static void Pengaturan() {
        System.out.println("========================================");
        System.out.println("         Pendapatan per Bulan");
        System.out.println("========================================");
        System.out.println("Ternak:\t\t" + "Rp." + formatter.format(bebek.getTotalPenghasilan()));
        System.out.println("Kebun:\t\t" + "Rp." + formatter.format(kelapa.getTotalPenghasilan()));
        System.out.println("----------------------------------------");
        System.out.println(
                "TOTAL:\t\tRp." + formatter.format(bebek.getTotalPenghasilan() + kelapa.getTotalPenghasilan()));
        System.out.println("========================================");
        System.out.println("         Perawatan per Bulan");
        System.out.println("========================================");
        System.out.println("Ternak:\t\t" + "Rp." + formatter.format(bebek.getTotalPerawatan()));
        System.out.println("Kebun:\t\t" + "Rp." + formatter.format(kelapa.getTotalPerawatan()));
        System.out.println("----------------------------------------");
        System.out.println("TOTAL:\t\tRp." + formatter.format(bebek.getTotalPerawatan() + kelapa.getTotalPerawatan()));
        System.out.println("========================================");
        System.out.println("          Biaya sehari-hari");
        System.out.println("========================================");
        System.out.println("Pendapatan:\t\t" + "Rp."
                + formatter.format(bebek.getTotalPenghasilan() + kelapa.getTotalPenghasilan()));
        System.out.println(
                "Perawatan:\t\t" + "Rp." + formatter.format(bebek.getTotalPerawatan() + kelapa.getTotalPerawatan()));
        System.out.println("----------------------------------------");
        System.out.println("TOTAL:\t\t\tRp." + formatter.format(((bebek.getTotalPerawatan() + kelapa.getTotalPerawatan())
                + (bebek.getTotalPenghasilan() + kelapa.getTotalPenghasilan()))/30));

    }
}
