import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        pakKiw kiw = new pakKiw(15, 4, 3, 5, 6);
        Scanner scanner = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("========== Peternakan dan Perkebunan Pak Kiw ==========");
            System.out.println("Pilihan Menu:");
            System.out.println("1. Informasi Peternakan dan Perkebunan");
            System.out.println("2. Pembelian hewan ternak");
            System.out.println("3. Pembelian tanah perkebunan");
            System.out.println("0. Keluar dari program");
            System.out.print("Masukkan pilihan Anda: ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    kiw.tampilkanStatus();
                    break;
                case 2:
                    kiw.beliStok();
                    break;
                case 3:
                    kiw.beliLahan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 0);
    }
}

