
import java.util.Scanner;

public class MainPeternakanV4 {

    static PeternakanV4 bebek;
    static PeternakanV4 unta;
    static PeternakanV4 domba;
    static final double ppn = 1.1;

    public static void main(String[] args) {
        Scanner elma = new Scanner(System.in);
        PeternakanV4 peternak[] = new PeternakanV4[3];
        bebek = new PeternakanV4("Bebek", "Telur Biasa", 15, "Telur", 2, "butir", 2000);
        domba = new PeternakanV4("Domba", "Bulu Hitam", 4, "Bulu", 4, "kg\t", 15000);
        unta = new PeternakanV4("Unta", "Susu Putih", 3, "Susu", 5, "liter", 60000);

        peternak[0] = bebek;
        peternak[1] = domba;
        peternak[2] = unta;

        int pilihan;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");
            System.out.print("Masukkan Menu Anda : ");
            pilihan = elma.nextInt();
            System.out.println("=".repeat(52));

            if (pilihan == 1) {
                PeternakanV4.print1(peternak);
            } else if (pilihan == 2) {
                PeternakanV4.print2(peternak);
            } else if (pilihan == 3) {
                PeternakanV4.print3(peternak);

            } else if (pilihan == 4) {
                System.out.println("Terimakasih Telah Menggunakan Program Kami");
                break;
            } else {
                break;
            }
        }
    }

}

