import java.util.Scanner;

public class App {
    static final double ppn = 0.1;
    static Hewan hewan1, hewan2, hewan3;
    public static void main(String[] args) {

        hewan1 = new Hewan("Bebek", "Telur Biasa", 15, 2, 2000);
        hewan2 = new Hewan("Domba", "Bulu Hitam", 4, 4, 15000);
        hewan3 = new Hewan("Unta", "Susu Putih", 3, 5, 60000);
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");
            System.out.print("Masukkan Menu Anda: ");
            int pilihan = input.nextInt();
            System.out.println("=".repeat(50));

            switch(pilihan){
                case 1:
                    hewan1.printInformasi();
                    hewan2.printInformasi();
                    hewan3.printInformasi();
                    break;
                case 2:
                    hewan1.printPemasukan();
                    hewan2.printPemasukan();
                    hewan3.printPemasukan();
                    System.out.printf("Total Pemasukan : %d\n" + "=".repeat(50) + "\n", hewan1.getPemasukan()+hewan2.getPemasukan()+hewan3.getPemasukan());
                    break;
                case 3:
                    hewan1.printHargaPajak(ppn);
                    hewan2.printHargaPajak(ppn);
                    hewan3.printHargaPajak(ppn);
                    System.out.printf("Total Pemasukan : %d\n" + "=".repeat(50) + "\n", hewan1.getHargaPajak(ppn)+hewan2.getHargaPajak(ppn)+hewan3.getHargaPajak(ppn));
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
