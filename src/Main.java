import java.util.Scanner;

class Main {
    static Hewan[] hewan = new Hewan[3];
    static Tanaman[] tanaman = new Tanaman[2];
    static Scanner sc = new Scanner(System.in);
    static double pendapatanTernak;
    static double pendapatanKebun;
    static double perawatanTernak;
    static double perawatanKebun;

    public static void main(String[] args) {
        
        hewan[2] = new Domba(4, 4, 15000, 45000);
        hewan[0] = new Bebek(15, 2, 2000, 3000);
        hewan[1] = new Unta(3, 5, 60000, 200000);

        tanaman[0] = new Apel(5, 40, 25000, 900000);
        tanaman[1] = new Sawit(6, 500, 18000, 8500000);
        boolean loop = true;

        while (loop) {
            mainMenu();
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    menuPeternakan();
                    break;
                case 2:
                    menuPerkebunan();
                    break;
                case 3:
                    menuBudgeting();
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

    public static void mainMenu() {
        System.out.print("1. Peternakan\n2. Perkebunan\n3. Budgeting\nMasukkan pilihan menu: ");

    }

    public static void menuPeternakan() {
        System.out.println("=".repeat(40) + "\n\tPendapatan Penjualan Hasil Ternak\n" + "=".repeat(40));
        pendapatanTernak = 0;
        for(Hewan balls : hewan){
            balls.cetakPendapatan();
            pendapatanTernak += balls.getPendapatan();
        }
        System.out.printf("-".repeat(40) + "\n\t\tTOTAL: %,.0f\n", pendapatanTernak);
        System.out.println("=".repeat(40) + "\n\tBiaya Perawatan\n" + "=".repeat(40));
        perawatanTernak = 0;
        for(Hewan balls : hewan){
            balls.cetakPerawatan();
            perawatanTernak += balls.getPerawatan();
        }
        System.out.printf("-".repeat(40) + "\n\t\tTOTAL: %,.0f\n", perawatanTernak);

    }

    public static void menuPerkebunan() {
        System.out.println("=".repeat(40) + "\n\tPendapatan Penjualan Hasil Kebun\n" + "=".repeat(40));
        pendapatanKebun = 0;
        for(Tanaman balls : tanaman){
            pendapatanKebun += balls.getPendapatan();
        }
        System.out.printf("-".repeat(40) + "\n\t\tTOTAL: %,.0f\n", pendapatanKebun);
        System.out.println("=".repeat(40) + "\n\tBiaya Perawatan\n" + "=".repeat(40));
        perawatanKebun = 0;
        for(Tanaman balls : tanaman){
            perawatanKebun += balls.getPerawatan();
        }
        System.out.printf("-".repeat(40) + "\n\t\tTOTAL: %,.0f\n", perawatanKebun);

    }

    public static void menuBudgeting() {
        pendapatanKebun = 0;
        pendapatanTernak = 0;
        perawatanKebun = 0;
        perawatanTernak = 0;
        for(Hewan balls : hewan){
            pendapatanTernak += balls.getPendapatan();
            perawatanTernak += balls.getPerawatan();
        }
        for(Tanaman balls : tanaman){
            pendapatanKebun += balls.getPendapatan();
            perawatanKebun += balls.getPerawatan();
        }
        System.out.println("=".repeat(40) + "\n\tPendapatan per Bulan\n" + "=".repeat(40));
        System.out.printf("Ternak:\t\t %,.0f\nKebun:\t\t %,.0f\n", pendapatanTernak, pendapatanKebun);
        System.out.printf("-".repeat(40) + "\nTOTAL: \t%,.0f\n",  pendapatanKebun + pendapatanTernak);
        System.out.println("=".repeat(40) + "\n\tPerawatan per Bulan\n" + "=".repeat(40));
        System.out.printf("Ternak:\t\t %,.0f\nKebun:\t\t %,.0f\n", perawatanTernak, perawatanKebun);
        System.out.printf("-".repeat(40) + "\nTOTAL: \t%,.0f\n", perawatanKebun + perawatanTernak);
        System.out.println("=".repeat(40) + "\n\tBiaya sehari-hari\n" + "=".repeat(40));
        System.out.printf("Pendapatan:\t\t %,.0f\nPerawatan:\t\t %,.0f\n", pendapatanKebun + pendapatanTernak, perawatanKebun + perawatanTernak);
        System.out.printf("-".repeat(40) + "\nTOTAL: \t%,.0f\n", pendapatanKebun + pendapatanTernak - perawatanKebun - perawatanTernak);

    }
}
