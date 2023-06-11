import java.util.Scanner;

public class Peternakan implements Ternak, Harga {
    private int jumlahBebek = 15;
    private int jumlahDomba = 4;
    private int jumlahUnta = 3;
    String[] ternak = { "Bebek", "Domba", "Unta" };

    public void informasiPeternakan() {
        System.out.println("=".repeat(40));
        System.out.printf("%15s%n", "Informasi Peternakan dan Perkebunan");
        System.out.println("=".repeat(40));
        System.out.println("Bebek\t\t: " + jumlahBebek + " ekor");
        System.out.println("Domba\t\t: " + jumlahDomba + " ekor");
        System.out.println("Unta\t\t: " + jumlahUnta + " ekor");
    }

    public void beliTernak() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.println("Pembelian Hewan Ternak");
        System.out.println("=".repeat(40));
        System.out.println("1. Bebek");
        System.out.println("2. Domba");
        System.out.println("3. Unta");
        System.out.print("Masukkan pilihan hewan (nomor): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan banyak hewan: ");
        int jumlah = scanner.nextInt();
        System.out.println();

        int biaya = 0;
        String jenis;
        switch (pilihan) {
            case 1:
                jenis = ternak[0];
                jumlahBebek += jumlah;
                biaya = jumlah * hargaBebek;
                break;
            case 2:
                jenis = ternak[1];
                jumlahDomba += jumlah;
                biaya = jumlah * hargaDomba;
                break;
            case 3:
                jenis = ternak[2];
                jumlahUnta += jumlah;
                biaya = jumlah * hargaUnta;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("=".repeat(40));
        System.out.printf("%15s%n", "Nota Pembelian Hewan Ternak");
        System.out.println("=".repeat(40));
        System.out.println(jenis + "\tx(" + jumlah + ")   : Rp " + biaya);
        System.out.println();

        System.out.println("=".repeat(40));
        System.out.printf("%15s%n", "Informasi Peternakan Sekarang");
        System.out.println("=".repeat(40));
        System.out.println("Bebek\t: " + jumlahBebek + " ekor");
        System.out.println("Domba\t: " + jumlahDomba + " ekor");
        System.out.println("Unta\t: " + jumlahUnta + " ekor");
    }
}
