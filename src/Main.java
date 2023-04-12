import java.util.Scanner;

public class Main {
    static Scanner inputScanner = new Scanner(System.in);

    static final int ppn = 10;

    static Bebek bebekBiasa = new Bebek("Telur Biasa", 15, 2, 2000);    ;
    static Domba dombaHitam = new Domba("Bulu Hitam", 4, 4, 15000);;
    static Unta untaPutih = new Unta("Susu Putih", 3, 5, 60000);;

    public static void main(String[] args) throws Exception {

        boolean loopMenu = true;
        do {
            System.out.println("Menu:");
            System.out.println("1. Menampilkan Informasi Peternakan");
            System.out.println("2. Menampilkan Total Pemasukan Harian");
            System.out.println("3. Menampilkan Harga Setelah PPN");
            System.out.println("4. Exit");

            System.out.print("Masukkan Menu Anda : ");
            String pilihan = inputScanner.nextLine();
            breakLine();
            
            switch (pilihan) {
                case "1":
                    showInformasiPeternakan();
                    break;

                case "2":
                    showPemasukanHarian();
                    break;

                case "3":
                    showHargaSetelahPpn();
                    break;

                case "4":
                    loopMenu = false;
                    break;
            
                default:
                    System.out.println("Masukkan tidak valid, Silahkan coba lagi");
                    break;
            }

        } while (loopMenu);
    }

    public static void showInformasiPeternakan() {
        System.out.println(bebekBiasa);
        breakLine();
        System.out.println(dombaHitam);
        breakLine();
        System.out.println(untaPutih);
        breakLine();
    }

    public static void showPemasukanHarian() {
        System.out.printf("Jenis\t\t: %s | %s\n", bebekBiasa.getJenis(), bebekBiasa.getRas());
        System.out.printf("Pemasukan\t: %.0f\n", bebekBiasa.getTotalPemasukan());
        System.out.println("-".repeat(50));
        System.out.printf("Jenis\t\t: %s | %s\n", dombaHitam.getJenis(), dombaHitam.getRas());
        System.out.printf("Pemasukan\t: %.0f\n", dombaHitam.getTotalPemasukan());
        System.out.println("-".repeat(50));
        System.out.printf("Jenis\t\t: %s | %s\n", untaPutih.getJenis(), untaPutih.getRas());
        System.out.printf("Pemasukan\t: %.0f\n", untaPutih.getTotalPemasukan());
        System.out.println("-".repeat(50));
        System.out.printf("Total Pemasukan\t: %.0f\n", bebekBiasa.getTotalPemasukan() + dombaHitam.getTotalPemasukan() + untaPutih.getTotalPemasukan());
        breakLine();
    }

    public static void showHargaSetelahPpn() {
        bebekBiasa.setPpn(ppn);
        dombaHitam.setPpn(ppn);
        untaPutih.setPpn(ppn);
        showPemasukanHarian();
    }

    public static void breakLine() {
        System.out.println("=".repeat(50));
    }

}
