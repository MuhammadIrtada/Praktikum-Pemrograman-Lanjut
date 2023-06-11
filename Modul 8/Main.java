import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Peternakan peternakan = new Peternakan();
        Perkebunan perkebunan = new Perkebunan();

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Informasi Peterankan dan Perkebunan");
            System.out.println("2. Pembelian hewan ternak");
            System.out.println("3. Pembelian Tanah Perkebunan");
            System.out.print("Masukkan pilihan menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    peternakan.informasiPeternakan();
                    perkebunan.informasiPerkebunan();
                    break;
                case 2:
                    peternakan.beliTernak();
                    break;
                case 3:
                    perkebunan.beliTanaman();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}