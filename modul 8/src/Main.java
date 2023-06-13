import java.util.Scanner;

public class Main {
    static int jumlahBebek = 15;
    static int jumlahDomba = 4;
    static int jumlahUnta = 3;
    static int luasApel = 5;
    static int luasKelapaSawit = 6;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("=".repeat(5) + "Menu" + "=".repeat(5));
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    tampilkanInformasi();
                    break;
                case 2:
                    pembelianHewan(scanner);
                    break;
                case 3:
                    pembelianKebun(scanner);
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }

            System.out.println();
        } while (menu != 0);

        scanner.close();
    }

    static void tampilkanInformasi() {
        Bebek bebek = new Bebek(15);
        Unta unta = new Unta(3);
        Domba domba = new Domba(4);
        Apel apel = new Apel(5);
        KelapaSawit kelapaSawit = new KelapaSawit(6);
        System.out.println();
        System.out.println("=".repeat(50) + "\n\tInformasi Peternakan dan Perkebunan\n" + "=".repeat(50));
        System.out.println("Bebek       : " + bebek.getJumlah() + " ekor");
        System.out.println("Domba       : " + domba.getJumlah() + " ekor");
        System.out.println("Unta        : " + unta.getJumlah() + " ekor");
        System.out.println("Apel        : " + apel.getLuas() + " hektar");
        System.out.println("Kelapa Sawit: " + kelapaSawit.getLuas() + " hektar");
    }

    static void pembelianHewan(Scanner scanner) {
        System.out.println("=".repeat(50) + "\n\t  Pembelian Hewan Ternak\n" + "=".repeat(50));
        System.out.println("1. Bebek");
        System.out.println("2. Domba");
        System.out.println("3. Unta");
        System.out.print("Pilih jenis hewan ternak (1-3): ");
        int hewanMenu = scanner.nextInt();

        System.out.print("Jumlah hewan yang akan dibeli: ");
        int jumlahHewan = scanner.nextInt();

        int biayaHewan = 0;
        String jenisHewan = "";

        if (hewanMenu == 1) {
            Bebek bebek = new Bebek(jumlahHewan);
            biayaHewan = bebek.getHargaEkor() * jumlahHewan;
            jenisHewan = "Bebek";
            jumlahBebek += jumlahHewan;
        } else if (hewanMenu == 2) {
            Domba domba = new Domba(jumlahHewan);
            biayaHewan = domba.getHargaEkor() * jumlahHewan;
            jenisHewan = "Domba";
            jumlahDomba += jumlahHewan;
        } else if (hewanMenu == 3) {
            Unta unta = new Unta(jumlahHewan);
            biayaHewan = unta.getHargaEkor() * jumlahHewan;
            jenisHewan = "Unta";
            jumlahUnta += jumlahHewan;
        }

        System.out.println();
        System.out.println("=".repeat(50) + "\n\tNota Pembelian Hewan Ternak\n" + "=".repeat(50));
        System.out.println(jenisHewan + "           x(" + jumlahHewan + ")  : Rp. " + biayaHewan);
        System.out.println();
        System.out.println("=".repeat(50) + "\n\tInformasi Peternakan Sekarang\n" + "=".repeat(50));
        System.out.println("Bebek       : " + jumlahBebek + " ekor");
        System.out.println("Domba       : " + jumlahDomba + " ekor");
        System.out.println("Unta        : " + jumlahUnta + " ekor");
    }

    static void pembelianKebun(Scanner scanner) {
        System.out.println("=".repeat(50) + "\n\tPembelian Tanah Perkebunan\n" + "=".repeat(50));
        System.out.println("1. Apel");
        System.out.println("2. Kelapa Sawit");
        System.out.print("Pilih jenis tanaman (1-2): ");
        int tanamanMenu = scanner.nextInt();

        System.out.print("Luas tanah yang akan dibeli (dalam hektar): ");
        int luasTanah = scanner.nextInt();

        int biayaTanah = 0;
        String jenisTanaman = "";

        if (tanamanMenu == 1) {
            Apel apel = new Apel(luasTanah);
            biayaTanah = apel.getHargaHektar() * luasTanah;
            jenisTanaman = "Apel";
            luasApel += luasTanah;
        } else if (tanamanMenu == 2) {
            KelapaSawit kelapaSawit = new KelapaSawit(luasTanah);
            biayaTanah = kelapaSawit.getHargaHektar() * luasTanah;
            jenisTanaman = "Kelapa Sawit";
            luasKelapaSawit += luasTanah;
        }

        System.out.println();
        System.out.println("=".repeat(50) + "\n\tNota Pembelian Tanah Perkebunan\n" + "=".repeat(50));
        System.out.println(jenisTanaman + "           x(" + luasTanah + ")  : Rp. " + biayaTanah);
        System.out.println();
        System.out.println("=".repeat(50) + "\n\tInformasi Peternakan Sekarang\n" + "=".repeat(50));
        System.out.println("Apel               : " + luasApel + " hektar");
        System.out.println("Kelapa Sawit       : " + luasKelapaSawit + " hektar");
    }
}