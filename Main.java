package Dinda;

import java.util.Scanner;

public class Main {
    static final double PPN = 10.0;

    static Peternakan peternakan;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        peternakan = new Peternakan(15, 3, 4);

        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan informasi peternakan");
            System.out.println("2. Tampilkan pemasukan harian");
            System.out.println("3. Tampilkan harga setelah PPN");
            System.out.println("4. Keluar");

            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    peternakan.tampilkanInformasiPeternakan();
                    break;
                case 2:
                    peternakan.tampilkanTotalPemasukanHarian();
                    break;
                case 3:
                    peternakan.tampilkanHargaSetelahPpn(PPN);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
            System.out.println();
        }

        input.close();
    }
}