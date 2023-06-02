import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.*;

public class App {
    public static int bulan = 30;
    static Domba domba = new Domba("Domba", 4, 4, 15000, 45000);
    static Bebek bebek = new Bebek("Bebek", 15, 2, 2000, 3000);
    static Unta unta = new Unta("Unta", 3, 5, 60000, 200000);
    static Apel apel = new Apel("Apel", 5, 40, 25000, 900000);
    static KelapaSawit kelapaSawit = new KelapaSawit("Kelapa sawit", 6, 500, 18000, 8500000);

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat uang = (DecimalFormat) DecimalFormat.getCurrencyInstance(new Locale("id", "ID"));
        DecimalFormatSymbols uangSimbol = uang.getDecimalFormatSymbols();
        uangSimbol.setCurrencySymbol("Rp ");
        uang.setDecimalFormatSymbols(uangSimbol);
        while (true) {
            System.out.print("Menu :\n1. Peternakan\n2. Perkebunan\n3. Budgeting\nMasukkan Pilihan Anda : ");
            int a = scan.nextInt();
            System.out.println();
            if (a == 1) {
                // Output 1
                System.out.println("=".repeat(50));
                System.out.println("Pendapatan Penjualan Hasil Ternak");
                System.out.println("=".repeat(50));
                String uangAsli = uang.format((domba.totalJual() * bulan));
                System.out.println("Domba: " + uangAsli);
                uangAsli = uang.format((bebek.totalJual() * bulan));
                System.out.println("Bebek: " + uangAsli);
                uangAsli = uang.format((unta.totalJual() * bulan));
                System.out.println("Unta: " + uangAsli);
                System.out.println("-".repeat(50));
                float total = (domba.totalJual() * bulan) + (bebek.totalJual() * bulan) + (unta.totalJual() * bulan);
                uangAsli = uang.format(total);
                System.out.println("TOTAL: " + uangAsli);
                System.out.println();

                System.out.println("=".repeat(50));
                System.out.println("Biaya Perawatan");
                System.out.println("=".repeat(50));
                uangAsli = uang.format((domba.totalPerawatan() * bulan));
                System.out.println("Domba: " + uangAsli);
                uangAsli = uang.format((bebek.totalPerawatan() * bulan));
                System.out.println("Bebek: " + uangAsli);
                uangAsli = uang.format((unta.totalPerawatan() * bulan));
                System.out.println("Unta: " + uangAsli);
                System.out.println("-".repeat(50));
                total = (domba.totalPerawatan() * bulan) + (bebek.totalPerawatan() * bulan)
                        + (unta.totalPerawatan() * bulan);
                uangAsli = uang.format(total);
                System.out.println("TOTAL: " + uangAsli);
                System.out.println();
            } else if (a == 2) {
                // Output 2
                System.out.println("=".repeat(50));
                System.out.println("Pendapatan Penjualan Hasil Kebun");
                System.out.println("=".repeat(50));
                String uangAsli = uang.format((apel.totalJual() * bulan));
                System.out.println("apel: " + uangAsli);
                uangAsli = uang.format((kelapaSawit.totalJual() * bulan));
                System.out.println("kelapaSawit: " + uangAsli);
                System.out.println("-".repeat(50));
                float total = (apel.totalJual() * bulan) + (kelapaSawit.totalJual() * bulan);
                uangAsli = uang.format(total);
                System.out.println("TOTAL: " + uangAsli);
                System.out.println();

                System.out.println("=".repeat(50));
                System.out.println("Biaya Perawatan");
                System.out.println("=".repeat(50));
                uangAsli = uang.format((apel.totalPerawatan() * bulan));
                System.out.println("apel: " + uangAsli);
                uangAsli = uang.format((kelapaSawit.totalPerawatan() * bulan));
                System.out.println("kelapaSawit: " + uangAsli);
                uangAsli = uang.format((unta.totalPerawatan() * bulan));
                System.out.println("Unta: " + uangAsli);
                System.out.println("-".repeat(50));
                total = (apel.totalPerawatan() * bulan) + (kelapaSawit.totalPerawatan() * bulan);
                uangAsli = uang.format(total);
                System.out.println("TOTAL: " + uangAsli);
                System.out.println();
            } else if (a == 3) {
                // Output 3
                System.out.println("=".repeat(50));
                System.out.println("Pendapatan per Bulan");
                System.out.println("=".repeat(50));
                float total1 = (domba.totalJual() * bulan) + (bebek.totalJual() * bulan) + (unta.totalJual() * bulan);
                String uangAsli = uang.format(total1);
                System.out.println("Ternak: " + uangAsli);
                float total2 = (apel.totalJual() * bulan) + (kelapaSawit.totalJual() * bulan);
                uangAsli = uang.format(total2);
                System.out.println("Kebun: " + uangAsli);
                System.out.println("-".repeat(50));
                float pendapatan = total1 + total2;
                uangAsli = uang.format(pendapatan);
                System.out.println("TOTAL: " + uangAsli);
                System.out.println();

                System.out.println("=".repeat(50));
                System.out.println("Perawatan per Bulan");
                System.out.println("=".repeat(50));
                total1 = (domba.totalPerawatan() * bulan) + (bebek.totalPerawatan() * bulan)
                        + (unta.totalPerawatan() * bulan);
                uangAsli = uang.format(total1);
                System.out.println("Ternak: " + uangAsli);
                total2 = (apel.totalPerawatan() * bulan) + (kelapaSawit.totalPerawatan() * bulan);
                uangAsli = uang.format(total2);
                System.out.println("Kebun: " + uangAsli);
                System.out.println("-".repeat(50));
                float perawatan = total1 + total2;
                uangAsli = uang.format(perawatan);
                System.out.println("TOTAL: " + uangAsli);
                System.out.println();

                System.out.println("=".repeat(50));
                System.out.println("Biaya sehari-hari");
                System.out.println("=".repeat(50));
                uangAsli = uang.format(pendapatan);
                System.out.println("Pendapatan: " + uangAsli);
                uangAsli = uang.format(perawatan);
                System.out.println("Perawatan: " + uangAsli);
                System.out.println("-".repeat(50));
                float akhir = pendapatan - perawatan;
                uangAsli = uang.format(akhir);
                System.out.println("TOTAL: " + uangAsli);
                System.out.println();
            } else{
                break;
            }
        }
        System.out.println("Terima Kasih");
    }
}
