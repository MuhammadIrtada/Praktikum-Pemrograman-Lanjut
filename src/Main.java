
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bebek bebek = new Bebek(15,  2, 2000, 3000);
        Unta unta = new Unta(3,  5, 60000, 200000);
        Domba domba = new Domba(4,  4, 15000, 45000);
        Apel apel = new Apel(5,  40, 25000, 900000);
        KelapaSawit kelapa = new KelapaSawit(6,  500, 18000, 8500000);
        Hewan[] animal = new Hewan[3];
        animal[0] = bebek;
        animal[1] = unta;
        animal[2] = domba;
        Tanaman[] plant = new Tanaman[2];
        plant[0] = apel;
        plant[1] = kelapa;

        while(true){
            System.out.println("1. Peternakan");
            System.out.println("2. Perkebunan");
            System.out.println("3. Budgeting");
            System.out.print("Masukkan pilihan menu: ");
            int pilihan = input.nextInt();
            System.out.println();

            switch (pilihan){
                case 1:
                    batas();
                    System.out.println("   Pendapatan Penjualan Hasil Ternak");
                    batas();
                    for (Hewan kewan : animal){
                        System.out.println(kewan.showPendapatan());
                    }
                    System.out.println("-".repeat(39));
                    System.out.printf("TOTAL:\t\t\t%21s", String.format(Locale.ITALY,"Rp %,.2f\n\n", pendapatanHewan(animal)));

                    batas();
                    System.out.println("            Biaya Perawatan");
                    batas();
                    for (Hewan kewan : animal){
                        System.out.println(kewan.showPerawatan());
                    }
                    System.out.println("-".repeat(39));
                    System.out.printf("TOTAL:\t\t\t%21s", String.format(Locale.ITALY,"Rp %,.2f\n\n", perawatanHewan(animal)));
                    break;

                case 2:
                    batas();
                    System.out.println("   Pendapatan Penjualan Hasil Kebun");
                    batas();
                    for (Tanaman wit : plant){
                        System.out.println(wit.showPendapatan());
                    }
                    System.out.println("-".repeat(39));
                    System.out.printf("TOTAL:\t\t\t%21s", String.format(Locale.ITALY,"Rp %,.2f\n\n", pendapatanTanaman(plant)));

                    batas();
                    System.out.println("            Biaya Perawatan");
                    batas();
                    for (Tanaman wit : plant){
                        System.out.println(wit.showPerawatan());
                    }
                    System.out.println("-".repeat(39));
                    System.out.printf("TOTAL:\t\t\t%21s", String.format(Locale.ITALY,"Rp %,.2f\n\n", perawatanTanaman(plant)));
                    break;

                case 3:
                    batas();
                    System.out.println("          Pendapatan per Bulan");
                    batas();
                    System.out.printf("Ternak:\t\t\t%21s", String.format(Locale.ITALY, "Rp %,.2f\n", pendapatanHewan(animal)));
                    System.out.printf("Kebun:\t\t\t%21s", String.format(Locale.ITALY, "Rp %,.2f\n", pendapatanTanaman(plant)));
                    System.out.println("-".repeat(39));
                    double pendapatan = pendapatanTanaman(plant) + pendapatanHewan(animal);
                    System.out.printf("TOTAL:\t\t\t%22s", String.format(Locale.ITALY, "Rp %,.2f\n\n", pendapatan ));

                    batas();
                    System.out.println("          Perawatan per Bulan");
                    batas();
                    System.out.printf("Ternak:\t\t\t%21s", String.format(Locale.ITALY, "Rp %,.2f\n", perawatanHewan(animal)));
                    System.out.printf("Kebun:\t\t\t%21s", String.format(Locale.ITALY, "Rp %,.2f\n", perawatanTanaman(plant)));
                    System.out.println("-".repeat(39));
                    double perawatan = perawatanTanaman(plant) + perawatanHewan(animal);
                    System.out.printf("TOTAL:\t\t\t%22s", String.format(Locale.ITALY, "Rp %,.2f\n\n", perawatan));

                    batas();
                    System.out.println("           Biaya sehari-hari");
                    batas();
                    System.out.printf("Pendapatan:\t\t%21s", String.format(Locale.ITALY, "Rp %,.2f\n", pendapatan));
                    System.out.printf("Perawatan:\t\t%21s", String.format(Locale.ITALY, "Rp %,.2f\n", perawatan));
                    System.out.println("-".repeat(39));
                    System.out.printf("TOTAL:\t\t\t%21s", String.format(Locale.ITALY, "Rp %,.2f\n\n", pendapatan - perawatan));
                    break;

                default:
                    System.exit(0);
            }
        }
    }

    public static void batas(){
        System.out.println("=".repeat(39));
    }
    public static double pendapatanHewan(Hewan[] inputAnimal) {
        double totalPendapatan = 0;
        for (Hewan kewan : inputAnimal){
            totalPendapatan += kewan.getPendapatan();
        }
        return totalPendapatan;
    }

    public static double perawatanHewan(Hewan[] inputAnimal) {
        double totalPerawatan = 0;
        for (Hewan kewan : inputAnimal){
            totalPerawatan += kewan.getBiayaPerawatan();
        }
        return totalPerawatan;
    }

    public static double pendapatanTanaman(Tanaman[] inputPlant) {
        double totalPendapatan = 0;
        for (Tanaman wit : inputPlant){
            totalPendapatan += wit.getPendapatan();
        }
        return totalPendapatan;
    }

    public static double perawatanTanaman(Tanaman[] inputPlant) {
        double totalPerawatan = 0;
        for (Tanaman wit : inputPlant){
            totalPerawatan += wit.getBiayaPerawatan();
        }
        return totalPerawatan;
    }

}
