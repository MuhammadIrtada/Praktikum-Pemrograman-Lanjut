import java.util.Scanner;

public class MainPakKiw {
    static Scanner sc = new Scanner(System.in);
    static Bebek bebek = new Bebek("Bebek", 110000, 15);
    static Domba domba = new Domba("Domba", 2450000, 4);
    static Unta unta = new Unta("Unta", 12000000, 3);
    static Apel apel = new Apel("Apel", 7500000, 5);
    static KelapaSawit kelapasawit = new KelapaSawit("Kelapa Sawit", 18000000, 6);

    public static void main(String[] args) {
        PembelianInterface[] pembelianTernak = { bebek, domba, unta };
        PembelianInterface[] pembelianKebun = { apel, kelapasawit };

        while (true) {
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian Hewan Ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.print("Masukkan pilihan menu: ");
            int pilih = sc.nextInt();

            if (pilih == 1) {
                menu1();
                System.out.println();
            } else if (pilih == 2) {
                menu2(pembelianTernak);
                System.out.println();
            } else if (pilih == 3) {
                menu3(pembelianKebun);
                System.out.println();
            } else if (pilih == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void menu1() {
        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("\tInformasi Peternakan dan Perkebunan");
        System.out.println("=".repeat(50));
        System.out.println("Bebek\t\t: " + bebek.getKuantitas() + " ekor");
        System.out.println("Domba\t\t: " + domba.getKuantitas() + " ekor");
        System.out.println("Unta\t\t: " + unta.getKuantitas() + " ekor");
        System.out.println("Apel\t\t: " + apel.getKuantitas() + " pohon");
        System.out.println("Kelapa Sawit\t: " + kelapasawit.getKuantitas() + " pohon");
    }

    public static void menu2(PembelianInterface[] pembelian) {
        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println("\tPembelian Hewan Ternak");
        System.out.println("=".repeat(50));

        for (int i = 0; i < pembelian.length; i++) {
            System.out.println((i + 1) + ". " + pembelian[i].getJenis());
        }

        System.out.print("Masukkan pilihan hewan (nomor): ");
        int pilihan = sc.nextInt();

        if (pilihan >= 1 && pilihan <= pembelian.length) {
            System.out.print("Masukkan banyak hewan: ");
            int jumlah = sc.nextInt();
            System.out.println();
            System.out.println("=".repeat(50));
            System.out.println("\tNota Pembelian Hewan Ternak");
            System.out.println("=".repeat(50));
            pembelian[pilihan - 1].beliHewan(jumlah);
            pembelian[pilihan - 1].hitungBiaya(jumlah);
            System.out.println(pembelian[pilihan - 1] + "x(" + jumlah + ")\t: Rp " + pembelian[pilihan - 1].getBiaya());
            System.out.println();
            System.out.println("=".repeat(50));
            System.out.println("\tInformasi Peternakan Sekarang");
            System.out.println("=".repeat(50));
            System.out.println("Bebek\t\t: " + bebek.getKuantitas() + " ekor");
            System.out.println("Domba\t\t: " + domba.getKuantitas() + " ekor");
            System.out.println("Unta\t\t: " + unta.getKuantitas() + " ekor");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    public static void menu3(PembelianInterface[] pembelian) {
        System.out.println("=".repeat(50));
        System.out.println("\tPembelian Tanah Perkebunan");
        System.out.println("=".repeat(50));

        for (int i = 0; i < pembelian.length; i++) {
            System.out.println((i + 1) + ". " + pembelian[i].getJenis());
        }

        System.out.print("Masukkan pilihan kebun (nomor): ");
        int pilihan = sc.nextInt();

        if (pilihan >= 1 && pilihan <= pembelian.length) {
            System.out.print("Masukkan luas tanah : ");
            int luas = sc.nextInt();
            System.out.println();
            System.out.println("=".repeat(50));
            System.out.println("\tNota Pembelian Tanah Perkebunan");
            System.out.println("=".repeat(50));
            pembelian[pilihan - 1].beliTanaman(luas);
            pembelian[pilihan - 1].hitungBiaya(luas);
            System.out.println(pembelian[pilihan - 1] + "x(" + luas + ")\t: Rp " + pembelian[pilihan - 1].getBiaya());
            System.out.println();
            System.out.println("=".repeat(50));
            System.out.println("\tInformasi Perkebunan Sekarang");
            System.out.println("=".repeat(50));
            System.out.println("Apel\t: " + apel.getKuantitas() + " hektar");
            System.out.println("Kelapa sawit: " + kelapasawit.getKuantitas() + " hektar");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}