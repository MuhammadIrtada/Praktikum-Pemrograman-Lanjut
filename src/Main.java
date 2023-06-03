
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Bebek bebek = new Bebek("Bebek", 15, 110000, 2, 2000, 3000);
    static Domba domba = new Domba("Domba", 4, 2450000, 4, 15000, 45000);
    static Unta unta = new Unta("Unta", 3, 12000000, 5, 60000, 200000);
    static Apel apel = new Apel("Apel", 5, 7500000, 40, 25000, 900000);
    static Sawit sawit = new Sawit("Kelapa Sawit", 6, 18000000, 500, 18000, 8500000);

    public static void main(String[] args) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        Hewan[] arrHewan = new Hewan[3];
        arrHewan[0] = bebek;
        arrHewan[1] = unta;
        arrHewan[2] = domba;

        Tanaman[] arrTanaman = new Tanaman[2];
        arrTanaman[0] = apel;
        arrTanaman[1] = sawit;

        Scanner elma = new Scanner(System.in);
        int menu = 0;
        // do {
        System.out.println("1. Peternakan");
        System.out.println("2. Perkebunan");
        System.out.println("3. Budgeting");
        System.out.print("Masukkan pilihan menu: ");
        menu = elma.nextInt();
        System.out.println();

        if (menu == 1) {

            double totalPendapatanHewan = 0;
            double totalPerawatanHewan = 0;

            System.out.println("=".repeat(39));
            System.out.println("   Pendapatan Penjualan Hasil Ternak");
            System.out.println("=".repeat(39));
            for (int i = 0; i < arrHewan.length; i++) {
                totalPendapatanHewan += arrHewan[i].pendapatan();
                System.out.println(arrHewan[i].getJenis() + ":" + " ".repeat(14)
                        + formatRupiah.format(arrHewan[i].pendapatan()));
            }
            System.out.println("-".repeat(39));

            System.out.println("TOTAL:" + " ".repeat(13) + formatRupiah.format(totalPendapatanHewan));
            System.out.println();

            System.out.println("=".repeat(39));
            System.out.println(" ".repeat(12) + "Biaya Perawatan");
            System.out.println("=".repeat(39));
            for (int i = 0; i < arrHewan.length; i++) {
                totalPerawatanHewan += arrHewan[i].perawatan();
                System.out.println(arrHewan[i].getJenis() + ":" + " ".repeat(14)
                        + formatRupiah.format(arrHewan[i].perawatan()));
            }
            System.out.println("-".repeat(39));
            System.out.println("TOTAL:" + " ".repeat(13) + formatRupiah.format(totalPerawatanHewan));
            System.out.println();

        } else if (menu == 2) {
            double totalPendapatanTanaman = 0;
            double totalPerawatanTanaman = 0;
            System.out.println("=".repeat(39));
            System.out.println("   Pendapatan Penjualan Hasil Kebun");
            System.out.println("=".repeat(39));
            for (int i = 0; i < arrTanaman.length; i++) {
                totalPendapatanTanaman += arrTanaman[i].pendapatan();
                if (arrTanaman[i].getJenis() == "Kelapa Sawit") {
                    System.out.println(arrTanaman[i].getJenis() + ":" + "\t"
                            + formatRupiah.format(arrTanaman[i].pendapatan()));
                } else {
                    System.out.println(arrTanaman[i].getJenis() + ":" + " ".repeat(13)
                            + formatRupiah.format(arrTanaman[i].pendapatan()));
                }
            }
            System.out.println("-".repeat(39));

            System.out.println("TOTAL:" + "\t\t" + formatRupiah.format(totalPendapatanTanaman));
            System.out.println();

            System.out.println("=".repeat(39));
            System.out.println(" ".repeat(12) + "Biaya Perawatan");
            System.out.println("=".repeat(39));
            for (int i = 0; i < arrTanaman.length; i++) {
                totalPerawatanTanaman += arrTanaman[i].perawatan();
                if (arrTanaman[i].getJenis() == "Kelapa Sawit") {
                    System.out.println(arrTanaman[i].getJenis() + ":" + "\t"
                            + formatRupiah.format(arrTanaman[i].perawatan()));
                } else {
                    System.out.println(arrTanaman[i].getJenis() + ":" + " ".repeat(13)
                            + formatRupiah.format(arrTanaman[i].perawatan()));
                }
            }
            System.out.println("-".repeat(39));
            System.out.printf("TOTAL:" + "\t\t" + formatRupiah.format(totalPerawatanTanaman));
            System.out.println();

        } else if (menu == 3) {

            double totalPendapatanHewan = 0;
            double totalPerawatanHewan = 0;
            double totalPendapatanTanaman = 0;
            double totalPerawatanTanaman = 0;
            double totalPendapatan = 0;
            double totalPerawatan = 0;

            for (int i = 0; i < arrHewan.length; i++) {
                totalPendapatanHewan += arrHewan[i].pendapatan();
                totalPerawatanHewan += arrHewan[i].perawatan();

            }
            for (int i = 0; i < arrTanaman.length; i++) {
                totalPendapatanTanaman += arrTanaman[i].pendapatan();
                totalPerawatanTanaman += arrTanaman[i].perawatan();

            }

            System.out.println("=".repeat(39));
            System.out.println(" ".repeat(10) + "Pendapatan Per Bulan");
            System.out.println("=".repeat(39));
            System.out.println("Ternak:" + " ".repeat(12) + formatRupiah.format(totalPendapatanHewan));
            System.out.println("Kebun:\t\t" + formatRupiah.format(totalPendapatanTanaman));
            System.out.println("-".repeat(39));
            totalPendapatan = totalPendapatanHewan + totalPendapatanTanaman;
            System.out.println("Total:\t\t" + formatRupiah.format(totalPendapatan));
            System.out.println();

            System.out.println("=".repeat(39));
            System.out.println(" ".repeat(10) + "Perawatan Per Bulan");
            System.out.println("=".repeat(39));
            System.out.println("Ternak:" + " ".repeat(12) + formatRupiah.format(totalPerawatanHewan));
            System.out.println("Kebun:\t\t" + formatRupiah.format(totalPerawatanTanaman));
            System.out.println("-".repeat(39));
            totalPerawatan = totalPerawatanHewan + totalPerawatanTanaman;
            System.out.println("Total:\t\t" + formatRupiah.format(totalPerawatan));
            System.out.println();

            System.out.println("=".repeat(39));
            System.out.println(" ".repeat(11) + "Biaya sehari-hari");
            System.out.println("=".repeat(39));
            System.out.println("Pendapatan:\t" + formatRupiah.format(totalPendapatan));
            System.out.println("Perawatan:\t" + formatRupiah.format(totalPerawatan));
            System.out.println("-".repeat(39));
            System.out.println("Total:" + " ".repeat(12) + formatRupiah.format(totalPendapatan - totalPerawatan));
            System.out.println();

        }

        // } while (true);
    }

}
