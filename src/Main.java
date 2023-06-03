import java.util.*;

public class Main {
    public static void showRawProfit(Farm farm) {
        System.out.println("=".repeat(50));
        if (farm instanceof Animals) {
            System.out.printf("%40s \n", "Pendapatan Penjualan Hasil Ternak");
        } else if (farm instanceof Plants) {
            System.out.printf("%40s \n", "Pendapatan Penjualan Hasil Kebun");
        }
        System.out.println("=".repeat(50));
        for (int i = 0; i < farm.name.length; i++) {
            farm.rawProfitLine(i);
        }
        System.out.println("-".repeat(50));
        System.out.printf("%-20s Rp %,d,00\n\n", "TOTAL:", farm.totalRaw());
    }

    public static void showMaintenance(Farm farm) {
        System.out.println("=".repeat(50));
        System.out.printf("%30s \n", "Biaya Perawatan");
        System.out.println("=".repeat(50));
        for (int i = 0; i < farm.name.length; i++) {
            farm.maintenanceLine(i);
        }
        System.out.println("-".repeat(50));
        System.out.printf("%-20s Rp %,d,00\n\n", "TOTAL:", farm.totalMaint());
    }

    public static void totalProfit(Farm farm1, Farm farm2) {
        System.out.println("=".repeat(50));
        System.out.printf("%32s \n", "Pendapatan per Bulan");
        System.out.println("=".repeat(50));
        System.out.printf("%-20s Rp %,d,00\n", "Ternak:", farm1.totalRaw());
        System.out.printf("%-20s Rp %,d,00\n", "Kebun:", farm2.totalRaw());
        System.out.println("-".repeat(50));
        System.out.printf("%-20s Rp %,d,00\n\n", "TOTAL:", farm1.totalRaw() + farm2.totalRaw());
    }

    public static void totalMaint(Farm farm1, Farm farm2) {
        System.out.println("=".repeat(50));
        System.out.printf("%32s \n", "Perawatan per Bulan");
        System.out.println("=".repeat(50));
        System.out.printf("%-20s Rp %,d,00\n", "Ternak:", farm1.totalMaint());
        System.out.printf("%-20s Rp %,d,00\n", "Kebun:", farm2.totalMaint());
        System.out.println("-".repeat(50));
        System.out.printf("%-20s Rp %,d,00\n\n", "TOTAL:", farm1.totalMaint() + farm2.totalMaint());
    }

    public static void sunkCost(Farm farm1, Farm farm2) {
        System.out.println("=".repeat(50));
        System.out.printf("%32s \n", "Biaya sehari-hari");
        System.out.println("=".repeat(50));
        System.out.printf("%-20s Rp %,d,00\n", "Ternak:", farm1.totalRaw() + farm2.totalRaw());
        System.out.printf("%-20s Rp %,d,00\n", "Kebun:", farm1.totalMaint() + farm2.totalMaint());
        System.out.println("-".repeat(50));
        System.out.printf("%-20s Rp %,d,00\n\n", "TOTAL:",
                (farm1.totalRaw() + farm2.totalRaw()) - (farm1.totalMaint() + farm2.totalMaint()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Farm farms[] = new Farm[2];
        farms[0] = new Animals();
        farms[1] = new Plants();

        boolean loop = true;
        do {
            try {
                System.out.print("1. Peternakan\n2. Perkebunan\n3. Budgeting\nMasukkan pilihan menu: ");
                switch (scan.nextInt()) {
                    case 1:
                        showRawProfit(farms[0]);
                        showMaintenance(farms[0]);
                        break;
                    case 2:
                        showRawProfit(farms[1]);
                        showMaintenance(farms[1]);
                        break;
                    case 3:
                        totalProfit(farms[0], farms[1]);
                        totalMaint(farms[0], farms[1]);
                        sunkCost(farms[0], farms[1]);
                        break;
                }
            } catch (Exception e) {
                loop = false;
            }
        } while (loop);
        scan.close();
    }
}
