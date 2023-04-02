import java.util.Scanner;

public class Main {
    static final double PPN = 0.1; // Tetapkan ppn menggunakan final di class Main
    static Hewan bebek; // Membuat objek menggunakan static di class Main
    static Hewan unta;
    static Hewan domba;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        bebek = new Hewan("Bebek", "Ras Telur Biasa", 15, 2, 30, 2000);
        unta =  new Hewan("Unta", "Susu Putih\t", 3, 5, 15, 60000);
        domba = new Hewan("Domba", "Bulu Hitam", 4, 4, 16,  15000);

    int pilihan;
    do {
        System.out.println("\nMenu:");
        System.out.println("1. Menampilkan Informasi Peternakan");
        System.out.println("2. Menampilkan Total Pemasukan Harian");
        System.out.println("3. Menampilkan Harga Setelah PPN");
        System.out.println("4. Keluar");

        System.out.print("Masukkan Menu Anda: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\nData Hewan:");
                System.out.println(bebek);
                System.out.println(unta);
                System.out.println(domba);
                break;
            case 2:
                System.out.println("\nPemasukan Harian:");
                System.out.println("Bebek: Rp " + (int) (bebek.pemasukanHarian()));
                System.out.println("Unta: Rp " + (int) (unta.pemasukanHarian()));
                System.out.println("Domba: Rp " + (int) (domba.pemasukanHarian()));
                System.out.println("Total: Rp " + (int) (totalPemasukanHarian(bebek, unta, domba)));
                break;
            case 3:
                System.out.println("\nPemasukan Harian dengan PPN:");
                System.out.println("Bebek: Rp " + (int) (bebek.pemasukanHarianPPN()));
                System.out.println("Unta: Rp " + (int) (unta.pemasukanHarianPPN()));
                System.out.println("Domba: Rp " + (int) (domba.pemasukanHarianPPN()));
                System.out.println("Total: Rp " + (int) (totalPemasukanHarianPPN(bebek, unta, domba)));
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan program ini.");
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
                break;
        }
    } while (pilihan != 4);
}

public static double totalPemasukanHarian(Hewan bebek, Hewan unta, Hewan domba) {
    return bebek.pemasukanHarian() + unta.pemasukanHarian() + domba.pemasukanHarian();
}

public static double totalPemasukanHarianPPN(Hewan bebek, Hewan unta, Hewan domba) {
    return bebek.pemasukanHarianPPN() + unta.pemasukanHarianPPN() + domba.pemasukanHarianPPN();
}

}

