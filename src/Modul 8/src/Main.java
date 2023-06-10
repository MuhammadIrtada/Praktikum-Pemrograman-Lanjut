import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PeternakanPerkebunan peternakanPerkebunan = new PeternakanPerkebunan(15, 4, 3, 5, 6);
        Scanner scanner = new Scanner(System.in);
        
        int menu = 0;
        while (true) {
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.print("Masukkan pilihan menu: ");
            menu = scanner.nextInt();
           
            switch (menu) {
                case 1:
                    peternakanPerkebunan.informasiPeternakanPerkebunan();
                    break;
                case 2:
                    beliHewanTernak(peternakanPerkebunan, scanner);
                    break;
                case 3:
                    beliTanahPerkebunan(peternakanPerkebunan, scanner);
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }
        }
    }

    public static void beliHewanTernak(PeternakanPerkebunan peternakanPerkebunan, Scanner scanner) {
        System.out.println("\n"+ "=".repeat(50));
        System.out.println("               Pembelian Hewan Ternak");
        System.out.println("=".repeat(50));
        System.out.println("1. Bebek");
        System.out.println("2. Domba");
        System.out.println("3. Unta");
        System.out.print("Masukkan pilihan hewan (nomor): ");
        int pilihanHewan = scanner.nextInt();
        System.out.print("Masukkan banyak hewan: ");
        int jumlahHewan = scanner.nextInt();

        switch (pilihanHewan) {
            case 1:
                peternakanPerkebunan.beliHewanTernak(new Bebek(), jumlahHewan);
                break;
            case 2:
                peternakanPerkebunan.beliHewanTernak(new Domba(), jumlahHewan);
                break;
            case 3:
                peternakanPerkebunan.beliHewanTernak(new Unta(), jumlahHewan);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    public static void beliTanahPerkebunan(PeternakanPerkebunan peternakanPerkebunan, Scanner scanner) {
        System.out.println("\n"+ "=".repeat(50));
        System.out.println("            Pembelian Tanah Perkebunan");
        System.out.println("=".repeat(50));
        System.out.println("1. Apel");
        System.out.println("2. Kelapa Sawit");
        System.out.print("Masukkan pilihan kebun (nomor): ");
        int pilihanKebun = scanner.nextInt();
        System.out.print("Masukkan luas tanah: ");
        int luasTanah = scanner.nextInt();

        switch (pilihanKebun) {
            case 1:
                peternakanPerkebunan.beliTanahPerkebunan(new Apel(), luasTanah);
                break;
            case 2:
                peternakanPerkebunan.beliTanahPerkebunan(new KelapaSawit(), luasTanah);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
