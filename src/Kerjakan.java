import java.text.NumberFormat;
import java.util.*;

public class Kerjakan {
    static NumberFormat lk = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    static Peternakan bebek = new Bebek("Bebek", 15, 2000, 2, 3000);
    static Peternakan unta = new Unta("Unta", 3, 60000, 5, 200000);
    static Peternakan domba = new Domba("Domba", 4, 15000, 4, 45000);
    static Peternakan[] peternakans = { bebek, unta, domba };

    static Perkebunan apel = new Apel("Apel", 5, 25000, 40, 900000);
    static Perkebunan kelapaSawit = new KelapaSawit("Kelapa Sawit", 6, 18000, 500, 8500000);
    static Perkebunan[] perkebunans = { apel, kelapaSawit };

    static Scanner input = new Scanner(System.in);
    static double totalPenghasilanHewan, totalPengeluaranHewan, totalPendapatanHewan;
    static double totalPenghasilanTumbuhan, totalPengeluaranTumbuhan, totalPendapatanTumbuhan;
    static double abebek, bbebek, cbebek, aunta, bunta, cunta, adomba, bdomba, cdomba;
    static double aapel, bapel, akel, bkel;

    static void inisialisasi() {
        for (int i = 0; i < perkebunans.length; i++) {
            totalPenghasilanTumbuhan += perkebunans[i].penghasilan();
            totalPengeluaranTumbuhan += perkebunans[i].totalbiaya();
            totalPendapatanTumbuhan += (totalPenghasilanTumbuhan-totalPengeluaranTumbuhan);
        }

        for (int i = 0; i < peternakans.length; i++) {
            totalPenghasilanHewan += peternakans[i].penghasilan();
            totalPengeluaranHewan += peternakans[i].totalbiaya();
            totalPendapatanHewan +=(totalPenghasilanHewan-totalPengeluaranHewan);
        }
        abebek = bebek.penghasilan() / 2;
        bbebek = bebek.totalbiaya() / 2;
        aunta = unta.penghasilan() / 2;
        bunta = unta.totalbiaya() / 2;
        adomba = domba.penghasilan() / 2;
        bdomba = domba.totalbiaya() / 2;
        aapel = apel.penghasilan()/2;
        bapel = apel.totalbiaya()/2;
        akel = kelapaSawit.penghasilan()/2;
        bkel = kelapaSawit.totalbiaya()/2;   
    }

    static void displayPenghasilanHewan() {
        System.out.printf("Bebek : \t\tRp %s\n", lk.format(abebek));
        System.out.printf("Unta : \t\t\tRp %s\n", lk.format(aunta));
        System.out.printf("Domba : \t\tRp %s\n", lk.format(adomba));
    }

    static void displayPengeluaranHewan() {
        System.out.printf("Bebek : \t\tRp %s\n", lk.format(bbebek));
        System.out.printf("Unta : \t\t\tRp %s\n", lk.format(bunta));
        System.out.printf("Domba : \t\tRp %s\n", lk.format(bdomba));
    }
    
    static void displayPengeluaranTumbuhan(){
        System.out.printf("Apel : \t\t\tRp %s\n", lk.format(bapel));
        System.out.printf("Kelapa Sawit : \t\tRp %s\n", lk.format(bkel));
    }
    static void displayPenghasilanTumbuhan(){
        System.out.printf("Apel : \t\t\tRp %s\n", lk.format(aapel));
        System.out.printf("Kelapa Sawit : \t\tRp %s\n", lk.format(akel));
    }

    static void kerjakan() {
        inisialisasi();
        while (true) {
            menu();
            int pilihanMenu = input.nextInt();
            switch (pilihanMenu) {
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;
                case 3:
                    menu3();
                    break;
            }
        }
    }

    static void menu() {
        System.out.println("1. Peternakan");
        System.out.println("2. Perkebunan");
        System.out.println("3. Budgeting");
        System.out.print("Masukkan pilihan menu: ");
    }

    static void menu1() {
        String divider = "=".repeat(50);
        String dividers = "-".repeat(50);
        System.out.printf("\n%s\n\tPendapatan Penjualan Hasil Ternak\t\n%s\n", divider, divider);
        displayPenghasilanHewan();
        System.out.println(dividers);
        System.out.printf("TOTAL:\t\t\tRp.%s\n", lk.format(totalPenghasilanHewan));

        System.out.printf("\n%s\n\t\tBiaya Perawatan\t\t\n%s\n", divider, divider);
        displayPengeluaranHewan();
        System.out.println(dividers);
        System.out.printf("TOTAL:\t\t\tRp.%s\n", lk.format(totalPengeluaranHewan));
    }

    static void menu2() {
        String divider = "=".repeat(50);
        String dividers = "-".repeat(50);
        System.out.printf("\n%s\n\tPendapatan Penjualan Hasil Kebun\t\n%s\n", divider, divider);
        displayPenghasilanTumbuhan();
        System.out.println(dividers);
        System.out.printf("TOTAL:\t\t\tRp.%s\n", lk.format(totalPenghasilanTumbuhan));

        System.out.printf("\n%s\n\t\tBiaya Perawatan\t\t\n%s\n", divider, divider);
        displayPengeluaranTumbuhan();
        System.out.println(dividers);
        System.out.printf("TOTAL:\t\t\tRp.%s\n", lk.format(totalPengeluaranTumbuhan));
    }
    
    static void menu3(){
        String divider = "=".repeat(50);
        String dividers = "-".repeat(50);
        double pendapatan = totalPenghasilanHewan+totalPenghasilanTumbuhan;
        double perawatan = totalPengeluaranHewan+totalPengeluaranTumbuhan;
        System.out.printf("\n%s\n\tPendapatan Per Bulan\t\n%s\n", divider, divider);
        System.out.printf("Ternak:\t\t\tRp.%s\n", lk.format(totalPenghasilanHewan));
        System.out.printf("Kebun:\t\t\tRp.%s\n", lk.format(totalPenghasilanTumbuhan));
        System.out.println(dividers);
        System.out.printf("TOTAL:\t\t\tRp.%s\n", lk.format(pendapatan));
        System.out.printf("\n%s\n\tPerawatan Per Bulan\t\n%s\n", divider, divider);
        System.out.printf("Ternak:\t\t\tRp.%s\n", lk.format(totalPengeluaranHewan));
        System.out.printf("Kebun:\t\t\tRp.%s\n", lk.format(totalPengeluaranTumbuhan));
        System.out.println(dividers);
        System.out.printf("TOTAL:\t\t\tRp.%s\n", lk.format(perawatan));
        System.out.printf("\n%s\n\tBiaya sehari-hari\t\n", divider, divider);
        System.out.printf("Pendapatan:\tRp.%s\n", lk.format(pendapatan));
        System.out.printf("Perawatan:\tRp.%s\n", lk.format(perawatan));
        System.out.println(dividers);
        System.out.printf("Perawatan:\tRp.%s\n", lk.format(pendapatan-perawatan));

    }
}