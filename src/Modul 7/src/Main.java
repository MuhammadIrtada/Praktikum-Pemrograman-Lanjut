import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        Hewan[] ternak = { new Bebek(15), new Unta(3), new Domba(4) };
        Tanaman[] kebun = { new Apel(5), new KelapaSawit(6) };
        double totalPendapatanKebun = 0;
        double totalBiayaPerawatanKebun = 0;
        double totalPendapatanTernak = 0;
        double totalBiayaPerawatanTernak = 0;
        int menu;
        
        while (true) {
            System.out.println("1. Peternakan");
            System.out.println("2. Perkebunan");
            System.out.println("3. Budgeting");
            System.out.print("Masukkan pilihan menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n"+"=".repeat(50));
                    System.out.println("        Pendapatan Penjualan Hasil Ternak");
                    System.out.println("=".repeat(50));

                    for (Hewan hewan : ternak) {
                        double pendapatan = hewan.getPendapatan();
                        double biayaPerawatan = hewan.getBiayaPerawatan();
                        totalPendapatanTernak += pendapatan;
                        totalBiayaPerawatanTernak += biayaPerawatan;

                        System.out.println(hewan.getJenisHewan() + ": Rp " + decimalFormat.format(pendapatan));
                    }
                    System.out.println("-".repeat(50));
                    System.out.println("TOTAL: Rp " + decimalFormat.format(totalPendapatanTernak) + "\n");
                    System.out.println("=".repeat(50));
                    System.out.println("                Biaya Perawatan");
                    System.out.println("=".repeat(50));
                    for (Hewan hewan : ternak) {
                        System.out.println(hewan.getJenisHewan() + ": Rp " + decimalFormat.format(hewan.getBiayaPerawatan()));
                    }
                    System.out.println("-".repeat(50));
                    System.out.println("TOTAL: Rp " + decimalFormat.format(totalBiayaPerawatanTernak) + "\n");
                    break;

                case 2:
                System.out.println("\n"+"=".repeat(50));
                System.out.println("        Pendapatan Penjualan Hasil Kebun");
                System.out.println("=".repeat(50));

                    for (Tanaman tanaman : kebun) {
                        double pendapatan = tanaman.getPendapatan();
                        double biayaPerawatan = tanaman.getBiayaPerawatan();
                        totalPendapatanKebun += pendapatan;
                        totalBiayaPerawatanKebun += biayaPerawatan;

                        System.out.println(tanaman.getJenisTanaman() + ": Rp " + decimalFormat.format(pendapatan));
                    }
                    System.out.println("-".repeat(50));
                    System.out.println("TOTAL: Rp " + decimalFormat.format(totalPendapatanKebun) + "\n");
                    System.out.println("=".repeat(50));
                    System.out.println("                Biaya Perawatan");
                    System.out.println("=".repeat(50));
                    for (Tanaman tanaman : kebun) {
                        System.out.println(tanaman.getJenisTanaman() + ": Rp " + decimalFormat.format(tanaman.getBiayaPerawatan()));
                    }
                    System.out.println("-".repeat(50));
                    System.out.println("TOTAL: Rp " + decimalFormat.format(totalBiayaPerawatanKebun) + "\n");
                    break;

                case 3:
                    for (Hewan hewan : ternak) {
                        double pendapatan = hewan.getPendapatan();
                        double biayaPerawatan = hewan.getBiayaPerawatan();
                        totalPendapatanTernak += pendapatan;
                        totalBiayaPerawatanTernak += biayaPerawatan;
                    }
                    for (Tanaman tanaman : kebun) {
                        double pendapatan = tanaman.getPendapatan();
                        double biayaPerawatan = tanaman.getBiayaPerawatan();
                        totalPendapatanKebun += pendapatan;
                        totalBiayaPerawatanKebun += biayaPerawatan;
                    }
                    System.out.println("\n"+"=".repeat(50));
                    System.out.println("             Pendapatan per Bulan");
                    System.out.println("=".repeat(50));
                    double totalPendapatan = totalPendapatanTernak + totalPendapatanKebun;
                    double totalBiayaPerawatan = totalBiayaPerawatanTernak + totalBiayaPerawatanKebun;
                    System.out.println("Ternak: Rp " + decimalFormat.format(totalPendapatanTernak));
                    System.out.println("Kebun: Rp " + decimalFormat.format(totalPendapatanKebun));
                    System.out.println("-".repeat(50));
                    System.out.println("TOTAL: Rp " + decimalFormat.format(totalPendapatan) + "\n");
                    System.out.println("=".repeat(50));

                    System.out.println("=".repeat(50));
                    System.out.println("              Perawatan per Bulan");
                    System.out.println("=".repeat(50));
                    System.out.println("Ternak: Rp " + decimalFormat.format(totalBiayaPerawatanTernak));
                    System.out.println("Kebun: Rp " + decimalFormat.format(totalBiayaPerawatanKebun));
                    System.out.println("-".repeat(50));
                    System.out.println("TOTAL: Rp " + decimalFormat.format(totalBiayaPerawatan) + "\n");

                    double biayaHarian = totalPendapatan - totalBiayaPerawatan;
                    System.out.println("=".repeat(50));
                    System.out.println("                Biaya sehari-hari");
                    System.out.println("=".repeat(50));
                    System.out.println("Pendapatan: Rp " + decimalFormat.format(totalPendapatan));
                    System.out.println("Perawatan: Rp " + decimalFormat.format(totalBiayaPerawatan));
                    System.out.println("-".repeat(50));
                    System.out.println("TOTAL: Rp " + decimalFormat.format(biayaHarian) + "\n");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}
