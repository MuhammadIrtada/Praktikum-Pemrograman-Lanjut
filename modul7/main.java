// import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class main {
    private static peternakan[] farmEntities = {
        new bebek(15, 2000, 3000, 2),
        new unta(3, 60000, 200000, 5),
        new domba(4, 15000, 45000, 4)
    };

    private static pertanian[] plantationEntities = {
        new apel(5, 25000, 900000, 40),
        new KelapaSawit(6, 18000, 8500000, 500)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih;
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Budgeting Program ===");
            System.out.println("1. Peternakan");
            System.out.println("2. Perkebunan");
            System.out.println("3. Budgeting");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan menu: ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    hitungPendapatanTernak();
                    break;
                case 2:
                    hitungPendapatanKebun();
                    break;
                case 3:
                    keseluruhan();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang valid.");
                    break;
            }

            System.out.println();
        }
    }

    private static void hitungPendapatanTernak() {
        double totalPendapatanTernak = 0;
        double totalPerawatanTernak = 0;

        
        
        System.out.println("=".repeat(40));
        System.out.println("Pendapatan Penjualan Hasil Ternak");
        System.out.println("=".repeat(40));
        for (peternakan entity : farmEntities) {
            totalPendapatanTernak += entity.pendapatan1();
            System.out.println(entity.getClass().getSimpleName()+":\t\t"+(entity.pendapatan1()*30));
        }
        System.out.println("-".repeat(40));
        System.out.println("TOTAL:\t\t"+(totalPendapatanTernak*30));

        System.out.println("=".repeat(40));
        System.out.println("Biaya Perawatan");
        System.out.println("=".repeat(40));
        for (peternakan entity : farmEntities){
            totalPerawatanTernak += entity.perawatan1();
            System.out.println(entity.getClass().getSimpleName()+":\t\t"+(entity.perawatan1()*30)); 
        }
        System.out.println("-".repeat(40));
        System.out.println("TOTAL:\t\t"+(totalPerawatanTernak*30));
    }

    private static void hitungPendapatanKebun() {
        double totalPendapatanKebun = 0;
        double totalPerawatanKebun = 0;

        System.out.println("=".repeat(40));
        System.out.println("\tPendapatan Penjualan Hasil Kebun");
        System.out.println("=".repeat(40));
        for (pertanian entity : plantationEntities) {
            totalPendapatanKebun+= entity.pendapatan1();
            System.out.println(entity.getClass().getSimpleName()+":\t\t"+(entity.pendapatan1()*30));
        }
        System.out.println("-".repeat(40));
        System.out.println("TOTAL:\t\t"+(totalPendapatanKebun*30));

        System.out.println("=".repeat(40));
        System.out.println("\tBiaya Perawatan");
        System.out.println("=".repeat(40));
        for(pertanian entity : plantationEntities){
            totalPerawatanKebun += entity.perawatan1();
            System.out.println(entity.getClass().getSimpleName()+":\t\t"+(entity.perawatan1()*30));
        }
        System.out.println("-".repeat(40));
        System.out.println("TOTAL:\t\t"+(totalPerawatanKebun*30));
    }

    private static void keseluruhan() {
        double totalPendapatanTernak = 0;
        double totalPerawatanTernak = 0;
        double totalPendapatanKebun = 0;
        double totalPerawatanKebun = 0;

        for (peternakan entity : farmEntities) {
            totalPendapatanTernak += entity.pendapatan1();
            totalPerawatanTernak += entity.perawatan1();
        }

        for (pertanian entity : plantationEntities) {
            totalPendapatanKebun += entity.pendapatan1();
            totalPerawatanKebun += entity.perawatan1();
        }

        // double dailyLivingExpenses = 2000000; // Example daily living expenses for Pak Kiw

        double totalPendapatan = totalPendapatanTernak + totalPendapatanKebun;
        double totalPerawatan = totalPerawatanKebun + totalPerawatanTernak;

        System.out.println("=".repeat(40));
        System.out.println("\tPendapatan Per Bulan");
        System.out.println("=".repeat(40));
        System.out.println("Ternak:\t\t"+(totalPendapatanTernak*30));
        System.out.println("Kebun:\t\t"+(totalPendapatanKebun*30));
        System.out.println("-".repeat(40));
        System.out.println("TOTAL:\t\t"+(totalPendapatan*30));
        System.out.println();

        System.out.println("=".repeat(40));
        System.out.println("\tPerawatan Per Bulan");
        System.out.println("=".repeat(40));
        System.out.println("Ternak:\t\t"+(totalPerawatanTernak*30));
        System.out.println("Kebun:\t\t"+(totalPerawatanKebun*30));
        System.out.println("-".repeat(40));
        System.out.println("TOTAL:\t\t"+(totalPerawatan*30));
        System.out.println();

        System.out.println("=".repeat(40));
        System.out.println("\tBiaya Sehari-hari");
        System.out.println("=".repeat(40));
        System.out.println("Pendapatan:\t\t"+(totalPendapatan*30));
        System.out.println("Perawatan:\t\t"+(totalPerawatan*30));
        System.out.println("-".repeat(40));
        System.out.println("TOTAL:\t\t"+((totalPendapatan*30)+(totalPerawatan*30)+((totalPendapatan*30)-(totalPerawatan*30))));
    }
}
