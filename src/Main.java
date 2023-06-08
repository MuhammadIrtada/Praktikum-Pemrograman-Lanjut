import java.text.NumberFormat;
import java.util.*;

public class Main {
    static ArrayList<Transaksi> daftarPembelianHewan = new ArrayList<>();
    static ArrayList<Transaksi> daftarPembelianTumbuahn = new ArrayList<>();
    static NumberFormat lk = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    static Scanner scan = new Scanner(System.in);
    static Bebek bebek = new Bebek("Bebek", 110000, 15);
    static Domba domba = new Domba("Domba", 2450000, 4);
    static Unta unta = new Unta("Unta", 12000000, 3);
    static Apel apel = new Apel("Apel", 7500000, 5);
    static KelapaSawit kelapaSawit = new KelapaSawit("Unta", 18000000, 6);

    public static void main(String[] args) {
        String divider = "=".repeat(50);
        while (true) {
            menu();
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.printf("%s\n\tInformasi Peternakan dan Perkebunan\n%s\n", divider, divider);
                    System.out.printf("Bebek\t\t: %.0f ekor\n", bebek.getJumlah());
                    System.out.printf("Domba\t\t: %.0f ekor\n", domba.getJumlah());
                    System.out.printf("Unta\t\t: %.0f ekor\n", unta.getJumlah());
                    System.out.printf("Apel\t\t: %.0f hektar\n", apel.getJumlah());
                    System.out.printf("Kelapa Sawit\t: %.0f hektar\n\n", kelapaSawit.getJumlah());
                    break;

                case 2:
                    System.out.printf("%s\n\t\tPembelian Hewan ternak\n%s\n", divider, divider);
                    System.out.print("1. Bebek\n2. Domba\n3. Unta\nMasukkan pilihan hewan (nomor): ");
                    int pembelian = scan.nextInt();
                    System.out.printf("Masukkan banyak hewan: ");
                    int banyak = scan.nextInt();
                    System.out.println();
                    System.out.printf("%s\n\tNota Pembelian Hewan ternak\n%s\n", divider, divider);

                    switch (pembelian) {
                        case 1:
                            bebek.setJumlah(banyak);
                            Transaksi transaksibebek = new Transaksi("bebek", bebek.getHarga(),banyak);
                            daftarPembelianHewan.add(transaksibebek);
                            break;
                        case 2:
                            domba.setJumlah(banyak);
                            Transaksi transaksidomba = new Transaksi("Domba",domba.getHarga(),banyak);
                            daftarPembelianHewan.add(transaksidomba);
                            break;
                        case 3:
                            unta.setJumlah(banyak);
                            Transaksi transaksiunta = new Transaksi("Unta",unta.getHarga(),banyak);
                            daftarPembelianHewan.add(transaksiunta);
                            break;
                        default:
                            System.out.println("Pilih nomor yang tersedia");
                            break;
                    }
                    for (Transaksi transaksi : daftarPembelianHewan) {
                        System.out.printf("%s\t\tx(%.0f)\t: Rp.%s\n", transaksi.getjenis() ,transaksi.getBanyak(), lk.format(transaksi.getHarga()));
                    }
                    System.out.printf("\n%s\n\tInformasi Peternakan Sekarang\n%s\n", divider, divider);
                    System.out.printf("Bebek\t\t: %.0f ekor\n", bebek.getJumlah());
                    System.out.printf("Domba\t\t: %.0f ekor\n", domba.getJumlah());
                    System.out.printf("Unta\t\t: %.0f ekor\n\n", unta.getJumlah());
                    
                    break;

                case 3:
                    System.out.printf("%s\n\t\tPembelian Tanah Perkebuan\n%s\n", divider, divider);
                    System.out.print("1. Apel\n2. Kelapa Sawit\nMasukkan pilihan kebun (nomor): ");
                    int pembelians = scan.nextInt();
                    System.out.printf("Masukkan luas tanah: ");
                    int banyaks = scan.nextInt();
                    System.out.println();
                    System.out.printf("%s\n\tNota Pembelian Tanah Perkebunan\n%s\n", divider, divider);
                    switch (pembelians) {
                        case 1:
                            apel.setJumlah(banyaks);
                            Transaksi transaksiapel = new Transaksi("apel", apel.getHarga(),banyaks);
                            daftarPembelianTumbuahn.add(transaksiapel);
                            break;
                        case 2:
                            kelapaSawit.setJumlah(banyaks);
                            Transaksi transaksikel = new Transaksi("kelapa sawit", kelapaSawit.getHarga(),banyaks);
                            daftarPembelianTumbuahn.add(transaksikel);
                            break;
                        default:
                            System.out.println("Pilih nomor 1 atau 2");
                            break;
                    }
                    for (Transaksi transaksi : daftarPembelianTumbuahn) {
                        System.out.printf("%s\t\tx(%.0f)\t: Rp.%s\n", transaksi.getjenis() ,transaksi.getBanyak(), lk.format(transaksi.getHarga()));
                    }
                    System.out.printf("\n%s\n\tInformasi Perkebunan Sekarang\n%s\n", divider, divider);
                    System.out.printf("Apel\t\t: %.0f hektar\n", apel.getJumlah());
                    System.out.printf("Kelapa Sawit\t: %.0f hektar\n\n", kelapaSawit.getJumlah());
                    break;

                default:
                    break;
            }
        }
    }

    static void menu() {
        System.out.println("1. Informasi Peternakan dan Perkebunan");
        System.out.println("2. Pembelian Hewan Ternak");
        System.out.println("3. Pembelian Tanah Perkebunan");
        System.out.print("Masukkan pilihan menu: ");
    }
}
